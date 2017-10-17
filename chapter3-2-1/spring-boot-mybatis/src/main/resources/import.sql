drop table if exists user;
CREATE TABLE user
(
  id int primary key NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL ,
  age int NOT NULL
);
INSERT INTO user (name,age) VALUES ("wuqf",20);
INSERT INTO user (name,age) VALUES ("xiaohong",21);
INSERT INTO user (name,age) VALUES ("xiaoming",23);
INSERT INTO user (name,age) VALUES ("xiaoming",24);