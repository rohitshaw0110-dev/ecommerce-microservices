# E-Commerce Backend - Auth Service

## Overview

This project is part of a production-style microservices-based E-Commerce Backend System built using Java Spring Boot.

Currently, the `auth-service` module has been implemented with secure JWT-based authentication using Spring Security.

The project is being developed to learn industry-level backend development concepts including:

* Spring Boot
* Spring Security
* JWT Authentication
* Microservices Architecture
* REST APIs
* Database Integration
* Secure Authentication & Authorization

---

# Features Implemented

## User Authentication

* User Registration API
* User Login API
* Password hashing using BCrypt
* JWT token generation after successful login

---

# Security Features

* Spring Security configuration using `SecurityFilterChain`
* Public and protected route configuration
* Stateless JWT authentication foundation
* CSRF disabled for JWT-based authentication
* Secure password hashing with BCrypt
* HMAC-SHA based JWT signing

---

# JWT Authentication

Implemented JWT token generation using:

* JJWT library
* HS256 signing
* Secure secret-key based signing
* Token expiration handling

JWT contains:

* Header
* Payload
* Signature

Implemented claims:

* `sub`
* `iat`
* `exp`

---

# Tech Stack

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* MySQL
* JWT (JJWT)
* Maven
* Lombok
* REST APIs
* Git & GitHub
* Postman

---

# Project Structure

```text
src/main/java
│
├── controller
├── service
├── repository
├── dto
├── config
├── entity
└── security
```

---

# APIs Implemented

## Register User

```http
POST /api/auth/register
```

### Request Body

```json
{
  "name": "Rohit",
  "email": "rohit@gmail.com",
  "password": "password123"
}
```

---

## Login User

```http
POST /api/auth/login
```

### Request Body

```json
{
  "email": "rohit@gmail.com",
  "password": "password123"
}
```

### Response

```json
{
  "token": "jwt-token"
}
```

---

# Concepts Learned

## Spring Security

* Authentication vs Authorization
* SecurityFilterChain
* Request authorization
* Protected APIs
* CSRF protection

---

## Dependency Injection & Spring Beans

* `@Configuration`
* `@Bean`
* `@Service`
* `@Autowired`
* Constructor Injection

---

## Spring Data JPA

* `JpaRepository`
* Custom query methods
* Automatic implementation generation

---

## JWT Internals

* Header, Payload, Signature
* Base64 Encoding
* HMAC-SHA256
* Token signing
* Token tampering protection
* Stateless authentication

---

# Current Status

Completed:

* Registration API
* Login API
* BCrypt password hashing
* JWT token generation
* Spring Security configuration

In Progress:

* JWT request validation
* JWT authentication filter
* Protected APIs

Planned:

* API Gateway
* Order Service
* Payment Service
* Role-based authorization
* Inter-service communication

---

# How to Run

## Clone Repository

```bash
git clone <your-repo-url>
```

---

## Configure Database

Update:

```properties
application.properties
```

with your MySQL credentials.

---

## Run Application

```bash
mvn spring-boot:run
```

---

# Author

Rohit Shaw

Backend Developer | Java Spring Boot Learner