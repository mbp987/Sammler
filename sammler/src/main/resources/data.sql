DROP TABLE IF EXISTS banknotes;

CREATE TABLE banknotes (
id INTEGER PRIMARY KEY,
value INTEGER NOT NULL,
serial_number VARCHAR(30);

INSERT INTO banknotes (id, value, serial_number) VALUES (0001, 50, ‘AB12345’);