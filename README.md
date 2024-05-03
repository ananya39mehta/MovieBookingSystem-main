<h1>Neuplex: Movie Booking System for Cinemas</h1>

This project implements a movie booking system for cinema halls named Neuplex. It's built with Java using JavaFX for the user interface and a MySQL database for data storage.

Features
Browse movies currently playing at Neuplex cinemas.
View show timings and available seats for each movie.
Select seats and book tickets for a chosen show.
(Optional) User accounts for managing bookings and past purchases.
Technologies Used
Java
JavaFX
MySQL Connector/J
Prerequisites
Java 21 
MySQL database server (https://dev.mysql.com/downloads/mysql/)
JavaFX SDK 17 (usually included with Java installation)
Setup
Clone this repository:

Bash
git clone https://github.com/your-username/neuplex-booking-system.git
Use code with caution.
content_copy
Configure the database connection details:

Edit src/main/resources/application.properties.

Update the following properties with your MySQL credentials:

Properties
spring.datasource.url=jdbc:mysql://localhost:3306/neuplex_db
spring.datasource.username=your_username
spring.datasource.password=your_password
Use code with caution.
content_copy
(Optional) If using user accounts, create the necessary database tables by running the SQL script src/main/resources/schema.sql.

Build and run the application:

Bash
mvn clean package
java -jar target/neuplex-booking-system-1.0.jar
Use code with caution.
content_copy
