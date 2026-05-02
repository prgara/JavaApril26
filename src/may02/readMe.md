class ?
method ?

types of variables
- instance var -> belongs to the class and have a default value
- local var -> var inside a method and they should be initialized before using

parameters -> input while defining methods
arguments -> input while calling the methods

Exercise - 1
1. Create a Student class with attributes: name (String), grade1, grade2, grade3 (all doubles).
2. Add a method getAverage() that returns the average of the three grades.
3. Add a method getLetterGrade() — returns "A" if avg ≥ 90, "B" if ≥ 80, "C" if ≥ 70, "F" otherwise.
4. Add a method printReport() — prints name, average, and letter grade.
5. Create 3 Student objects and print a report for each.

Exercise - 2
Create a calculator class and add 4 methods to do add, sub, multiplication and division.
take user input to perform the operations by calling these methods in Main class.

constructor -> it is a special method which is used to initialize the object
it is always of same name as class name
no return type, not even void
Java will always create a default constructor
but if you have a param const then you have to create a default one if you want to use it.






type of constructors
- default constructor
- parameterized constructor

this -> refers to the current object.

car.java ---------- car.class
javac car



wap to create a Bank class having bankBalance,customerName, bankAccount and create a param const to initialize values.
methods -> deposit, withdraw and displayBalance
In main class create an object of bank class and print the details.






