create table implementers
(
    id INTEGER not null,
    name VARCHAR(20) not null,
    city VARCHAR(20) not null,
    primary key (id)
)
;
INSERT INTO implementers (id, name, city) VALUES(101, 'John', 'London');
INSERT INTO implementers (id, name, city) VALUES(102, 'Tom', 'Paris');
INSERT INTO implementers (id, name, city) VALUES(103, 'Sam', 'New York');
INSERT INTO implementers (id, name, city) VALUES(104, 'Peter', 'London');
INSERT INTO implementers (id, name, city) VALUES(106, 'Bill', 'Paris');
INSERT INTO implementers (id, name, city) VALUES(107, 'Steve', 'New York');