CREATE DATABASE clientdb;
CREATE USER 'clientdb'@'localhost' IDENTIFIED BY '123';
GRANT ALL PRIVILEGES ON clientdb.* TO 'clientdb'@'localhost';

use clientdb;

create table client_user(
    id bigint auto_increment primary key,
    username varchar(100),
    password varchar(150),
    access_token varchar(100) NULL,
    access_token_validity datetime NULL,
    refresh_token varchar(100) NULL
);

insert into client_user
(username, password)
value
('dandi', '$2a$04$K1l0.LhhGvG55CxRWj7s.uPpFqpbQ/alTMbdrIYGyeKuj2vLlZK5K');