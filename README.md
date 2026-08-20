<p align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=180&section=header&text=Student%20Management%20System&fontSize=40&fontAlignY=35&animation=twinkling" width="100%"/>

</p>

<p align="center">

### 🚀 A Full-Stack Student Record Management Application

**Java • JDBC • MySQL • HTML • CSS • JavaScript**

</p>

<p align="center">

<a href="#-features">
<img src="https://img.shields.io/badge/Features-Explore-blueviolet?style=for-the-badge">
</a>

<a href="#-installation">
<img src="https://img.shields.io/badge/Setup-Guide-blue?style=for-the-badge">
</a>

<a href="#-team">
<img src="https://img.shields.io/badge/Team-3%20Members-success?style=for-the-badge">
</a>

</p>

---

## 📌 About

**Student Management System** is a full-stack web application created to manage student records through a simple and interactive dashboard.

The application connects a **Java backend** with a **MySQL database** and provides a web-based frontend for performing student management operations.

### 💡 Main Goal

> Make student record management simple, organized, and easy to use.

---

# ✨ Features

| Feature                | Description                              |
| ---------------------- | ---------------------------------------- |
| 👨‍🎓 **Add Student**  | Create new student records               |
| 📋 **View Students**   | Display all student records              |
| 🔍 **Search Student**  | Search using Student ID                  |
| ✏️ **Update Student**  | Modify existing information              |
| 🗑️ **Delete Student** | Remove student records                   |
| 📊 **Statistics**      | Total students & average marks           |
| 🌐 **Web Dashboard**   | Interactive browser interface            |
| 🔗 **API**             | Java HTTP API for frontend communication |

---

# 🧠 How It Works

```text
             👤 USER
                │
                ▼
       ┌─────────────────┐
       │    FRONTEND     │
       │                 │
       │ HTML / CSS / JS │
       └────────┬────────┘
                │
                │ HTTP Requests
                ▼
       ┌─────────────────┐
       │     BACKEND     │
       │                 │
       │      Java       │
       │    HTTP API     │
       └────────┬────────┘
                │
                │ JDBC
                ▼
       ┌─────────────────┐
       │     MySQL       │
       │    Database     │
       └─────────────────┘
```

---

# 🛠️ Tech Stack

<p align="center">

<img src="https://skillicons.dev/icons?i=java,mysql,html,css,js,git,github" />

</p>

### Backend

* ☕ Java
* 🔌 JDBC
* 🌐 Java HTTP Server
* 🔗 REST-style API

### Database

* 🗄️ MySQL
* 📊 SQL
* 🔐 Prepared Statements

### Frontend

* 🌐 HTML5
* 🎨 CSS3
* ⚡ JavaScript
* 🔄 Fetch API

---

# 🔗 API Endpoints

```text
GET     /api/students
POST    /api/students

GET     /api/students/{id}
PUT     /api/students/{id}
DELETE  /api/students/{id}
```

### Example

```http
GET http://localhost:8080/api/students
```

The Java backend starts an HTTP server on port `8080` and exposes the student API.

---

# 🗄️ Database

Database:

```text
SMS
```

Table:

```text
students
```

### Table Structure

```text
┌────────────┬─────────────┐
│ Column     │ Type        │
├────────────┼─────────────┤
│ studentId  │ INT         │
│ name       │ VARCHAR     │
│ age        │ INT         │
│ classNo    │ INT         │
│ marks      │ DOUBLE      │
└────────────┴─────────────┘
```

The project uses JDBC to connect Java with MySQL.

---

# 📂 Project Structure

```text
Student-Management-System/
│
├── 📄 Main.java
├── 📄 Student.java
├── 📄 StudentManager.java
├── 📄 DBconnection.java
│
├── 🌐 index.html
│
├── 📄 new_sms.iml
│
├── 📄 README.md
│
└── 📁 screenshots/
    ├── dashboard.png
    ├── students.png
    └── add-student.png
```

---

# ⚙️ Backend Architecture

### `Main.java`

Responsible for:

* Starting the Java HTTP server
* Serving the frontend
* Handling API requests
* Returning JSON responses
* Connecting API routes with `StudentManager`

### `Student.java`

Acts as the **Student model** containing:

```text
studentId
name
age
classNo
marks
```

### `StudentManager.java`

Handles database operations:

```text
➕ Add
📋 Get All
🔍 Search
✏️ Update
🗑️ Delete
```

### `DBconnection.java`

Handles the MySQL connection through JDBC.

---

# 🎨 Frontend

The frontend contains:

```text
🏠 Dashboard
📋 Student List
➕ Add Student
🔍 Search Student
✏️ Edit Student
🗑️ Delete Student
📊 Statistics
```

It communicates with the backend using JavaScript `fetch()` requests.

---

# 👥 Our Team

## 👨‍💻 Backend & Database

<a href="https://github.com/Iamrudrx">

<img src="https://github.com/Iamrudrx.png?size=160" width="120" height="120" style="border-radius:50%">

</a>

### Rudrapratap Singh Rajpoot

**GitHub:** [@Iamrudrx](https://github.com/Iamrudrx)

**Role:** Backend + Database

```text
☕ Java Backend
🔗 API Development
🗄️ MySQL Database
🔌 JDBC
🔄 CRUD Operations
🧪 Backend Testing
```

---

## 🎨 Frontend Developer

<a href="https://github.com/sahna4352">

<img src="https://github.com/sahna4352.png?size=160" width="120" height="120" style="border-radius:50%">

</a>

### sahna4352

**GitHub:** [@sahna4352](https://github.com/sahna4352)

**Role:** Frontend

```text
🌐 HTML
🎨 CSS
⚡ JavaScript
🖥️ UI Design
📊 Dashboard
🔗 Frontend Integration
```

---

## 🤝 Third Team Member

### 👤 Project Contributor

**Role:** Testing & Integration

```text
🧪 Testing
🐛 Bug Finding
🔗 Integration
📚 Documentation
```

> Replace this section with the third member's GitHub username and profile image.

---

# 🖼️ Project Screenshots

> Add your actual screenshots inside the `screenshots` folder.

### 🏠 Dashboard

<p align="center">

<img src="./screenshots/dashboard.png" width="90%" alt="Student Management Dashboard">

</p>

### 📋 Student Records

<p align="center">

<img src="./screenshots/students.png" width="90%" alt="Student Records">

</p>

### ➕ Add Student

<p align="center">

<img src="./screenshots/add-student.png" width="90%" alt="Add Student">

</p>

---

# 🚀 Installation

## 1. Clone

```bash
git clone https://github.com/YOUR-USERNAME/Student-Management-System.git
```

```bash
cd Student-Management-System
```

## 2. Create Database

```sql
CREATE DATABASE SMS;

USE SMS;

CREATE TABLE students (
    studentId INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    classNo INT NOT NULL,
    marks DOUBLE NOT NULL
);
```

## 3. Configure MySQL

Open:

```text
DBconnection.java
```

Change:

```java
private static final String PASSWORD = "YOUR_PASSWORD";
```

⚠️ **Do not upload your real MySQL password to GitHub.**

## 4. Run

Run:

```text
Main.java
```

Then open:

```text
http://localhost:8080/
```

API:

```text
http://localhost:8080/api/students
```

---

# 🔐 Security

Before uploading to GitHub:

* ❌ Don't upload database passwords
* ❌ Don't upload API keys
* ❌ Don't upload `.env` files containing secrets
* ❌ Don't upload private credentials

Use:

```text
.gitignore
```

for sensitive configuration files.

---

# 📈 Future Improvements

```text
🔐 User Authentication
👨‍🏫 Teacher Login
📊 Advanced Analytics
📈 Performance Charts
📱 Better Mobile UI
🔎 Advanced Filtering
📄 Export to PDF/Excel
☁️ Cloud Deployment
🔒 Environment Variables
📚 Swagger/OpenAPI Documentation
```

---

# 🎯 Learning Outcomes

This project helped us practice:

```text
☕ Java OOP
🔌 JDBC
🗄️ MySQL
📝 SQL
🌐 HTTP APIs
🔗 Frontend ↔ Backend Communication
⚡ JavaScript Fetch API
🎨 UI Development
🐙 Git & GitHub
🤝 Team Collaboration
```

---

# ⭐ Support

If you found this project useful:

<p align="center">

### ⭐ Give this repository a Star!

### 🍴 Fork it • 🐛 Report Issues • 💡 Suggest Improvements

</p>

---

<p align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=120&section=footer&animation=twinkling"/>

### 🚀 Built with teamwork, Java & lots of debugging ☕

</p>

<p align="center">

**© 2026 Student Management System**

</p>
