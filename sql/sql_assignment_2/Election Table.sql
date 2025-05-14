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
    candidate_id INT PRIMARY KEY,
    party_id INT,
    candidate_name VARCHAR(100),
    thoguthi_id INT,
    district_id INT,
    FOREIGN KEY (party_id) REFERENCES Parties(party_id),
    FOREIGN KEY (thoguthi_id) REFERENCES Thoguthis(thoguthi_id),
    FOREIGN KEY (district_id) REFERENCES Districts(district_id)
);

CREATE TABLE Results (
    result_id INT PRIMARY KEY,
    candidate_id INT,
    votes INT,
    FOREIGN KEY (candidate_id) REFERENCES Candidates(candidate_id)
);

INSERT INTO Parties (party_id, party_name)
VALUES
(1, 'DMK'),
(2, 'ADMK'),
(3, 'TVK');

INSERT INTO Districts (district_id, district_name)
VALUES
(1, 'Chennai'),
(2, 'Kancheepuram');

INSERT INTO Thoguthis (thoguthi_id, thoguthi_name, district_id)
VALUES
(1, 'Vadapanani', 1),
(2, 'Choolaimedu', 1),
(3, 'Kundrathur', 2);

INSERT INTO Candidates (candidate_id, party_id, candidate_name, thoguthi_id, district_id)
VALUES
(1, 1, 'Sai', 1, 1),
(2, 1, 'Vignesh', 2, 1),
(3, 2, 'Mukesh', 3, 2),
(4, 3, 'Gurusamy', 1, 1),
(5, 3, 'Sneha', 2, 1);

INSERT INTO Results (result_id, candidate_id, votes)
VALUES
(1, 1, 50000),
(2, 2, 30000),
(3, 3, 60000),
(4, 4, 70000),
(5, 5, 40000);

