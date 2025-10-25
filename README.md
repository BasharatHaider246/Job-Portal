<div align="center">

# 💼 Job Portal - Spring Boot REST API

<img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=32&duration=2800&pause=2000&color=6DB33F&center=true&vCenter=true&width=940&lines=Welcome+to+Job+Portal+API!;Built+with+Spring+Boot+%E2%9D%A4%EF%B8%8F;RESTful+%7C+Secure+%7C+Scalable" alt="Typing SVG" />

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0+-brightgreen?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![MySQL](https://img.shields.io/badge/MySQL-8.0+-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)](LICENSE)

**A production-ready RESTful Job Portal API with advanced features**

[🚀 Features](#-features) • [🛠️ Tech Stack](#️-tech-stack) • [📥 Installation](#-installation) • [📚 API Docs](#-api-endpoints) • [🤝 Contributing](#-contributing)

<img src="https://user-images.githubusercontent.com/74038190/212284100-561aa473-3905-4a80-b561-0d28506553ee.gif" width="700">

</div>

---

## 📋 Overview

<img align="right" alt="Coding" width="400" src="https://user-images.githubusercontent.com/74038190/229223263-cf2e4b07-2615-4f87-9c38-e37600f8381a.gif">

This is a **production-ready Job Portal application** built using **Spring Boot**. The system enables:

- 🎯 **Job Seekers** to discover and apply for jobs
- 🏢 **Employers** to post job listings and manage applications  
- 🔐 **Secure Authentication** with role-based access control
- 📊 **Analytics & Tracking** for applications and candidates

Perfect for learning Spring Boot or building your job portal platform!

<br clear="right"/>

## ✨ Features

<table>
<tr>
<td width="50%">

### 🔐 Security & Authentication
- ✅ BCrypt password encryption
- ✅ Stateless authentication
- ✅ Role-based access (Admin/Job Seeker/Employer)
- ✅ Spring Security integration

</td>
<td width="50%">

### 💼 Job Management
- ✅ Create & manage job listings
- ✅ Advanced search & filters
- ✅ Category-based organization
- ✅ Company profiles

</td>
</tr>
<tr>
<td width="50%">

### 📤 Application Tracking
- ✅ One-click job applications
- ✅ Application status tracking
- ✅ Employer review system
- ✅ Candidate management

</td>
<td width="50%">

### 🗄️ Database & Architecture
- ✅ MySQL persistent storage
- ✅ JPA/Hibernate ORM
- ✅ RESTful API design
- ✅ Layered architecture

</td>
</tr>
</table>

## 🛠️ Tech Stack

<div align="center">

![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot&logoColor=6DB33F)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=Apache-Maven&logoColor=white)
![Java](https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

## 📂 Project Structure

<details>
<summary>📁 Click to expand folder structure</summary>

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

</details>

## 🏗️ Architecture Flow

<div align="center">

```mermaid
graph TD
    A[🌐 Client] -->|HTTP Request| B[🎯 Controller Layer]
    B -->|Business Logic| C[⚙️ Service Layer]
    C -->|Data Operations| D[🗄️ Repository Layer]
    D -->|JPA/Hibernate| E[🗃️ MySQL Database]
    E -->|Response| D
    D -->|Data| C
    C -->|JSON Response| B
    B -->|HTTP Response| A
    
    style A fill:#e1f5ff,stroke:#01579b,stroke-width:2px
    style B fill:#f3e5f5,stroke:#4a148c,stroke-width:2px
    style C fill:#e8f5e9,stroke:#1b5e20,stroke-width:2px
    style D fill:#fff3e0,stroke:#e65100,stroke-width:2px
    style E fill:#fce4ec,stroke:#880e4f,stroke-width:2px
```

</div>

## 💾 Database Schema

<details>
<summary>🗃️ Click to view database relationships</summary>

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

</details>

## 🚀 API Endpoints

<details>
<summary>👤 User Management APIs</summary>

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/users/register` | Register new user |
| `POST` | `/api/users/login` | User login |
| `GET` | `/api/users/username/{username}` | Get user by username |
| `GET` | `/api/users/email/{email}` | Get user by email |

</details>

<details>
<summary>🏢 Employee/Employer Management APIs</summary>

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/employees/register` | Register company/employer |
| `PUT` | `/api/employees/update` | Update company profile |
| `GET` | `/api/employees/user/{userId}` | Get employee by user ID |

</details>

<details>
<summary>💼 Job Management APIs</summary>

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/jobs` | Create new job |
| `GET` | `/api/jobs` | Get all jobs |
| `GET` | `/api/jobs/company/{companyId}` | Get jobs by company |
| `GET` | `/api/jobs/search?keyword=` | Search jobs by keyword |
| `GET` | `/api/jobs/category/{categoryId}` | Get jobs by category |

</details>

<details>
<summary>📋 Job Application Management APIs</summary>

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/job-applications` | Submit job application |
| `GET` | `/api/job-applications` | Get all applications |
| `GET` | `/api/job-applications/job-seeker/{jobSeekerId}` | Get applications by job seeker |
| `GET` | `/api/job-applications/job/{jobId}` | Get applications for specific job |
| `PUT` | `/api/job-applications/{id}/status` | Update application status |

</details>

<details>
<summary>🏷️ Job Category Management APIs</summary>

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/job-categories` | Add new category |
| `GET` | `/api/job-categories` | Get all categories |
| `PUT` | `/api/job-categories/{id}` | Update category |
| `DELETE` | `/api/job-categories/{id}` | Delete category |

</details>

## 📥 Installation

### Prerequisites

<div align="center">

| Requirement | Version | Download |
|------------|---------|----------|
| ☕ Java | 17+ | [Download](https://www.oracle.com/java/technologies/downloads/) |
| 📦 Maven | 3.6+ | [Download](https://maven.apache.org/download.cgi) |
| 🗄️ MySQL | 8.0+ | [Download](https://dev.mysql.com/downloads/mysql/) |
| 🔧 Git | Latest | [Download](https://git-scm.com/downloads) |

</div>

### 🚀 Quick Start

#### 1️⃣ Clone Repository

```bash
git clone https://github.com/yourusername/job-portal.git
cd job-portal
```

#### 2️⃣ Setup MySQL Database

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

#### 3️⃣ Configure Application

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
```

#### 4️⃣ Build & Run

```bash
# Install dependencies
mvn clean install

# Run application
mvn spring-boot:run
```

#### 5️⃣ Verify Setup ✅

- 🌐 Navigate to: `http://localhost:8080`
- ✅ Check console: `Started JobPortalApplication`
- 🗃️ Tables auto-created by Hibernate

## 🧪 Testing

### Postman Collection

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

### cURL Example

```bash
curl -X POST http://localhost:8080/api/users/register \
  -H "Content-Type: application/json" \
  -d '{
    "username": "john_doe",
    "email": "john@example.com",
    "password": "password123",
    "role": "JOB_SEEKER"
  }'
```

## 🔧 Troubleshooting

<details>
<summary>⚠️ Click for common issues & solutions</summary>

| Issue | Solution |
|-------|----------|
| ❌ Database connection error | Verify MySQL: `sudo systemctl status mysql` |
| ❌ Port 8080 in use | Change port or kill: `lsof -i :8080` |
| ❌ Maven build fails | Clear cache: `mvn clean install -U` |
| ❌ Java version error | Check: `java -version` (needs 17+) |

</details>

## 📚 Resources

<div align="center">

[![Spring Boot](https://img.shields.io/badge/Spring_Boot_Docs-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://docs.spring.io/spring-boot/)
[![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)](https://docs.spring.io/spring-security/)
[![MySQL](https://img.shields.io/badge/MySQL_Docs-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://dev.mysql.com/doc/)
[![Maven](https://img.shields.io/badge/Maven_Guide-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/guides/)

</div>

## 🤝 Contributing

<div align="center">

**Contributions, issues, and feature requests are welcome!**

[![Fork](https://img.shields.io/github/forks/yourusername/job-portal?style=social)](https://github.com/yourusername/job-portal/fork)
[![Stars](https://img.shields.io/github/stars/yourusername/job-portal?style=social)](https://github.com/yourusername/job-portal)
[![Issues](https://img.shields.io/github/issues/yourusername/job-portal)](https://github.com/yourusername/job-portal/issues)

</div>

1. 🍴 Fork the repository
2. 🌱 Create feature branch (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit changes (`git commit -m 'Add AmazingFeature'`)
4. 📤 Push to branch (`git push origin feature/AmazingFeature`)
5. 🔄 Open Pull Request

## 🗺️ Roadmap

- [x] User authentication & authorization
- [x] Job posting & management
- [x] Application tracking system
- [ ] JWT token authentication
- [ ] Email notifications
- [ ] Resume upload
- [ ] Admin dashboard
- [ ] Real-time notifications
- [ ] Docker support
- [ ] CI/CD pipeline

## 📄 License

<div align="center">

[![License](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](LICENSE)

This project is licensed under the **MIT License** - see [LICENSE](LICENSE) file for details.

</div>

## 📧 Contact

<div align="center">

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/yourusername)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/yourprofile)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:your.email@example.com)

</div>

---

<div align="center">

<img src="https://user-images.githubusercontent.com/74038190/212284158-e840e285-664b-44d7-b79b-e264b5e54825.gif" width="400">

### ⭐ Star this repo if you find it helpful!

**Made with ❤️ using Spring Boot**

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=100&section=footer"/>

</div>
