-- Create the Neuplex database
CREATE DATABASE Neuplex;

-- Switch to the Neuplex database
USE Neuplex;

-- Create the user table
CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    user_type VARCHAR(50) NOT NULL
);

-- Create the movies table
CREATE TABLE movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    av_tickets INT NOT NULL,
    price_ticket DOUBLE NOT NULL,
    image LONGBLOB
);

-- Create the discount table
CREATE TABLE discount (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    pct DOUBLE NOT NULL
);

-- Create the tickets table
CREATE TABLE tickets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    quantity INT NOT NULL,
    total_price DOUBLE NOT NULL,
    movies_id INT NOT NULL,
    discount_id INT,
    user_id INT NOT NULL,
    FOREIGN KEY (movies_id) REFERENCES movies(id),
    FOREIGN KEY (discount_id) REFERENCES discount(id),
    FOREIGN KEY (user_id) REFERENCES user(id)
);

-- Create the review table
CREATE TABLE review (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tickets_id INT NOT NULL,
    review TEXT,
    FOREIGN KEY (tickets_id) REFERENCES tickets(id)
);

SELECT * FROM movies;
ALTER TABLE movies DROP COLUMN time_end;

