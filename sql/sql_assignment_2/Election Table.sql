CREATE DATABASE election;
USE election;

CREATE TABLE Parties (
    party_id INT PRIMARY KEY,
    party_name VARCHAR(100) NOT NULL
);

CREATE TABLE Districts (
    district_id INT PRIMARY KEY,
    district_name VARCHAR(100) NOT NULL
);

CREATE TABLE Thoguthis (
    thoguthi_id INT PRIMARY KEY,
    thoguthi_name VARCHAR(100) NOT NULL,
    district_id INT,
    FOREIGN KEY (district_id) REFERENCES Districts(district_id)
);

CREATE TABLE Candidates (
    candidate_id INT AUTO_INCREMENT PRIMARY KEY,
    party_id INT,
    candidate_name VARCHAR(100),
    thoguthi_id INT,
    district_id INT,
    FOREIGN KEY (party_id) REFERENCES Parties(party_id),
    FOREIGN KEY (thoguthi_id) REFERENCES Thoguthis(thoguthi_id),
    FOREIGN KEY (district_id) REFERENCES Districts(district_id)
);

CREATE TABLE Results (
    result_id INT AUTO_INCREMENT PRIMARY KEY,
    candidate_id INT,
    votes INT,
    FOREIGN KEY (candidate_id) REFERENCES Candidates(candidate_id)
);

INSERT INTO Parties VALUES
(1, 'DMK'),
(2, 'ADMK'),
(3, 'TVK'),
(4, 'BJP'),
(5, 'INC');

INSERT INTO Districts VALUES
(1, 'Chennai'),
(2, 'Kancheepuram'),
(3, 'Madurai'),
(4, 'Coimbatore'),
(5, 'Trichy');

INSERT INTO Thoguthis VALUES
(1, 'Vadapalani', 1),
(2, 'Choolaimedu', 1),
(3, 'Arumbakkam', 1),

(4, 'Tambaram', 2),
(5, 'Kundrathur', 2),
(6, 'Sriperumbudur', 2),

(7, 'Thirunagar', 3),
(8, 'Akka Nagar', 3),
(9, 'Anna Nagar', 3),

(10, 'Gandhipuram', 4),
(11, 'Kovai', 4),
(12, 'R.K Nagar', 4),

(13, 'Srirangam', 5),
(14, 'Kuruku Theru', 5),
(15, 'Thillai Nagar', 5);

INSERT INTO Candidates (party_id, candidate_name, thoguthi_id, district_id)
SELECT
    p.party_id,
    CONCAT(p.party_name, '_', t.thoguthi_name),
    t.thoguthi_id,
    t.district_id
FROM Parties p
JOIN Thoguthis t;

DELIMITER $$

CREATE PROCEDURE GenerateVotes()
BEGIN
    INSERT INTO Results (candidate_id, votes)
    SELECT candidate_id, FLOOR(20000 + (RAND() * (100000 - 20000 + 1))) FROM Candidates;
END$$

DELIMITER ;

CALL GenerateVotes();
