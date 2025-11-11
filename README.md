# 🌱 Spring Boot Tasks Application

![Java](https://img.shields.io/badge/Java-17-blue?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)
![React](https://img.shields.io/badge/Frontend-React%20%2B%20TypeScript-blue?logo=react)
![Build](https://img.shields.io/badge/Build-Maven%20%26%20Vite-orange?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-lightgrey)
![Status](https://img.shields.io/badge/Status-Active-success)

---

## 📖 Overview

The **Spring Boot Tasks Application** is a full-stack project consisting of:
- 🖥 **Backend:** RESTful API built with **Spring Boot** and **Java**
- 💻 **Frontend:** Modern **React + TypeScript** single-page application powered by **Vite**

It enables users to **create, view, update, and delete tasks**, demonstrating clean architecture and full-stack integration.

---

## 🧭 Table of Contents

<details>
<summary>Click to expand</summary>

- [📖 Overview](#-overview)
- [✨ Features](#-features)
- [🧰 Technologies Used](#-technologies-used)
- [⚙️ Getting Started](#️-getting-started)
  - [🔑 Prerequisites](#-prerequisites)
  - [📦 Installation](#-installation)
  - [🚀 Running the Application](#-running-the-application)
- [🧩 Project Structure](#-project-structure)
- [📡 API Endpoints](#-api-endpoints)
- [💾 Database Configuration](#-database-configuration)
- [🧪 Testing](#-testing)
- [🐳 Docker Support](#-docker-support)
- [💻 Frontend Application](#-frontend-application)
  - [🧱 Frontend Technologies](#-frontend-technologies)
  - [🏗️ Running the Frontend](#️-running-the-frontend)
  - [⚙️ Frontend Configuration](#️-frontend-configuration)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [👨‍💻 Author](#-author)
</details>

---

## ✨ Features

- ✅ Full CRUD functionality for task management  
- ✅ RESTful API with clean layered architecture  
- ✅ H2 (in-memory) or MySQL/PostgreSQL database support  
- ✅ React frontend with Tailwind UI & smooth animations  
- ✅ Real-time API communication via Axios  
- ✅ Docker and Docker Compose ready  
- ✅ Maven and Vite-based build processes  

---

## 🧰 Technologies Used

| Layer | Technologies |
|:------|:--------------|
| **Backend** | Java 17+, Spring Boot 3.x, Spring Data JPA, Hibernate, H2/MySQL |
| **Frontend** | React 18+, TypeScript, Vite, Tailwind CSS, NextUI, Framer Motion, Axios, React Router |
| **Build Tools** | Maven, npm, Vite |
| **Containerization** | Docker, Docker Compose |

---

## ⚙️ Getting Started

### 🔑 Prerequisites

- Java 17+  
- Maven (or use included `mvnw`)  
- Node.js 18+ & npm  
- Docker

---

### 📦 Installation

```bash
git clone https://github.com/Kumardeepsingh/SpringBootTasksApplication.git
cd SpringBootTasksApplication
```

#### Build Backend
```bash
./mvnw clean install
```

#### Install Frontend Dependencies
```bash
cd front_end
npm install
```

---

## 🚀 Running the Application

### 🧠 Start Backend (Spring Boot)

```bash
./mvnw spring-boot:run
```

Runs at: 👉 **[http://localhost:8080](http://localhost:8080)**

### 💻 Start Frontend (React + Vite)

```bash
cd front_end
npm run dev
```

Runs at: 👉 **[http://localhost:5173](http://localhost:5173)**  
The frontend automatically connects to the backend API (port `8080`) via Axios.

---

## 🧩 Project Structure

```plaintext
SpringBootTasksApplication/
│
├── front_end/                     # React + TypeScript frontend
│   ├── src/
│   │   ├── components/            # Reusable UI components
│   │   ├── pages/                 # Page-level views (Tasks, Home, etc.)
│   │   ├── services/              # Axios API service
│   │   ├── hooks/                 # Custom React hooks
│   │   └── main.tsx               # App entry point
│   ├── public/                    # Static assets
│   ├── package.json               # Frontend dependencies & scripts
│   └── vite.config.ts             # Vite build configuration
│
├── src/
│   ├── main/java/com/example/tasks/
│   │   ├── controller/            # REST Controllers
│   │   ├── service/               # Business logic
│   │   ├── repository/            # JPA Repositories
│   │   ├── domain/                # Entity & DTO classes
│   │   └── mappers/               # DTO to Entity mappers
│   └── resources/
│       ├── application.properties
│       └── static/
│
├── pom.xml
├── docker-compose.yml
├── .gitignore
└── README.md
```

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|:-------|:----------|:-------------|
| `GET` | `/task-list{task_list_id}/tasks` | Get all tasks |
| `GET` | `/task-list{task_list_id}/tasks/{id}` | Get a specific task |
| `POST` | `/task-list{task_list_id}/tasks` | Create a new task |
| `PUT` | `/task-list{task_list_id}/tasks/{id}` | Update an existing task |
| `DELETE` | `/task-list{task_list_id}/tasks/{id}` | Delete a task |

Example `POST /tasks` request:

```json
{
  "title": "Complete Project",
  "description": "Finish the full-stack Spring Boot app",
  "dueDate": "2025-11-15",
  "completed": false
}
```

---

## 💾 Database Configuration

Default **H2** setup (in-memory):
```properties
spring.datasource.url=jdbc:h2:mem:tasksdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

Access console: 👉 [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

Switch to **MySQL**:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tasksdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

---


## 🐳 Docker Support

```bash
docker-compose up 
```

---

## 💻 Frontend Application

### 🧱 Frontend Technologies

| Library | Purpose |
|:---------|:---------|
| **React 18** | UI framework |
| **TypeScript** | Static typing |
| **Vite** | Fast build & dev server |
| **Tailwind CSS** | Utility-first styling |
| **NextUI** | Modern UI components |
| **Framer Motion** | Animations |
| **Lucide React** | Icon library |
| **Axios** | REST API communication |
| **React Router** | Client-side routing |

---

### 🏗️ Running the Frontend

Development:
```bash
cd front_end
npm run dev
```

Build for production:
```bash
npm run build
```

Preview production build:
```bash
npm run preview
```

---

### ⚙️ Frontend Configuration

By default, API requests use `http://localhost:8080` as the backend URL.  
If deploying separately, update the Axios base URL in the frontend service file (e.g., `src/services/api.ts`).

You can also create a `.env` file in `front_end/`:
```env
VITE_API_BASE_URL=http://localhost:8080
```

---


## 📄 License

Licensed under the **MIT License**.  
See the [LICENSE](LICENSE) file for full details.

---

## 👨‍💻 Author

**Kumar Deepsingh**  
📍 GitHub: [Kumardeepsingh](https://github.com/Kumardeepsingh)  
📧 Email: Kumardeepsingh@student.kpu.ca
