# Pythagorean Checker

A **Spring Boot + MySQL web app** that checks if a number is a Pythagorean triple (`a² + b² = c²`) and calculates the average of `a, b, c`. Past calculations are stored in a **history table** and viewable via a **Bootstrap 5 modal**.

---

## Features

- Check numbers for Pythagorean triples.
- View `A`, `B`, `C`, and their average.
- Save and view history with timestamps.
- Minimalist dark UI with **Bootstrap 5**.

---

## Setup

1. **Clone the repo**  
```bash
git clone <repo_url>
cd pythagorean-checker
```
2. **Import the database in MySQL Workbench:**
```bash
CREATE DATABASE pythagorean_db;
-- import SQL dump if provided
```

2. **Import the database in MySQL Workbench:**
```bash
CREATE DATABASE pythagorean_db;
-- import SQL dump if provided
```

2. **Configure application.properties:**
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/pythagorean_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```

4. **Run the app**
```bash
mvn spring-boot:run
```
Open http://localhost:8080







