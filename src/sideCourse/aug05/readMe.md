Data types in SQL

- INT  -- 25
- DECIMAL -- 1234.56
- FLOAT
- DOUBLE
- CHAR -- Fixed length string
- VARCHAR -- variable length string
- TEXT
- DATE
- TIME
- DATETIME
- TIMESTAMP -- stores date & time (often auto updated)
- BOOLEAN
- BLOB -- Binary data , images, PDF

-- create table --
create table STUDENTS (
StudentId INT PRIMARY KEY AUTO_INCREMENT,
FirstName VARCHAR(50) NOT NULL,
LastName varchar(50) NOT NULL,
Email VARCHAR(100) UNIQUE,
DateOfBirth DATE ,
EnrollmentDate TIMESTAMP DEFAULT current_timestamp
);


-- insert single record --
INSERT INTO STUDENTS (FirstName, LastName, Email, DateOfBirth) values
('PARTH','Contractor','path@gmail.com','1995-05-15' );

-- insert multiple records --
INSERT INTO STUDENTS (FirstName, LastName, Email, DateOfBirth) values
('Sejal','Sejal','sejal@gmail.com','1995-06-15' ),
('Sandeep','Aulakh','sandeep@gmail.com','1995-05-15' );

UPDATE STUDENTS SET lastname = 'Singh', email = 'singh@gmail.com' where studentId = 5;
Delete from STUDENTS where studentid > 7;
ALTER table STUDENTS MODIFY email VARCHAR(100) NOT NULL;


A table can have only 1 primary key.
primary key vs unique key -- 
Foreign key -> primary key from one table will become the foreign key in another table. 

SELECT COUNT(*) AS ABC FROM STUDENTS;

SELECT gender, SUM(salary) AS AVG_Salary from employees GROUP BY gender;


JOIN -> It allows you to combine the data from multiple tables based on related columns.

Inner -- Return records with matching values in both the tables. 
Left -- Return all records from left table + matches from the right table.
Right -- Return all records from right table + matches from the left table.
Full -- return all records from both the tables.
LEFT-JOIN UNION RIGHT-JOIN = FULL JOIN in MYSQL

-- INNER JOIN --
Select s.student_name, c.course_name, e.grade from Student s
INNER JOIN Enrollment e
on e.student_id = s.student_id
INNER JOIN Course c
on e.course_id = c.course_id;

-- LEFT JOIN --
Select s.student_name, c.course_name, e.grade from Student s
LEFT JOIN Enrollment e
on e.student_id = s.student_id
LEFT JOIN Course c
on e.course_id = c.course_id;

-- RIGHT JOIN --
Select s.student_name, c.course_name, e.grade from Student s
RIGHT JOIN Enrollment e
on e.student_id = s.student_id
RIGHT JOIN Course c
on e.course_id = c.course_id;

In pragra DB, create a table with your name and 3 columns atleast and use primary, NOT NULL & deafult constraint
Lastly add atleast 3 records in the table.


Stored procedure --> A stored procedure is a prepared SQL code that you can save, so the code can be reused
over and over again.



-> find second highest salary ???
select MAX(salary) AS second_highest from employees where salary < (
select MAX(Salary) from employees
) ;

select name, salary from employees order by salary desc  LIMIT 1 OFFSET 2;

-----------------------------------------------------------------------------------

Index are data structures that speeds up the data retrieval.

Create Index index_email on Students(Email); ----- create a simple index.
Create Index index_name on Students(Email, FirstName); ----- create a composite index.
Drop Index index_name on Students; ----- drop the index



Transactions ---> It is a sequence of SQL operations that either all succeed or all fails.

# ACID properties
A - Atomicity - All or none
C - Consistency - DB moves from one valid state to another
I - Isolation - Concurrent txs don't interfere with each other.
D - Durability - Commited data persist even after system failure.


Bank transfer
A -- 100$ debited from account A and 100$ credit to account B. Both should succeed or both should fail.
C -- Total money should remain same.
I -- Another txs should not interfere here.
D -- Once confirmed, transfer won't be lost.

BEGIN Transaction;
INSERT into ACCOUNTS(Id, amount) value (1, 100);
INSERT into ACCOUNTS(Id, amount) value (2, 500);
-- if everything is correct --
COMMIT;
-- or if there is an error --
ROLLBACK;


NoSQL -- 
-- Document  --- mongoDB, Couchbase, DynamoDb
-- Key-value --- Redis, Memcache
--serach --- elasticsearch


MongoDb -- it stores data in JSON like documents. it is designed for flexibility and stability. 
 SQL                    NoSQL
Database               Database
Table                  Collection
Row                    Document
Column                 Field
Index                  Index


{
_id: ObjectId('59b99db4cfa9a34dcd7885b6'),
name: 'Ned Stark 1',
email: 'sean_bean@gameofthron.es',
password: '$2b$12$UREFwsRUoyF0CRqGNK0LzO0HM/jLhgUCNNIJ9RJAqMUQ74crlJ1Vu'
}

use dbname --- to switch to that db
db.collectionName.find() -- show all the documents in the collection
db.users.find().limit(2).skip(1) -- limit and skip
db.users.find({"name":"Jaime Lannister"})
db.movies.find({"runtime":{$lt:10}})
eq - equals
ne - not equals
gt - graeter than
lt - less than
and
or
in  -- {status:{$in:["inactive","active"]}}
nin

db.users.updateOne({"name":"Ned Stark 1"},{$set:{"email": "stark@gmail.com"}})
db.users.updateMany({"age":{$gt:15}}},{$set:{"email": "stark@gmail.com"}})
-set
-unset
-push
-pull

db.users.deleteOne({"name":"Ned Stark 1"})


db.movies.aggregate([
{ $match: { runtime: { $lt: 10 } } }, 
{
$group: {
_id: "$rated",
count: { $sum: 1 }
}
}
])



