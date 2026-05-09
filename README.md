# Auth Service - E-commerce Microservices Project

This is the Auth Service of a production-style E-commerce backend project built using Java Spring Boot and Microservices architecture.

## Features Implemented

- User Registration API
- DTO Validation
- Email Validation
- Phone Number Validation
- Duplicate Email Check
- Duplicate Phone Number Check
- MySQL Integration
- Spring Data JPA
- Layered Architecture
- REST APIs

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST API
- Lombok

## API Endpoint

### Register User

POST /api/auth/register

### Sample Request

```json
{
  "name": "rohit",
  "email": "rohit@gmail.com",
  "password": "secret123",
  "phoneno": "9876543210"
}
```

## Project Structure

- controller
- service
- repository
- entity
- dto

## Upcoming Features

- BCrypt Password Encryption
- Login API
- JWT Authentication
- Role-Based Authorization
- Global Exception Handling
- API Gateway
- Service Discovery