<p align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:7c3aed,100:06b6d4&height=220&section=header&text=Student%20Management%20System&fontSize=42&fontColor=ffffff&fontAlignY=35&animation=twinkling" width="100%"/>

</p>

<p align="center">

## 🚀 Full-Stack Student Record Management Application

### ☕ Java • 🔌 JDBC • 🗄️ MySQL • 🌐 HTML • 🎨 CSS • ⚡ JavaScript

</p>

<p align="center">

<img src="https://img.shields.io/badge/Java-Backend-orange?style=for-the-badge&logo=openjdk&logoColor=white">

<img src="https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql&logoColor=white">

<img src="https://img.shields.io/badge/HTML5-Frontend-E34F26?style=for-the-badge&logo=html5&logoColor=white">

<img src="https://img.shields.io/badge/CSS3-Styling-1572B6?style=for-the-badge&logo=css3&logoColor=white">

<img src="https://img.shields.io/badge/JavaScript-Logic-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">

</p>

<p align="center">

<img src="https://img.shields.io/badge/Project-Full--Stack-blueviolet?style=flat-square">

<img src="https://img.shields.io/badge/Status-Completed-success?style=flat-square">

<img src="https://img.shields.io/badge/Year-2026-blue?style=flat-square">

</p>

---

# 📌 About The Project

**Student Management System** is a full-stack web application created to manage student records through a simple and interactive dashboard.

The application connects a **Java backend** with a **MySQL database** and provides a web-based frontend for performing student management operations.

The system allows users to add, view, search, update, and delete student records.

### 💡 Main Goal

> Make student record management simple, organized, and easy to use.

---

# ✨ Features

<table align="center">

<tr>

<td align="center" width="180">

### 👨‍🎓

<b>Add Student</b>

<br>

Create new student records

</td>

<td align="center" width="180">

### 📋

<b>View Students</b>

<br>

Display all records

</td>

<td align="center" width="180">

### 🔍

<b>Search</b>

<br>

Find students by ID

</td>

<td align="center" width="180">

### ✏️

<b>Update</b>

<br>

Modify student details

</td>

<td align="center" width="180">

### 🗑️

<b>Delete</b>

<br>

Remove records

</td>

</tr>

</table>

### 📊 Dashboard Features

* 👥 Total Students
* 📈 Average Marks
* 🏫 Total Classes
* 📋 Student Records
* 🔍 Student Search
* ✏️ Edit Student
* 🗑️ Delete Student

---

# 🧠 How It Works

```text
                         👤 USER
                           │
                           ▼
              ┌─────────────────────────┐
              │       🎨 FRONTEND       │
              │                         │
              │      HTML / CSS / JS    │
              │                         │
              │       Dashboard        │
              │       Student List     │
              │       Add Student      │
              │       Search Student   │
              └────────────┬────────────┘
                           │
                           │ HTTP Requests
                           │ Fetch API
                           ▼
              ┌─────────────────────────┐
              │       ☕ BACKEND        │
              │                         │
              │          Java           │
              │       HTTP Server       │
              │        API Layer        │
              └────────────┬────────────┘
                           │
                           │ JDBC
                           ▼
              ┌─────────────────────────┐
              │       🗄️ DATABASE       │
              │                         │
              │          MySQL          │
              │                         │
              │        students         │
              └─────────────────────────┘
```

---

# 🛠️ Tech Stack

<p align="center">

<img src="https://skillicons.dev/icons?i=java,mysql,html,css,js,git,github" />

</p>

## ☕ Backend

* ☕ Java
* 🔌 JDBC
* 🌐 Java HTTP Server
* 🔗 REST-style API
* 📦 JSON responses

## 🗄️ Database

* 🐬 MySQL
* 📊 SQL
* 🔐 Prepared Statements
* 🔄 CRUD operations

## 🎨 Frontend

* 🌐 HTML5
* 🎨 CSS3
* ⚡ JavaScript
* 🔄 Fetch API
* 📱 Responsive layout

---

# 🔗 API Endpoints

```text
┌──────────┬───────────────────────┬────────────────────┐
│ Method   │ Endpoint              │ Purpose            │
├──────────┼───────────────────────┼────────────────────┤
│ GET      │ /api/students         │ Get all students   │
│ POST     │ /api/students         │ Add student        │
│ GET      │ /api/students/{id}    │ Search student     │
│ PUT      │ /api/students/{id}    │ Update student     │
│ DELETE   │ /api/students/{id}    │ Delete student     │
└──────────┴───────────────────────┴────────────────────┘
```

### 📋 Get All Students

```http
GET /api/students
```

Example:

```text
http://localhost:8080/api/students
```

### ➕ Add Student

```http
POST /api/students
```

Example data:

```text
studentId=101
name=Rahul Sharma
age=18
classNo=12
marks=85.5
```

### 🔍 Search Student

```http
GET /api/students/101
```

### ✏️ Update Student

```http
PUT /api/students/101
```

Example:

```text
name=Rahul Singh
age=19
classNo=12
marks=91
```

### 🗑️ Delete Student

```http
DELETE /api/students/101
```

---

# 🗄️ Database

## Database Name

```text
SMS
```

## Main Table

```text
students
```

### 📊 Table Structure

| Column      | Type    | Description       |
| ----------- | ------- | ----------------- |
| `studentId` | INT     | Unique student ID |
| `name`      | VARCHAR | Student name      |
| `age`       | INT     | Student age       |
| `classNo`   | INT     | Student class     |
| `marks`     | DOUBLE  | Student marks     |

---

# 🧾 SQL Setup

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

---

# 📂 Project Structure

```text
Student-Management-System/
│
├── 📖 README.md
│
├── 🖼️ Student Management Dashboard.png
├── 🖼️ Student Records.png
│
├── ☕ Main.java
├── ☕ Student.java
├── ☕ StudentManager.java
├── 🗄️ DBconnection.java
│
└── ⚙️ new_sms.iml
```

---

# ☕ Backend Architecture

## `Main.java`

The main backend file is responsible for:

* 🚀 Starting the Java HTTP server
* 🌐 Serving the frontend
* 🔗 Handling API requests
* 📦 Returning JSON responses
* 🔄 Connecting API routes with `StudentManager`

The backend runs on:

```text
http://localhost:8080/
```

API:

```text
http://localhost:8080/api/students
```

---

## 👨‍🎓 `Student.java`

`Student.java` represents the student model.

```text
Student
│
├── studentId
├── name
├── age
├── classNo
└── marks
```

The class contains:

* Constructor
* Getters
* Setters
* `toString()`

---

## 🧠 `StudentManager.java`

`StudentManager.java` handles the database operations.

```text
StudentManager
│
├── ➕ addStudent()
│
├── 📋 getAllStudents()
│
├── 🔍 searchStudent()
│
├── ✏️ updateStudent()
│
└── 🗑️ deleteStudent()
```

---

## 🗄️ `DBconnection.java`

`DBconnection.java` manages the connection between the Java backend and MySQL database using JDBC.

```text
Java
 │
 │ JDBC
 ▼
MySQL
 │
 ▼
SMS Database
 │
 ▼
students Table
```

---

# 🎨 Frontend

The frontend provides an interactive dashboard.

```text
🏠 Dashboard
      │
      ├── 👥 Total Students
      ├── 📈 Average Marks
      └── 🏫 Total Classes
     
📋 Student List
      │
      ├── ✏️ Edit
      └── 🗑️ Delete

➕ Add Student

🔍 Search Student
```

The frontend communicates with the Java backend using JavaScript `fetch()` requests.

---

# 🖼️ Project Screenshots

## 🏠 Student Management Dashboard

<p align="center">

<img src="./Student Management Dashboard.png" width="95%" alt="Student Management Dashboard">

</p>

<p align="center">

<b>Interactive Student Management Dashboard</b>

</p>

---

## 📋 Student Records

<p align="center">

<img src="./Student Records.png" width="95%" alt="Student Records">

</p>

<p align="center">

<b>Student Records Management Interface</b>

</p>

---

# 🖥️ Application Preview

<table align="center">

<tr>

<td align="center" width="50%">

<img src="./Student Management Dashboard.png" width="100%" alt="Dashboard">

<br><br>

### 🏠 Dashboard

</td>

<td align="center" width="50%">

<img src="./Student Records.png" width="100%" alt="Student Records">

<br><br>

### 📋 Student Records

</td>

</tr>

</table>

---

# 🔄 CRUD Flow

```text
                     👨‍🎓 STUDENT
                          │
                          ▼
                 ┌────────────────┐
                 │    CREATE      │
                 │   ➕ Add       │
                 └───────┬────────┘
                         │
                         ▼
                 ┌────────────────┐
                 │     READ       │
                 │ 📋 View/Search │
                 └───────┬────────┘
                         │
               ┌─────────┴─────────┐
               │                   │
               ▼                   ▼
        ┌──────────────┐    ┌──────────────┐
        │   UPDATE     │    │    DELETE    │
        │   ✏️ Edit    │    │   🗑️ Remove  │
        └──────────────┘    └──────────────┘
```

---

# 👥 Our Team

<p align="center">

## 🚀 Three People • One Project • One Goal

</p>

<br>

<table align="center">

<tr>

<td align="center" width="350">

<img src="https://github.com/Iamrudrx.png?size=300" width="160" height="160" alt="Rudrapratap Singh Rajpoot">

<br><br>

<h2>👨‍💻 Rudrapratap Singh Rajpoot</h2>

<p>

<b>Backend & Database Developer</b>

</p>

<p>

<img src="https://img.shields.io/badge/Backend-Java-orange?style=flat-square">

<img src="https://img.shields.io/badge/Database-MySQL-blue?style=flat-square">

</p>

<p>

☕ Java Backend<br>
🗄️ MySQL Database<br>
🔌 JDBC<br>
🔗 API Development<br>
🔄 CRUD Operations<br>
🧪 Backend Testing

</p>

<a href="https://github.com/Iamrudrx">

<img src="https://img.shields.io/badge/GitHub-Iamrudrx-181717?style=for-the-badge&logo=github&logoColor=white">

</a>

</td>

<td width="60"></td>

<td align="center" width="350">

<img src="https://github.com/sahna4352.png?size=300" width="160" height="160" alt="sahna4352">

<br><br>

<h2>🎨 sahna4352</h2>

<p>

<b>Frontend Developer</b>

</p>

<p>

<img src="https://img.shields.io/badge/Frontend-HTML%20%7C%20CSS-E34F26?style=flat-square">

<img src="https://img.shields.io/badge/JavaScript-UI-F7DF1E?style=flat-square">

</p>

<p>

🌐 HTML<br>
🎨 CSS<br>
⚡ JavaScript<br>
🖥️ UI Design<br>
📊 Dashboard<br>
🔗 Frontend Integration

</p>

<a href="https://github.com/sahna4352">

<img src="https://img.shields.io/badge/GitHub-sahna4352-181717?style=for-the-badge&logo=github&logoColor=white">

</a>

</td>

</tr>

</table>

<br>

---

## 🤝 Third Team Member

<table align="center">

<tr>

<td align="center" width="350">

<img src="https://ui-avatars.com/api/?name=Project+Contributor&size=300&background=7c3aed&color=ffffff&bold=true" width="160" height="160" alt="Project Contributor">

<br><br>

<h2>🤝 Project Contributor</h2>

<p>

<b>Testing & Integration</b>

</p>

<p>

🧪 Testing<br>
🐛 Bug Finding<br>
🔗 Integration<br>
📚 Documentation

</p>

<img src="https://img.shields.io/badge/Team-Member-blueviolet?style=for-the-badge">

</td>

</tr>

</table>

> 📝 Replace the placeholder above with the third member's actual GitHub username and profile image when you have it.

---

# 🏆 Team Contributions

<table align="center">

<tr>

<th>👤 Member</th>
<th>💼 Role</th>
<th>🛠️ Main Responsibilities</th>

</tr>

<tr>

<td align="center">

👨‍💻 <b>Rudrapratap Singh Rajpoot</b>

</td>

<td align="center">

Backend + Database

</td>

<td>

☕ Java • JDBC • MySQL • API • CRUD

</td>

</tr>

<tr>

<td align="center">

🎨 <b>sahna4352</b>

</td>

<td align="center">

Frontend

</td>

<td>

HTML • CSS • JavaScript • UI • Dashboard

</td>

</tr>

<tr>

<td align="center">

🤝 <b>Project Contributor</b>

</td>

<td align="center">

Testing + Integration

</td>

<td>

Testing • Debugging • Documentation

</td>

</tr>

</table>

---

# 🚀 Installation

## 1️⃣ Clone Repository

```bash
git clone https://github.com/YOUR-USERNAME/Student-Management-System.git
```

```bash
cd Student-Management-System
```

---

## 2️⃣ Create Database

Open MySQL and execute:

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

---

## 3️⃣ Configure MySQL

Open:

```text
DBconnection.java
```

Change:

```java
private static final String URL =
        "jdbc:mysql://localhost:3306/SMS";

private static final String USER =
        "root";

private static final String PASSWORD =
        "YOUR_MYSQL_PASSWORD";
```

⚠️ **Never upload your real MySQL password to GitHub.**

---

## 4️⃣ Add MySQL Connector

Make sure **MySQL Connector/J** is added to your Java project.

---

## 5️⃣ Run Backend

Run:

```text
Main.java
```

You should see:

```text
Backend Server running at:
http://localhost:8080/

API Endpoint available at:
http://localhost:8080/api/students
```

---

## 6️⃣ Open Application

Open your browser:

```text
http://localhost:8080/
```

---

# 🔐 Security

Before uploading the project to GitHub:

### ❌ Never Upload

```text
Passwords
API Keys
.env files
Private Credentials
Database Secrets
```

### ✅ Use

```text
.gitignore
Environment Variables
Configuration Files
```

---

# 📝 Recommended `.gitignore`

```gitignore
# IntelliJ IDEA
.idea/
*.iml

# Java
*.class
out/

# Environment
.env

# Configuration
config.properties

# Database credentials
database.properties

# Logs
*.log

# Operating System
.DS_Store
Thumbs.db
```

---

# 📈 Future Improvements

```text
🔐 User Authentication
👨‍🏫 Teacher Login
📊 Advanced Analytics
📈 Performance Charts
📱 Better Mobile UI
🔎 Advanced Filtering
📄 Export to PDF
📊 Export to Excel
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
🔄 CRUD Operations
🐙 Git & GitHub
🤝 Team Collaboration
```

---

# 🌟 Why This Project?

This project demonstrates how different technologies can work together:

```text
        ☕ JAVA
           │
           ▼
        🔗 API
           │
           ▼
     ⚡ JAVASCRIPT
           │
           ▼
        🎨 UI
           │
           ▼
       👤 USER
           │
           │
           ▼
       🗄️ MYSQL
```

It combines **backend development, database management, API development, frontend development, and teamwork** into one practical project.

---

# ⭐ Support

<p align="center">

### If you like this project, give it a ⭐ Star!

</p>

<p align="center">

<img src="https://img.shields.io/badge/⭐-Star%20This%20Repository-yellow?style=for-the-badge">

<img src="https://img.shields.io/badge/🍴-Fork%20This%20Repository-blue?style=for-the-badge">

</p>

---

# 🤝 Contributions

Contributions and suggestions are welcome.

```text
🍴 Fork Repository
       ↓
🌿 Create Branch
       ↓
💻 Make Changes
       ↓
📝 Commit Changes
       ↓
🚀 Push Changes
       ↓
🔀 Create Pull Request
```

---

# 📬 Developer Profiles

### 👨‍💻 Backend & Database

**Rudrapratap Singh Rajpoot**

GitHub: `@Iamrudrx`

Role:

```text
Java • JDBC • MySQL • Backend • API
```

---

### 🎨 Frontend

**sahna4352**

GitHub: `@sahna4352`

Role:

```text
HTML • CSS • JavaScript • Frontend • UI
```

---

<p align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:06b6d4,100:7c3aed&height=150&section=footer&animation=twinkling" width="100%"/>

</p>

<p align="center">

## 💜 Built With Teamwork & Code

### ☕ Java • 🗄️ MySQL • 🌐 HTML • 🎨 CSS • ⚡ JavaScript

### 🚀 Student Management System • 2026

</p>
