# 🌱 Spring Boot Tasks Application

![Java](https://img.shields.io/badge/Java-17-blue?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)
![Build](https://img.shields.io/badge/Build-Maven-orange?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-lightgrey)
![Status](https://img.shields.io/badge/Status-Active-success)

---

## 📖 Overview

The **Spring Boot Tasks Application** is a simple yet powerful RESTful API built with **Spring Boot** and **Java** for managing tasks.  
It demonstrates clean architecture principles — separating controller, service, and repository layers — and provides full CRUD functionality for task management.

This project is ideal for learning **Spring Boot fundamentals**, **JPA persistence**, and **REST API design**.

---

## 🧭 Table of Contents

<details>
<summary>Click to expand</summary>

- [🌱 Spring Boot Tasks Application](#-spring-boot-tasks-application)
  - [📖 Overview](#-overview)
  - [🧭 Table of Contents](#-table-of-contents)
  - [✨ Features](#-features)
  - [🧰 Technologies Used](#-technologies-used)
  - [⚙️ Getting Started](#️-getting-started)
    - [🔑 Prerequisites](#-prerequisites)
    - [📦 Installation](#-installation)
    - [🚀 Running the Application](#-running-the-application)
  - [📡 API Endpoints](#-api-endpoints)
  - [🧩 Project Structure](#-project-structure)
  - [💾 Database Configuration](#-database-configuration)
  - [🧪 Testing](#-testing)
  - [🐳 Docker Support](#-docker-support)
  - [🤝 Contributing](#-contributing)
  - [📄 License](#-license)
  - [👨‍💻 Author](#-author)
</details>

---

## ✨ Features

- ✅ Create, Read, Update, and Delete (CRUD) operations on tasks  
- ✅ RESTful API built using Spring Boot  
- ✅ Uses Spring Data JPA for easy persistence  
- ✅ H2 in-memory or external database support  
- ✅ Clean layered architecture (Controller → Service → Repository → Model)  
- ✅ Docker and Docker Compose ready  
- ✅ Maven wrapper for simple builds and runs  

---

## 🧰 Technologies Used

| Component | Description / Version |
|-----------:|----------------------|
| **Language** | Java (17+) |
| **Framework** | Spring Boot 3.x |
| **ORM** | Spring Data JPA |
| **Database** | H2 (default) / MySQL / PostgreSQL |
| **Build Tool** | Maven |
| **Container** | Docker & Docker Compose (optional) |
| **IDE** | IntelliJ IDEA / Eclipse / VS Code |

---

## ⚙️ Getting Started

Follow these steps to set up the project locally.

---

### 🔑 Prerequisites

Before running, ensure you have the following installed:

- Java 17 or higher  
- Maven (or use included `mvnw` wrapper)  
- Git  
- (Optional) Docker & Docker Compose  

---

### 📦 Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Kumardeepsingh/SpringBootTasksApplication.git
   cd SpringBootTasksApplication

## 🏗️ Build the Project

You can build the project using **Maven Wrapper** or **Maven**:

```bash
./mvnw clean install
```
or
```bash
mvn clean install
```

---

## 🚀 Running the Application

### Run directly with Maven
```bash
./mvnw spring-boot:run
```

### Or run the generated JAR file
```bash
java -jar target/springboot-tasks-application.jar
```

After startup, the API will be available at:  
👉 **[http://localhost:8080](http://localhost:8080)**

---

## 📡 API Endpoints

| Method | Endpoint       | Description                 |
|:-------|:----------------|:----------------------------|
| `GET`  | `/tasks`        | Fetch all tasks             |
| `GET`  | `/tasks/{id}`   | Fetch a specific task by ID |
| `POST` | `/tasks`        | Create a new task           |
| `PUT`  | `/tasks/{id}`   | Update an existing task     |
| `DELETE` | `/tasks/{id}` | Delete a task by ID         |

---

## 🧾 Example JSON Requests and Responses

### Request (POST / PUT)
```json
{
  "title": "Finish report",
  "description": "Complete the monthly financial report",
  "dueDate": "2025-11-15",
  "completed": false
}
```

### Response
```json
{
  "id": 1,
  "title": "Finish report",
  "description": "Complete the monthly financial report",
  "dueDate": "2025-11-15",
  "completed": false,
  "createdAt": "2025-11-09T12:34:56",
  "updatedAt": "2025-11-09T12:34:56"
}
```

---

## 🧩 Project Structure

```plaintext
SpringBootTasksApplication/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/tasks/
│   │   │       ├── controller/      # REST controllers
│   │   │       ├── service/         # Business logic
│   │   │       ├── repository/      # JPA repositories
│   │   │       └── domain/          # Dto & Entity classes
│   │   │       └── mappers/         # Dto Mappers
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/ or templates/
│   └── test/
│       └── java/                    # Unit and integration tests
│
├── pom.xml
├── docker-compose.yml
├── .gitignore
└── README.md
```

---

## 💾 Database Configuration

By default, the app uses an **in-memory H2 database** (ideal for testing).

**File:** `src/main/resources/application.properties`
```properties
spring.datasource.url=jdbc:h2:mem:tasksdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

Access the H2 console at:  
👉 **[http://localhost:8080/h2-console](http://localhost:8080/h2-console)**

---

## 🛠️ Switching to MySQL or PostgreSQL

To use a persistent database, update the configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tasksdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

---

## 🧪 Testing

Run all tests using Maven:
```bash
./mvnw test
```

Tests should be placed under:
```plaintext
src/test/java/com/example/tasks/
```

You can use **JUnit 5** and **Mockito** for unit and integration tests.

---

## 🐳 Docker Support

### 🧱 Build Docker Image
```bash
docker build -t springboot-tasks-app .
```

### ▶️ Run via Docker Compose
```bash
docker-compose up
```

This will automatically build and start the application along with any linked database container.

---


## 📄 License

This project is licensed under the **MIT License**.  
You are free to use, modify, and distribute it as permitted under the license.

See the [LICENSE](LICENSE) file for more information.

---

## 👨‍💻 Author

**Kumar Deepsingh**  
📍 GitHub: [Kumardeepsingh](https://github.com/Kumardeepsingh)  
📧 Email: Kumardeepsingh@student.kpu.ca
