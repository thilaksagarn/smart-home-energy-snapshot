# Smart Home Energy Snapshot

This project is a **Spring Boot** application that collects and manages energy usage data from smart home devices. It provides a RESTful API to store, retrieve, and update energy consumption data in a **PostgreSQL** database.

---

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Setup Instructions](#setup-instructions)
   - [Prerequisites](#prerequisites)
   - [Steps to Run the Project](#steps-to-run-the-project)
4. [API Documentation](#api-documentation)
   - [Base URL](#base-url)
   - [Endpoints](#endpoints)
5. [Testing with Postman](#testing-with-postman)
   - [Import the Collection](#import-the-collection)
   - [Set Up Environment Variables](#set-up-environment-variables)
   - [Test the Endpoints](#test-the-endpoints)
6. [Database Schema](#database-schema)
7. [Contributing](#contributing)

---

## Why We Chose This Stack

### **Backend: Spring Boot (Java)**
We chose **Spring Boot** for the backend because:
- **Robust and Scalable**: Spring Boot is a mature framework that supports building scalable and maintainable applications.
- **RESTful API Support**: It provides excellent support for building RESTful APIs, which are essential for this project.
- **Database Integration**: Spring Data JPA simplifies database interactions, making it easy to work with **PostgreSQL**.

### **Database: PostgreSQL**
We chose **PostgreSQL** because:
- **Reliability**: PostgreSQL is a powerful, open-source relational database known for its reliability and performance.
- **ACID Compliance**: It ensures data integrity, which is crucial for storing energy usage data.
- **Scalability**: PostgreSQL can handle large datasets and complex queries efficiently.

---

## Problem-Solving Approach

### **1. Understand Requirements**
- Store, retrieve, and update energy usage data.

### **2. Design Solution**
- Created RESTful API endpoints.
- Designed a database schema for `energy_usage`.

### **3. Implement Solution**
- Built backend with Spring Boot.
- Tested API with Postman.

### **4. Iterate and Improve**
- Added validation and error handling.
- Documented API for easy use.

---

## Features
- **Store Energy Data**: Save energy consumption data from smart home devices.
- **Retrieve Energy Data**: Fetch energy usage records by device or timestamp.
- **Update Energy Data**: Modify existing energy usage records.
- **Database Integration**: Uses **PostgreSQL** for persistent storage.

---

## Technologies Used
- **Backend**: Spring Boot (Java)
- **Database**: PostgreSQL
- **API Testing**: Postman
- **Build Tool**: Maven
- **Version Control**:intelliJ IDEA

---

## Setup Instructions

### Prerequisites
1. **Java Development Kit (JDK)**: Ensure you have JDK 17 or later installed.
2. **PostgreSQL**: Install and set up PostgreSQL on your machine.
3. **Postman**: Install Postman for testing the API.

### Steps to Run the Project
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/smart-home-energy-snapshot.git
   cd smart-home-energy-snapshot/backend
2. **Set Up PostgreSQL**:
   ```bash
    Create a database named energy_db.
3. **Build and Run the Application**:
   ```bash
   ./mvnw clean package
   java -jar target/energy-1.0.0.jar
4. **Access the API**:
   ```bash
   The application will run on http://localhost:8081

# API Documentation

This document provides detailed information about the RESTful API endpoints for the **Smart Home Energy Snapshot** project. The API allows you to store, retrieve, and update energy usage data from smart home devices.

---

## Base URL
   http://localhost:8081/api/energy


---

## Endpoints

### 1. **Get All Energy Usage Records**
- **Method**: `GET`
- **URL**: `/api/energy`
- **Description**: Fetches all energy usage records from the database.
- **Response**:
  ```json
  [
    {
      "id": 1,
      "applianceName": "Microwave",
      "energyConsumed": 1.2,
      "applianceId": 6,
      "timestamp": "2025-03-02T17:35:23.322Z"
    },
    {
      "id": 2,
      "applianceName": "Refrigerator",
      "energyConsumed": 5.0,
      "applianceId": 7,
      "timestamp": "2025-03-02T18:00:00.000Z"
    }
  ]
 ### 2. **Create a New Energy Usage Record**
- **Method**: `POST`

- **URL**: `/api/energy`

- **Description**: Saves a new energy usage record in the database.
- **Request Body**:
  ```json
  {
  "applianceName": "Microwave",
  "energyConsumed": 1.2,
  "applianceId": 6,
  "timestamp": "2025-03-02T17:35:23.322Z"
}

- **Response**:
  ```json
  {
  "id": 1,
  "applianceName": "Microwave",
  "energyConsumed": 1.2,
  "applianceId": 6,
  "timestamp": "2025-03-02T17:35:23.322Z"
}

### 3. **Update an Existing Energy Usage Record**
- **Method**: `PUT`

- **URL**: `/api/energy/{id}`

- **Description**:Updates an existing energy usage record by ID..
- **Request Body**:
  ```json
  {
  "applianceName": "Microwave",
  "energyConsumed": 1.5,
  "applianceId": 6,
  "timestamp": "2025-03-02T17:35:23.322Z"
}

- **Response**:
  ```json
  {
  "id": 1,
  "applianceName": "Microwave",
  "energyConsumed": 1.5,
  "applianceId": 6,
  "timestamp": "2025-03-02T17:35:23.322Z"
}

