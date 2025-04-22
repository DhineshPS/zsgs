CREATE DATABASE zoho;

USE zoho;

CREATE TABLE students(
student_id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
gender VARCHAR(100),
contact_info VARCHAR(255)
);

CREATE TABLE genres(
genre_id INT AUTO_INCREMENT PRIMARY KEY,
genre_name VARCHAR(50) 
);

CREATE TABLE student_movie_interests(
student_id INT,
genre_id INT,
PRIMARY KEY(student_id, genre_id),
FOREIGN KEY (student_id) REFERENCES students(student_id),
FOREIGN KEY (genre_id) REFERENCES genres(genre_id)
);

CREATE TABLE shopping_malls( 
mall_id INT AUTO_INCREMENT PRIMARY KEY,
mall_name VARCHAR(100),
location VARCHAR(100)
);

CREATE TABLE beaches(
beach_id INT AUTO_INCREMENT PRIMARY KEY,
beach_name VARCHAR(100),
location VARCHAR(100)
);

CREATE TABLE movies(
movie_id INT AUTO_INCREMENT PRIMARY KEY,
movie_name VARCHAR(100),
hero_name VARCHAR(100),
heroine_name VARCHAR(100)
);

CREATE TABLE students_favorites(
student_id INT PRIMARY KEY,
favorite_actor VARCHAR(100),
favorite_actress VARCHAR(100),
FOREIGN KEY (student_id) REFERENCES students(student_id)
);

CREATE TABLE students_fav_malls (
student_id INT,
mall_id INT,
PRIMARY KEY (student_id, mall_id),
FOREIGN KEY (student_id) REFERENCES students(student_id),
FOREIGN KEY (mall_id) REFERENCES shopping_malls(mall_id)
);

CREATE TABLE student_fav_beaches(
student_id INT,
movie_id INT,
PRIMARY KEY(student_id, movie_id),
FOREIGN KEY (student_id) REFERENCES students(student_id),
FOREIGN KEY (movie_id) REFERENCES movies(movie_id)
);
