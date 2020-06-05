create database MonstersSchool;
use MonstersSchool;
create table students(
id int key auto_increment,
name varchar(30),
class varchar(30) 
);
insert into students(name,class) values
('rabbit','1A');
insert into students(name,class) values
('ice bear','2A');
create table teachers(
id int key auto_increment,
name varchar(30),
address varchar(30)
);
insert into teachers(name,address) values
('Ms Huong','BJ');
insert into teachers(name,address) values
('Ms Quynh','LA');
create table subjects(
id int key auto_increment,
name varchar(30),
level varchar(30)
);
insert into subjects(name,level) values
('Swimming','Beginner');
insert into subjects(name,level) values
('Flying','Advanced');
create table user (
id int key auto_increment,
name varchar(30),
address varchar(50),
mobile varchar(10)
);

insert into user (name, address, mobile) values ("Huong","Nam Dinh","012345667");
insert into user (name, address, mobile) values ("Ha","Vinh Phuc","083946368");