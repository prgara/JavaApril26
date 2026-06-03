abs class vs interface 

- JVM,JRE,JDK
- Garbage Collection
- Serialization/deserialisation

Exception -> which breaks the normal flow of execution of program.


Exception handling -> handle exceptions scenarios gracefully to maintain normal flow.

Error -> it is irreversible condition like power outage, system crash, out of memory, stack-overflow.


                        Throwable 
                   /             /
      Exception                 Error

Throwable class
Exception class
RuntimeException class
Error class

2 types of exceptions

- Compile-time exceptions    -> checked at compile time and must be handled or declared. Interrupted,IOException, SQLEXCEPTION,FileNotFound
- Runtime-exceptions -> occurs at runtime, not forced to handle. NullPointer exception, ArithmeticException


How to handle exception
- try
- catch
- finally
- throw
- throws


try {
// risky code
} catch (Exception e) {
// handle code
} finally {
// stmt will execute always
}

Flow
- JVM detects the exception
- create exception object
- search matching catch block
- execute catch block
- continues program


create an array of size 5 and add some elements and the try to fetch the 6th element
later if you get any exception try to handle it using try catch block


finally
- code that always executes
- used for cleanup, db connection closing etc.


open connection
task 
close connection


try catch
try catch finally
try finally




