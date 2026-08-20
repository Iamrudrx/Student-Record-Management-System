import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    // Add Student
    public boolean addStudent(Student student) {
        String sql = "INSERT INTO students(studentId, name, age, classNo, marks) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setInt(4, student.getClassNo());
            ps.setDouble(5, student.getMarks());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }

    // Get All Students
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection con = DBconnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("studentId"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getInt("classNo"),
                        rs.getDouble("marks")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return list;
    }

    // Search Student
    public Student searchStudent(int studentId) {
        String sql = "SELECT * FROM students WHERE studentId = ?";
        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Student(
                        rs.getInt("studentId"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getInt("classNo"),
                        rs.getDouble("marks")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return null;
    }

    // Update Student
    public boolean updateStudent(int studentId, String name, int age, int classNo, double marks) {
        String sql = "UPDATE students SET name=?, age=?, classNo=?, marks=? WHERE studentId=?";
        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, classNo);
            ps.setDouble(4, marks);
            ps.setInt(5, studentId);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }

    // Delete Student
    public boolean deleteStudent(int studentId) {
        String sql = "DELETE FROM students WHERE studentId=?";
        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }
}