Database -> It is an organised collection of structured data
Characteristic
- organised
- Persistent
- easy retrieval/ Queryable
- Secure

Types of DBs
- NoSql -> Collection , document, key-value pair
- Relational/SQL -> Structured query language - tables with rows & columns

MySql, Postgre, MicrosoftSQL, OracleDB
MongoDb, Redis 

RDBMS -> Relational DB management system

SQL - It is used to communicate with relational database. 

DDL
DML
DCL
TCL -> transaction Control language ---- manage transaction

create database pragra;
drop database pragra
use databaseName;
show tables;


create database pragar;
use employee_db;
use sys;

show tables;

select * from employees;
select id, name,salary from employees;
select distinct address from employees;

select * from employees where address = "USA";
select * from employees where address = "UK";
select * from employees where name = "John Smith";
select * from employees where salary > 70000;
select * from employees where salary BETWEEN 60000 AND 75000;
SELECT * from employees LIMIT 5 offset 14;
select * from employees ORDER BY name desc;
describe employees;
select * from employees where address IN ("USA","UK");

select * from employees where address = "USA" AND gender = "Female";

select * from employees where name LIKE '%ow%';
select * from employees where address LIKE 'U_';
select * from employees where address IS NOT NULL;












