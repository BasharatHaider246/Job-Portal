# Job Portal Spring Boot Project

## Overview
This is a RESTful Job Portal application built using **Spring Boot**. The system allows users to register as job seekers or employers/companies, post jobs, apply for jobs, manage applications, and categorize jobs. It uses **MySQL database** for persistent storage and provides secure authentication.

## Features
- **User Authentication & Registration:** Secure registration and login for users (job seekers, employers).
- **Profile Management:** Manage employer profiles and job seeker profiles.
- **Job Posting & Management:** Companies can post jobs under various categories.
- **Job Search:** Users can search jobs by keywords and categories.
- **Job Application Workflow:** Job seekers can apply for posted jobs. Employers can view, accept, or reject applications.
- **Categories Management:** Jobs are organized by categories (like IT, Marketing).
- **Security:** Uses Spring Security with BCrypt password encoding and stateless session configuration.
- **API Documentation:** (Swagger/OpenAPI integration recommended)

## Tech Stack
- **Backend:** Spring Boot, Spring Security
- **Database:** MySQL
- **ORM:** Spring Data JPA
- **Build:** Maven/Gradle

job-portal/
│
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/
│   │   │   └── 📁 com/
│   │   │       └── 📁 basharat/
│   │   │           └── 📁 JobPortal/
│   │   │               │
│   │   │               ├── 📁 controller/           # REST API Controllers
│   │   │               │   ├── 📄 UserController.java
│   │   │               │   ├── 📄 EmployeeController.java
│   │   │               │   ├── 📄 JobController.java
│   │   │               │   ├── 📄 JobApplicationController.java
│   │   │               │   └── 📄 JobCategoryController.java
│   │   │               │
│   │   │               ├── 📁 model/                # Entity Classes
│   │   │               │   ├── 📄 User.java
│   │   │               │   ├── 📄 Employee.java
│   │   │               │   ├── 📄 Job.java
│   │   │               │   ├── 📄 JobApplication.java
│   │   │               │   └── 📄 JobCategory.java
│   │   │               │
│   │   │               ├── 📁 repository/           # Data Access Layer
│   │   │               │   ├── 📄 UserRepository.java
│   │   │               │   ├── 📄 EmployeeRepository.java
│   │   │               │   ├── 📄 JobRepository.java
│   │   │               │   ├── 📄 JobApplicationRepository.java
│   │   │               │   └── 📄 JobCategoryRepository.java
│   │   │               │
│   │   │               ├── 📁 service/              # Business Logic
│   │   │               │   ├── 📄 UserService.java
│   │   │               │   ├── 📄 UserServiceImpl.java
│   │   │               │   ├── 📄 EmployeeService.java
│   │   │               │   ├── 📄 EmployeeServiceImpl.java
│   │   │               │   ├── 📄 JobService.java
│   │   │               │   ├── 📄 JobServiceImpl.java
│   │   │               │   ├── 📄 JobApplicationService.java
│   │   │               │   ├── 📄 JobApplicationServiceImpl.java
│   │   │               │   ├── 📄 JobCategoryService.java
│   │   │               │   └── 📄 JobCategoryServiceImpl.java
│   │   │               │
│   │   │               ├── 📁 config/               # Configuration Classes
│   │   │               │   └── 📄 SecurityConfig.java
│   │   │               │
│   │   │               └── 📄 JobPortalApplication.java  # Main Class
│   │   │
│   │   └── 📁 resources/
│   │       ├── 📄 application.properties           # App Configuration
│   │       ├── 📁 static/                          # Static Resources
│   │       └── 📁 templates/                       # Templates (if any)
│   │
│   └── 📁 test/
│       └── 📁 java/
│           └── 📁 com/
│               └── 📁 basharat/
│                   └── 📁 JobPortal/
│                       └── 📄 JobPortalApplicationTests.java
│
├── 📁 target/                                      # Compiled Files (Maven)
│
├── 📄 pom.xml                                      # Maven Configuration
├── 📄 README.md                                    # Project Documentation
├── 📄 LICENSE                                      # MIT License
└── 📄 .gitignore                                   # Git Ignore File


## Project Structure Explained
Controllers:
- `UserController.java` – Handles user registration, authentication, user info fetch
- `EmployeeController.java` – Manage company/employer registration and profile
- `JobController.java` – CRUD for job postings and job queries
- `JobApplicationController.java` – Application submission and status tracking
- `JobCategoryController.java` – CRUD for job categories
- `SecurityConfig.java` – Configures authentication, password encryption, API endpoint permissions

Models (Entities):
- `User.java` – User profile (username, password, email, role)
- `Employee.java` – Company profile linked to a user
- `Job.java` – Job posting details
- `JobApplication.java` – Applications submitted by job seekers for jobs
- `JobCategory.java` – Job category info

Repositories:
- Interfaces extending JPARepository for automatic CRUD operations and custom finders
- Example: `UserRepository.java`, `JobRepository.java`, `JobApplicationRepository.java`

Services:
- Interfaces + Implementation for core logic
- Example: `UserService`, `UserServiceImpl`, `JobService`, `JobServiceImpl`, etc.

## How It Works
User interacts via REST API endpoints:
- User registration/login
- Employer creates a profile and posts jobs
- Job seeker applies for jobs
- Employers review and update application statuses
All requests are processed through Controllers → Services → Repositories → Database.

## Setting Up Locally

### Prerequisites
- Java 17+
- Maven (or Gradle)
- MySQL Server
- Git

### Steps
1. **Clone the Repository**
   ```bash
   git clone <your-repo-url>
   cd <project-directory>
   ```
2. **Install Dependencies**
   ```bash
   mvn clean install
   # OR if using Gradle
   gradle build
   ```
3. **Configure Database**
   - Create a MySQL database named `job_portal` (or update your database name in `application.properties`).
   - Example SQL:
     ```sql
     CREATE DATABASE job_portal;
     ```
   - Update your `src/main/resources/application.properties` file:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
     spring.datasource.username=YOUR_DB_USERNAME
     spring.datasource.password=YOUR_DB_PASSWORD
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
     ```
4. **Run MySQL Server:** Make sure your database is running locally and accepting connections.
5. **Run the Application**
   ```bash
   mvn spring-boot:run
   # OR
   gradle bootRun
   ```
6. **Access the API**
   - Default port: `http://localhost:8080/`
   - API Docs: `/swagger-ui.html` (if Swagger/OpenAPI added)

## Useful Links
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [MySQL Installation Guide](https://dev.mysql.com/doc/mysql-installation-excerpt/5.7/en/)
- [Spring Data JPA Guide](https://spring.io/projects/spring-data-jpa)
- [Swagger/OpenAPI Guide](https://swagger.io/docs/)

## Contributing
- Fork the repository
- Create your feature branch (`git checkout -b feature/fooBar`)
- Commit your changes (`git commit -am 'Add some fooBar'`)
- Push to the branch (`git push origin feature/fooBar`)
- Create a new Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

