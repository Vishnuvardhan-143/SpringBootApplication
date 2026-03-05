# Book Management API (Spring Boot)

A simple **REST API built with Spring Boot** for managing books.
The application demonstrates a basic backend architecture using **Controller → Service → Repository → Database** layers.

The project exposes REST endpoints to create and manage books and uses an **H2 in-memory database** for persistence.

---

## Tech Stack

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven
* Postman (API testing)

---

## Project Structure

```
bookapplication
│
├── controller
│   └── BookController.java
│
├── service
│   └── BookService.java
│
├── repository
│   └── BookRepository.java
│
├── entity
│   └── Book.java
│
└── BookApplication.java
```

Architecture flow:

```
Client (Postman)
      ↓
Controller
      ↓
Service
      ↓
Repository
      ↓
Database (H2)
```

---

## How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/bookapplication.git
cd bookapplication
```

### 2. Run the Application

Using Maven wrapper:

```
./mvnw spring-boot:run
```

or run the main class:

```
BookApplication.java
```

The server will start on:

```
http://localhost:8080
```

---

## H2 Database Console

Open in browser:

```
http://localhost:8080/h2-console
```

Connection settings:

```
JDBC URL: jdbc:h2:mem:testdb
Username: root
Password: Password
```

---

## API Endpoints

### Create Book

```
POST /book/v1/addBook
```

Example request body:

```json
{
  "title": "Harry Potter",
  "author": "J. K. Rowling",
  "genre": "Fantasy"
}
```

Example response:

```json
{
  "id": 1,
  "title": "Harry Potter",
  "author": "J. K. Rowling",
  "genre": "Fantasy"
}
```

---

## Testing with Postman

1. Open Postman
2. Select **POST** method
3. URL:

```
http://localhost:8080/book/v1/addBook
```

4. Go to **Body → raw → JSON**
5. Paste the JSON request and send.

---

## Features

* RESTful API design
* Layered architecture
* H2 in-memory database
* Spring Data JPA integration
* Simple CRUD structure

---

## Future Improvements

* Add full CRUD operations
* Add validation using `@Valid`
* Add exception handling
* Connect to MySQL or PostgreSQL
* Add Swagger API documentation
* Add unit tests

---

## Author

Vizz
Aspiring Software Engineer | Interested in Backend Development, AI, and Data Science
