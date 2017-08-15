CREATE TABLE Addresses
(
  id     INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  street VARCHAR(30)                    NOT NULL,
  city   VARCHAR(30)                    NOT NULL
);

CREATE TABLE Students
(
  id         INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  name       VARCHAR(30)                    NOT NULL,
  surname    VARCHAR(30)                    NOT NULL,
  course     VARCHAR(100)                   NOT NULL,
  address_id INT                            NOT NULL,
  FOREIGN KEY (address_id) REFERENCES Addresses (id)
);

CREATE TABLE Books
(
  id         INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  author     VARCHAR(30)                    NOT NULL,
  title      VARCHAR(30)                    NOT NULL,
  student_id INT,
  FOREIGN KEY (student_id) REFERENCES Students (id)
);