import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;

public class Main {
    private static final int PORT = 8080;
    private static final StudentManager manager = new StudentManager();

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);

        // Serve REST API
        server.createContext("/api/students", new StudentApiHandler());

        // Serve Frontend HTML at http://localhost:8080/
        server.createContext("/", new FrontendHandler());

        server.setExecutor(null);
        System.out.println("Backend Server running at: http://localhost:" + PORT + "/");
        System.out.println("API Endpoint available at: http://localhost:" + PORT + "/api/students");
        server.start();
    }

    static class FrontendHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Checks for both possible HTML filenames
            File file = new File("html (1).html");
            if (!file.exists()) {
                file = new File("index.html");
            }

            if (!file.exists()) {
                String notFound = "<h1>Frontend HTML file not found in project root folder</h1>";
                exchange.sendResponseHeaders(404, notFound.length());
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(notFound.getBytes());
                }
                return;
            }

            byte[] bytes = Files.readAllBytes(file.toPath());
            exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
            exchange.sendResponseHeaders(200, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        }
    }

    static class StudentApiHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*");
            exchange.getResponseHeaders().set("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            exchange.getResponseHeaders().set("Access-Control-Allow-Headers", "Content-Type");

            String method = exchange.getRequestMethod().toUpperCase();
            if ("OPTIONS".equalsIgnoreCase(method)) {
                exchange.sendResponseHeaders(204, -1);
                return;
            }

            String path = exchange.getRequestURI().getPath();
            String[] parts = path.split("/");

            try {
                if (parts.length == 3 && parts[2].equals("students")) {
                    if ("GET".equals(method)) {
                        List<Student> list = manager.getAllStudents();
                        sendJson(exchange, 200, toJsonArray(list));
                    } else if ("POST".equals(method)) {
                        Map<String, String> params = parseFormData(exchange.getRequestBody());
                        int id = Integer.parseInt(params.get("studentId"));
                        String name = params.get("name");
                        int age = Integer.parseInt(params.get("age"));
                        int classNo = Integer.parseInt(params.get("classNo"));
                        double marks = Double.parseDouble(params.get("marks"));

                        Student s = new Student(id, name, age, classNo, marks);
                        if (manager.addStudent(s)) {
                            sendJson(exchange, 201, "{\"message\":\"Student added successfully!\"}");
                        } else {
                            sendJson(exchange, 400, "{\"message\":\"Student ID already exists or failed to save.\"}");
                        }
                    }
                } else if (parts.length == 4 && parts[2].equals("students")) {
                    int studentId = Integer.parseInt(parts[3]);

                    if ("GET".equals(method)) {
                        Student s = manager.searchStudent(studentId);
                        if (s != null) {
                            sendJson(exchange, 200, toJsonObject(s));
                        } else {
                            sendJson(exchange, 404, "{\"message\":\"Student not found.\"}");
                        }
                    } else if ("PUT".equals(method)) {
                        Map<String, String> params = parseFormData(exchange.getRequestBody());
                        String name = params.get("name");
                        int age = Integer.parseInt(params.get("age"));
                        int classNo = Integer.parseInt(params.get("classNo"));
                        double marks = Double.parseDouble(params.get("marks"));

                        if (manager.updateStudent(studentId, name, age, classNo, marks)) {
                            sendJson(exchange, 200, "{\"message\":\"Student updated successfully!\"}");
                        } else {
                            sendJson(exchange, 400, "{\"message\":\"Could not update student.\"}");
                        }
                    } else if ("DELETE".equals(method)) {
                        if (manager.deleteStudent(studentId)) {
                            sendJson(exchange, 200, "{\"message\":\"Student deleted successfully!\"}");
                        } else {
                            sendJson(exchange, 404, "{\"message\":\"Student not found or deletion failed.\"}");
                        }
                    }
                }
            } catch (Exception e) {
                sendJson(exchange, 500, "{\"message\":\"Server error: " + e.getMessage() + "\"}");
            }
        }
    }

    private static void sendJson(HttpExchange exchange, int statusCode, String response) throws IOException {
        exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
        byte[] bytes = response.getBytes(StandardCharsets.UTF_8);
        exchange.sendResponseHeaders(statusCode, bytes.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(bytes);
        }
    }

    private static Map<String, String> parseFormData(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
        StringBuilder body = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            body.append(line);
        }
        Map<String, String> params = new HashMap<>();
        if (body.length() > 0) {
            String[] pairs = body.toString().split("&");
            for (String pair : pairs) {
                String[] kv = pair.split("=");
                String key = URLDecoder.decode(kv[0], StandardCharsets.UTF_8.name());
                String value = kv.length > 1 ? URLDecoder.decode(kv[1], StandardCharsets.UTF_8.name()) : "";
                params.put(key, value);
            }
        }
        return params;
    }

    private static String toJsonObject(Student s) {
        return String.format(
                "{\"studentId\":%d,\"name\":\"%s\",\"age\":%d,\"classNo\":%d,\"marks\":%.2f}",
                s.getStudentId(),
                s.getName().replace("\"", "\\\""),
                s.getAge(),
                s.getClassNo(),
                s.getMarks()
        );
    }

    private static String toJsonArray(List<Student> list) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(toJsonObject(list.get(i)));
            if (i < list.size() - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}