# 💼 Job Portal - Spring Boot REST API

<div align="center">

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0+-brightgreen?style=for-the-badge&logo=spring)
![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=java)
![MySQL](https://img.shields.io/badge/MySQL-8.0+-blue?style=for-the-badge&logo=mysql)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

**A comprehensive RESTful Job Portal API built with Spring Boot**

[Features](#-features) • [Tech Stack](#-tech-stack) • [Installation](#-installation) • [API Docs](#-api-endpoints) • [Contributing](#-contributing)

</div>

---

## 📋 Overview

This is a production-ready **Job Portal application** built using **Spring Boot**. The system enables job seekers to discover and apply for jobs, while employers can post job listings, manage applications, and track candidates. The application features secure authentication, role-based access control, and a well-structured RESTful API.

## ✨ Features

- 🔐 **User Authentication & Authorization** - Secure registration and login with BCrypt password encryption
- 👤 **Profile Management** - Separate profiles for job seekers and employers/companies
- 📝 **Job Posting & Management** - Companies can create, update, and manage job listings
- 🔍 **Advanced Job Search** - Search jobs by keywords, categories, and company
- 📤 **Application Management** - Job seekers can apply for jobs; employers can review and update application status
- 🏷️ **Category System** - Organize jobs into categories (IT, Marketing, Sales, etc.)
- 🔒 **Spring Security** - Stateless authentication with BCrypt password encoding
- 🗄️ **MySQL Database** - Persistent data storage with JPA/Hibernate ORM
- 📚 **API Documentation** - Clean REST API design (Swagger/OpenAPI ready)

## 🛠️ Tech Stack

| Technology | Description |
|-----------|-------------|
| ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat&logo=spring&logoColor=white) | Backend framework |
| ![Spring Security](https://img.shields.io/badge/Spring%20Security-6DB33F?style=flat&logo=springsecurity&logoColor=white) | Authentication & authorization |
| ![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white) | Relational database |
| ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=flat&logo=hibernate&logoColor=white) | ORM framework |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white) | Build automation |
| ![Java](https://img.shields.io/badge/Java%2017-ED8B00?style=flat&logo=openjdk&logoColor=white) | Programming language |

## 📂 Project Structure

```
job-portal/
│
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/com/basharat/JobPortal/
│   │   │   │
│   │   │   ├── 🎯 controller/           # REST API Controllers
│   │   │   │   ├── 📄 UserController.java
│   │   │   │   ├── 📄 EmployeeController.java
│   │   │   │   ├── 📄 JobController.java
│   │   │   │   ├── 📄 JobApplicationController.java
│   │   │   │   └── 📄 JobCategoryController.java
│   │   │   │
│   │   │   ├── 📊 model/                # JPA Entities
│   │   │   │   ├── 📄 User.java
│   │   │   │   ├── 📄 Employee.java
│   │   │   │   ├── 📄 Job.java
│   │   │   │   ├── 📄 JobApplication.java
│   │   │   │   └── 📄 JobCategory.java
│   │   │   │
│   │   │   ├── 🗄️ repository/          # Data Access Layer
│   │   │   │   ├── 📄 UserRepository.java
│   │   │   │   ├── 📄 EmployeeRepository.java
│   │   │   │   ├── 📄 JobRepository.java
│   │   │   │   ├── 📄 JobApplicationRepository.java
│   │   │   │   └── 📄 JobCategoryRepository.java
│   │   │   │
│   │   │   ├── ⚙️ service/              # Business Logic
│   │   │   │   ├── 📄 UserService.java
│   │   │   │   ├── 📄 UserServiceImpl.java
│   │   │   │   ├── 📄 EmployeeService.java
│   │   │   │   ├── 📄 EmployeeServiceImpl.java
│   │   │   │   ├── 📄 JobService.java
│   │   │   │   ├── 📄 JobServiceImpl.java
│   │   │   │   ├── 📄 JobApplicationService.java
│   │   │   │   ├── 📄 JobApplicationServiceImpl.java
│   │   │   │   ├── 📄 JobCategoryService.java
│   │   │   │   └── 📄 JobCategoryServiceImpl.java
│   │   │   │
│   │   │   ├── 🔧 config/               # Configuration
│   │   │   │   └── 📄 SecurityConfig.java
│   │   │   │
│   │   │   └── 📄 JobPortalApplication.java
│   │   │
│   │   └── 📁 resources/
│   │       ├── 📄 application.properties
│   │       ├── 📁 static/
│   │       └── 📁 templates/
│   │
│   └── 📁 test/
│       └── 📁 java/
│           └── 📄 JobPortalApplicationTests.java
│
├── 📄 pom.xml
├── 📄 README.md
├── 📄 LICENSE
└── 📄 .gitignore
```

## 🏗️ Architecture

```
┌─────────────────────────────────────────────────────────────┐
│              🌐 Client (Browser/Postman/Mobile)             │
└───────────────────────┬─────────────────────────────────────┘
                        │ HTTP Requests (JSON)
                        ▼
┌─────────────────────────────────────────────────────────────┐
│                   🎯 Controller Layer                        │
│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐     │
│  │    User      │  │   Employee   │  │     Job      │     │
│  │  Controller  │  │  Controller  │  │  Controller  │ ... │
│  └──────────────┘  └──────────────┘  └──────────────┘     │
└───────────────────────┬─────────────────────────────────────┘
                        │ Business Logic Calls
                        ▼
┌─────────────────────────────────────────────────────────────┐
│                   ⚙️  Service Layer                          │
│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐     │
│  │    User      │  │   Employee   │  │     Job      │     │
│  │   Service    │  │   Service    │  │   Service    │ ... │
│  └──────────────┘  └──────────────┘  └──────────────┘     │
└───────────────────────┬─────────────────────────────────────┘
                        │ Data Operations
                        ▼
┌─────────────────────────────────────────────────────────────┐
│                   🗄️  Repository Layer                       │
│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐     │
│  │    User      │  │   Employee   │  │     Job      │     │
│  │  Repository  │  │  Repository  │  │  Repository  │ ... │
│  └──────────────┘  └──────────────┘  └──────────────┘     │
└───────────────────────┬─────────────────────────────────────┘
                        │ JPA/Hibernate
                        ▼
┌─────────────────────────────────────────────────────────────┐
│                   🗃️  MySQL Database                         │
│     ┌─────────┐  ┌──────────┐  ┌──────┐  ┌────────────┐   │
│     │  users  │  │ employees│  │ jobs │  │    job_    │   │
│     │         │  │          │  │      │  │applications│   │
│     └─────────┘  └──────────┘  └──────┘  └────────────┘   │
└─────────────────────────────────────────────────────────────┘
```

## 💾 Database Schema

```
┌─────────────────────┐
│       👤 USERS      │
├─────────────────────┤
│ 🔑 id (PK)          │
│ 📧 username         │
│ 🔒 password         │
│ 📧 email            │
│ 👔 role             │
└──────────┬──────────┘
           │ 1:1
           ▼
┌─────────────────────┐         ┌─────────────────────┐
│   🏢 EMPLOYEES      │    1:N  │      💼 JOBS        │
├─────────────────────┤◄────────├─────────────────────┤
│ 🔑 id (PK)          │         │ 🔑 id (PK)          │
│ 🔗 user_id (FK)     │         │ 📝 title            │
│ 🏢 company_name     │         │ 📄 description      │
│ 📄 description      │         │ 🔗 company_id (FK)  │
└─────────────────────┘         │ 🔗 category_id (FK) │
                                └──────────┬──────────┘
                                           │ 1:N
           ┌───────────────────────────────┘
           │
           ▼
┌─────────────────────┐         ┌─────────────────────┐
│  📋 JOB_APPLICATIONS│         │   🏷️ JOB_CATEGORIES │
├─────────────────────┤         ├─────────────────────┤
│ 🔑 id (PK)          │         │ 🔑 id (PK)          │
│ 🔗 job_seeker_id    │         │ 📌 name             │
│ 🔗 job_id (FK)      │         └─────────────────────┘
│ 📊 status           │
│ 📅 application_date │
└─────────────────────┘
```

## 🚀 API Endpoints

### 👤 User Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/users/register` | Register new user |
| `POST` | `/api/users/login` | User login |
| `GET` | `/api/users/username/{username}` | Get user by username |
| `GET` | `/api/users/email/{email}` | Get user by email |

### 🏢 Employee/Employer Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/employees/register` | Register company/employer |
| `PUT` | `/api/employees/update` | Update company profile |
| `GET` | `/api/employees/user/{userId}` | Get employee by user ID |

### 💼 Job Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/jobs` | Create new job |
| `GET` | `/api/jobs` | Get all jobs |
| `GET` | `/api/jobs/company/{companyId}` | Get jobs by company |
| `GET` | `/api/jobs/search?keyword=` | Search jobs by keyword |
| `GET` | `/api/jobs/category/{categoryId}` | Get jobs by category |

### 📋 Job Application Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/job-applications` | Submit job application |
| `GET` | `/api/job-applications` | Get all applications |
| `GET` | `/api/job-applications/job-seeker/{jobSeekerId}` | Get applications by job seeker |
| `GET` | `/api/job-applications/job/{jobId}` | Get applications for specific job |
| `PUT` | `/api/job-applications/{id}/status` | Update application status |

### 🏷️ Job Category Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/job-categories` | Add new category |
| `GET` | `/api/job-categories` | Get all categories |
| `PUT` | `/api/job-categories/{id}` | Update category |
| `DELETE` | `/api/job-categories/{id}` | Delete category |

## 📥 Installation

### Prerequisites

- ☕ **Java 17+**
- 📦 **Maven 3.6+**
- 🗄️ **MySQL 8.0+**
- 🔧 **Git**
- 💻 **IDE** (IntelliJ IDEA / Eclipse / VS Code)

### Step-by-Step Setup

#### 1️⃣ Clone the Repository

```bash
git clone https://github.com/yourusername/job-portal.git
cd job-portal
```

#### 2️⃣ Configure MySQL Database

```sql
-- Login to MySQL
mysql -u root -p

-- Create database
CREATE DATABASE job_portal;

-- (Optional) Create dedicated user
CREATE USER 'jobportal_user'@'localhost' IDENTIFIED BY 'your_password';
GRANT ALL PRIVILEGES ON job_portal.* TO 'jobportal_user'@'localhost';
FLUSH PRIVILEGES;
```

#### 3️⃣ Update Application Properties

Edit `src/main/resources/application.properties`:

```properties
# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
spring.datasource.username=root
spring.datasource.password=your_mysql_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA/Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.format_sql=true

# Server Configuration
server.port=8080

# Logging
logging.level.org.springframework.web=DEBUG
logging.level.com.basharat.JobPortal=DEBUG
```

#### 4️⃣ Install Dependencies

```bash
mvn clean install
```

#### 5️⃣ Run the Application

```bash
# Using Maven
mvn spring-boot:run

# Or run directly from IDE
# Right-click on JobPortalApplication.java → Run
```

#### 6️⃣ Verify Installation

- 🌐 Application URL: `http://localhost:8080`
- ✅ Check console for: `Started JobPortalApplication in X seconds`
- 🗃️ Database tables will be auto-created by Hibernate

## 🧪 Testing the API

### Using Postman

**Register a New User:**
```json
POST http://localhost:8080/api/users/register
Content-Type: application/json

{
  "username": "john_doe",
  "email": "john@example.com",
  "password": "password123",
  "role": "JOB_SEEKER"
}
```

**Login:**
```json
POST http://localhost:8080/api/users/login
Content-Type: application/json

{
  "username": "john_doe",
  "password": "password123"
}
```

### Using cURL

```bash
# Register user
curl -X POST http://localhost:8080/api/users/register \
  -H "Content-Type: application/json" \
  -d '{
    "username": "john_doe",
    "email": "john@example.com",
    "password": "password123",
    "role": "JOB_SEEKER"
  }'

# Get all jobs
curl -X GET http://localhost:8080/api/jobs
```

## 🔧 Troubleshooting

### Common Issues

| Issue | Solution |
|-------|----------|
| ❌ Database connection error | Verify MySQL is running: `sudo systemctl status mysql` |
| ❌ Port 8080 already in use | Change port in `application.properties` or kill process: `lsof -i :8080` |
| ❌ Maven build fails | Clear cache: `mvn clean` then `mvn install -U` |
| ❌ Java version error | Check version: `java -version` (must be 17+) |

## 📚 Resources

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Data JPA Guide](https://spring.io/projects/spring-data-jpa)
- [Spring Security Reference](https://docs.spring.io/spring-security/reference/index.html)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [Maven Guide](https://maven.apache.org/guides/index.html)
- [REST API Best Practices](https://restfulapi.net/)

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. 🍴 Fork the repository
2. 🌱 Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push to the branch (`git push origin feature/AmazingFeature`)
5. 🔄 Open a Pull Request

## 🗺️ Future Enhancements

- [ ] JWT token-based authentication
- [ ] Email notifications for applications
- [ ] Resume upload functionality
- [ ] Admin dashboard
- [ ] Pagination & sorting
- [ ] Advanced search filters
- [ ] Real-time notifications (WebSocket)
- [ ] Docker containerization
- [ ] CI/CD pipeline setup

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

## 📧 Contact

For questions, suggestions, or issues, please open an issue on GitHub or contact the maintainer.

---

<div align="center">

**⭐ Star this repo if you find it helpful!**

Made with ❤️ using Spring Boot

</div>
