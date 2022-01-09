CREATE TABLE BANKNOTES (
id INT AUTO_INCREMENT PRIMARY KEY,
country VARCHAR(40) NOT NULL,
currency VARCHAR(25),
valueb INT NOT NULL,
issue_year INT,
issue_institution VARCHAR(30),
city VARCHAR(20),    
serial_number VARCHAR(30) NOT NULL,
conditionb VARCHAR(10),
error BOOLEAN,
details VARCHAR(50),
other VARCHAR(5)
);