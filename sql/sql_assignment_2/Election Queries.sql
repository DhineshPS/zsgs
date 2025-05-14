-- Queries
-- Finding Winner and Loser in a specific city (district, thoguthi)

SELECT c.candidate_name, p.party_name, r.votes
FROM Results r
JOIN Candidates c ON r.candidate_id = c.candidate_id
JOIN Parties p ON c.party_id = p.party_id
WHERE c.district_id = 1 AND c.thoguthi_id = 1
ORDER BY r.votes DESC
LIMIT 1; -- Winner

SELECT c.candidate_name, p.party_name, r.votes
FROM Results r
JOIN Candidates c ON r.candidate_id = c.candidate_id
JOIN Parties p ON c.party_id = p.party_id
WHERE c.district_id = 1 AND c.thoguthi_id = 1
ORDER BY r.votes ASC
LIMIT 1; -- Loser

-- Finding the regions that the party lost 
SELECT t.thoguthi_name
FROM Thoguthis t
JOIN Candidates c ON t.thoguthi_id = c.thoguthi_id
JOIN Parties p ON c.party_id = p.party_id
JOIN Results r ON c.candidate_id = r.candidate_id
WHERE p.party_name = 'DMK'
GROUP BY t.thoguthi_id, t.thoguthi_name
HAVING SUM(r.votes) < (
    SELECT MAX(r2.votes)
    FROM Candidates c2
    JOIN Results r2 ON c2.candidate_id = r2.candidate_id
    WHERE c2.thoguthi_id = t.thoguthi_id
);


-- Finding the regions that the party lost in a specific district
SELECT t.thoguthi_name
FROM Thoguthis t
JOIN Candidates c ON t.thoguthi_id = c.thoguthi_id
JOIN Parties p ON c.party_id = p.party_id
JOIN Results r ON c.candidate_id = r.candidate_id
WHERE p.party_name = 'DMK'
  AND c.district_id = 1
GROUP BY t.thoguthi_id, t.thoguthi_name
HAVING SUM(r.votes) < (
    SELECT MAX(r2.votes)
    FROM Candidates c2
    JOIN Results r2 ON c2.candidate_id = r2.candidate_id
    WHERE c2.thoguthi_id = t.thoguthi_id
);


-- Finding the regions that the party lost in a specific district and thoguthi
SELECT t.thoguthi_name
FROM Thoguthis t
JOIN Candidates c ON t.thoguthi_id = c.thoguthi_id
JOIN Parties p ON c.party_id = p.party_id
JOIN Results r ON c.candidate_id = r.candidate_id
WHERE p.party_name = 'DMK'
  AND c.district_id = 1
  AND c.thoguthi_id = 1
GROUP BY t.thoguthi_id, t.thoguthi_name
HAVING SUM(r.votes) < (
    SELECT MAX(r2.votes)
    FROM Candidates c2
    JOIN Results r2 ON c2.candidate_id = r2.candidate_id
    WHERE c2.thoguthi_id = 1
);


-- To Find the party we can partner with in the next election in a specific district
SELECT p.party_name
FROM Results r
JOIN Candidates c ON r.candidate_id = c.candidate_id
JOIN Parties p ON c.party_id = p.party_id
WHERE c.district_id = 1
GROUP BY p.party_name
ORDER BY SUM(r.votes) DESC
LIMIT 1 OFFSET 1; 

-- To Find the party we can partner with in the next election in whole Tamil Nadu
SELECT p.party_name
FROM Results r
JOIN Candidates c ON r.candidate_id = c.candidate_id
JOIN Parties p ON c.party_id = p.party_id
GROUP BY p.party_name
ORDER BY SUM(r.votes) DESC
LIMIT 1; 


-- To find the number of votes taken by each party in Tamil Nadu 
SELECT p.party_name, SUM(r.votes) AS total_votes
FROM Results r
JOIN Candidates c ON r.candidate_id = c.candidate_id
JOIN Parties p ON c.party_id = p.party_id
GROUP BY p.party_name;
