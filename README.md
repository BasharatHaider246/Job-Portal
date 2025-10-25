
# Project Title

Job Portal Spring Boot Project

Overview:
This is a RESTful Job Portal application built using Spring Boot. The system allows users to register as job seekers or employers/companies, post jobs, apply for jobs, manage applications, and categorize jobs. It uses MySQL database for persistent storage and provides secure authentication.


## Features

User Authentication & Registration: Secure registration and login for users (job seekers, employers).

Profile Management: Manage employer profiles and job seeker profiles.

Job Posting & Management: Companies can post jobs under various categories.

Job Search: Users can search jobs by keywords and categories.

Job Application Workflow: Job seekers can apply for posted jobs. Employers can view, accept, or reject applications.

Categories Management: Jobs are organized by categories (like IT, Marketing).

Security: Uses Spring Security with BCrypt password encoding and stateless session configuration.

API Documentation: (Swagger/OpenAPI integration recommended)
## Tech Stack
Backend: Spring Boot, Spring Security

Database: MySQL

ORM: Spring Data JPA

Build: Maven
## Working
How It Works
User interacts via REST API endpoints:

User registration/login

Employer creates a profile and posts jobs

Job seeker applies for jobs

Employers review and update application statuses
All requests are processed through Controllers → Services → Repositories → Database.
## Setting Up Locally

Prerequisites
Java 17+

Maven (or Gradle)

MySQL Server

Git
Steps
Clone the Repository

bash
git clone <your-repo-url>
cd <project-directory>
Install Dependencies

bash
mvn clean install
# OR if using Gradle
gradle build
Configure Database

Create a MySQL database named job_portal (or update your database name in application.properties).

Example SQL:

sql
CREATE DATABASE job_portal;
Update your src/main/resources/application.properties file:

text
spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
Run MySQL Server: Make sure your database is running locally and accepting connections.

Run the Application

bash
mvn spring-boot:run
# OR
gradle bootRun
Access the API

Default port: http://localhost:8080/

API Docs: /swagger-ui.html (if Swagger/OpenAPI added)

Useful Links
Spring Boot Documentation

MySQL Installation Guide

Spring Data JPA Guide

Swagger/OpenAPI Guide
