-- 1. Friendship & Grouping by Common Interests

-- a. Students grouped by common movie genres
SELECT g.genre_name, GROUP_CONCAT(s.name) AS students
FROM student_movie_interests smi
JOIN students s ON smi.student_id = s.student_id
JOIN genres g ON smi.genre_id = g.genre_id
GROUP BY g.genre_id;

-- b. Students grouped by favorite actors
SELECT favorite_actor, GROUP_CONCAT(s.name) AS fans
FROM student_favorites sf
JOIN students s ON sf.student_id = s.student_id
GROUP BY favorite_actor;

-- c. Students grouped by favorite actresses
SELECT favorite_actress, GROUP_CONCAT(s.name) AS fans
FROM student_favorites sf
JOIN students s ON sf.student_id = s.student_id
GROUP BY favorite_actress;

-- d. Students grouped by common malls
SELECT sm.mall_name, GROUP_CONCAT(s.name) AS students
FROM student_fav_malls sfm
JOIN students s ON sfm.student_id = s.student_id
JOIN shopping_malls sm ON sfm.mall_id = sm.mall_id
GROUP BY sm.mall_id;

-- e. Students grouped by common favorite movies
SELECT m.movie_name, GROUP_CONCAT(s.name) AS fans
FROM student_fav_movies sfm
JOIN students s ON sfm.student_id = s.student_id
JOIN movies m ON sfm.movie_id = m.movie_id
GROUP BY m.movie_id;

-- 2. Personalized Meetup Suggestions

-- a. Common favorite beaches
SELECT b.beach_name, GROUP_CONCAT(DISTINCT s.name) AS visitors
FROM student_fav_beaches sfb
JOIN students s ON sfb.student_id = s.student_id
JOIN beaches b ON sfb.beach_id = b.beach_id
GROUP BY b.beach_name;

-- b. Common shopping malls
SELECT sm.mall_name, GROUP_CONCAT(DISTINCT s.name) AS regulars
FROM student_fav_malls sfm
JOIN students s ON sfm.student_id = s.student_id
JOIN shopping_malls sm ON sfm.mall_id = sm.mall_id
GROUP BY sm.mall_name;

-- c. Common favorite movies
SELECT m.movie_name, GROUP_CONCAT(DISTINCT s.name) AS fans
FROM student_fav_movies sfm
JOIN students s ON sfm.student_id = s.student_id
JOIN movies m ON sfm.movie_id = m.movie_id
GROUP BY m.movie_id;

-- 3. Popular Culture Insights

-- a. Most liked actor
SELECT favorite_actor, COUNT(*) AS total_likes
FROM student_favorites
GROUP BY favorite_actor
ORDER BY total_likes DESC
LIMIT 1;

-- b. Most liked actress
SELECT favorite_actress, COUNT(*) AS total_likes
FROM student_favorites
GROUP BY favorite_actress
ORDER BY total_likes DESC
LIMIT 1;

-- c. Most popular movie genre
SELECT g.genre_name, COUNT(*) AS interest_count
FROM student_movie_interests smi
JOIN genres g ON smi.genre_id = g.genre_id
GROUP BY g.genre_id
ORDER BY interest_count DESC
LIMIT 1;

-- d. Top 5 favorite movies
SELECT m.movie_name, COUNT(*) AS fan_count
FROM student_fav_movies sfm
JOIN movies m ON sfm.movie_id = m.movie_id
GROUP BY m.movie_id
ORDER BY fan_count DESC
LIMIT 5;

-- 4. Specific Questions (Extra Query Set)

-- a. Who loves romantic movies?
SELECT DISTINCT s.name
FROM students s
JOIN student_movie_interests smi ON s.student_id = smi.student_id
JOIN genres g ON smi.genre_id = g.genre_id
WHERE g.genre_name = 'Romance';

-- b. Which beach is the most popular?
SELECT b.beach_name, COUNT(DISTINCT sfb.student_id) AS popularity
FROM student_fav_beaches sfb
JOIN beaches b ON sfb.beach_id = b.beach_id
GROUP BY b.beach_name
ORDER BY popularity DESC
LIMIT 1;

-- c. What are the top favorite actors?
SELECT favorite_actor, COUNT(*) AS total_fans
FROM student_favorites
GROUP BY favorite_actor
ORDER BY total_fans DESC
LIMIT 5;

-- d. Which movie can most people agree on watching together?
SELECT m.movie_name, COUNT(sfm.student_id) AS total_fans
FROM student_fav_movies sfm
JOIN movies m ON sfm.movie_id = m.movie_id
GROUP BY m.movie_id
ORDER BY total_fans DESC
LIMIT 1;
