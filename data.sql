DROP TABLE IF EXISTS USER_DB;

CREATE TABLE USER_DB (
                         id INT AUTO_INCREMENT  PRIMARY KEY,
                         name VARCHAR(250) NOT NULL,
                         points INT NOT NULL
);

INSERT INTO USER_DB (name, points) VALUES
('Eugene', 10);

INSERT INTO USER_DB (name, points) VALUES
('Matthew', 10);

select * from USER_DB;