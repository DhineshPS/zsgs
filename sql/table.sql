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

CREATE TABLE student_favorites (
    student_id INT PRIMARY KEY,
    favorite_actor VARCHAR(100),
    favorite_actress VARCHAR(100),
    FOREIGN KEY (student_id) REFERENCES students(student_id)
);

CREATE TABLE student_fav_malls (
    student_id INT,
    mall_id INT,
    PRIMARY KEY (student_id, mall_id),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (mall_id) REFERENCES shopping_malls(mall_id)
);

CREATE TABLE student_fav_beaches(
    student_id INT,
    beach_id INT,
    PRIMARY KEY(student_id, beach_id),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (beach_id) REFERENCES beaches(beach_id)
);

CREATE TABLE student_fav_movies(
    student_id INT,
    movie_id INT,
    PRIMARY KEY(student_id, movie_id),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (movie_id) REFERENCES movies(movie_id)
);

-- 1. Students
INSERT INTO students (name, gender, contact_info) VALUES
('Arun Kumar', 'Male', 'arun.k@gmail.com'),
('Keerthi Raj', 'Female', 'keerthi.r@gmail.com'),
('Vignesh S', 'Male', 'vignesh.s@gmail.com'),
('Santhiya M', 'Female', 'santhiya.m@gmail.com'),
('Rajesh N', 'Male', 'rajesh.n@gmail.com'),
('Meena K', 'Female', 'meena.k@gmail.com'),
('Prakash D', 'Male', 'prakash.d@gmail.com'),
('Divya P', 'Female', 'divya.p@gmail.com'),
('Gowtham R', 'Male', 'gowtham.r@gmail.com'),
('Anjali T', 'Female', 'anjali.t@gmail.com');

-- 2. Genres
INSERT INTO genres (genre_name) VALUES
('Action'),
('Romance'),
('Comedy'),
('Thriller'),
('Drama'),
('Science Fiction'),
('Horror'),
('Fantasy');

-- 3. Student Movie Interests
INSERT INTO student_movie_interests (student_id, genre_id) VALUES
(1, 1), (1, 2), (1, 5),
(2, 2), (2, 4), (2, 5),
(3, 1), (3, 3), (3, 6),
(4, 2), (4, 5),
(5, 4), (5, 6), (5, 7),
(6, 2), (6, 3),
(7, 1), (7, 8),
(8, 3), (8, 6),
(9, 5), (9, 7),
(10, 2), (10, 4), (10, 8);

-- 4. Shopping Malls
INSERT INTO shopping_malls (mall_name, location) VALUES
('Phoenix MarketCity', 'Chennai'),
('Express Avenue', 'Chennai'),
('Brookefields Mall', 'Coimbatore'),
('Prozone Mall', 'Coimbatore'),
('Vishaal De Mall', 'Madurai'),
('Fun Mall', 'Salem'),
('Reliance Mall', 'Trichy');

-- 5. Beaches
INSERT INTO beaches (beach_name, location) VALUES
('Marina Beach', 'Chennai'),
('Elliots Beach', 'Chennai'),
('Silver Beach', 'Cuddalore'),
('Kanyakumari Beach', 'Kanyakumari'),
('Sothavilai Beach', 'Kanyakumari'),
('Serenity Beach', 'Pondicherry');

-- 6. Movies
INSERT INTO movies (movie_name, hero_name, heroine_name) VALUES
('Master', 'Vijay', 'Malavika Mohanan'),
('Asuran', 'Dhanush', 'Manju Warrier'),
('96', 'Vijay Sethupathi', 'Trisha'),
('Kaithi', 'Karthi', NULL),
('Soorarai Pottru', 'Suriya', 'Aparna Balamurali'),
('Thuppakki', 'Vijay', 'Kajal Aggarwal'),
('Love Today', 'Pradeep Ranganathan', 'Ivana'),
('Vikram', 'Kamal Haasan', 'Gayathrie');

-- 7. Student Favorites (Actor/Actress)
INSERT INTO student_favorites (student_id, favorite_actor, favorite_actress) VALUES
(1, 'Vijay', 'Nayanthara'),
(2, 'Dhanush', 'Sai Pallavi'),
(3, 'Suriya', 'Jyothika'),
(4, 'Karthi', 'Keerthy Suresh'),
(5, 'Vijay Sethupathi', 'Trisha'),
(6, 'Pradeep Ranganathan', 'Ivana'),
(7, 'Kamal Haasan', 'Simran'),
(8, 'Vijay', 'Samantha'),
(9, 'Dhanush', 'Megha Akash'),
(10, 'Vijay', 'Nayanthara');

-- 8. Student Favorite Malls
INSERT INTO student_fav_malls (student_id, mall_id) VALUES
(1, 1), (1, 2),
(2, 2), (2, 3),
(3, 3), (3, 4),
(4, 4), (4, 5),
(5, 5), (5, 6),
(6, 1), (6, 6),
(7, 7),
(8, 1), (8, 3),
(9, 6), (9, 7),
(10, 2), (10, 4);

-- 9. Student Favorite Beaches
INSERT INTO student_fav_beaches (student_id, beach_id) VALUES
(1, 1), (1, 2),
(2, 1), (2, 3),
(3, 3), (3, 4),
(4, 4), (4, 5),
(5, 5), (5, 6),
(6, 1), (6, 6),
(7, 2), (7, 3),
(8, 2), (8, 6),
(9, 3), (9, 4),
(10, 1), (10, 5);

-- 10. Student Favorite Movies
INSERT INTO student_fav_movies (student_id, movie_id) VALUES
(1, 1), (1, 6),
(2, 2), (2, 7),
(3, 3), (3, 4),
(4, 4), (4, 5),
(5, 5), (5, 8),
(6, 7),
(7, 8),
(8, 1), (8, 3),
(9, 2), (9, 6),
(10, 1), (10, 5);
