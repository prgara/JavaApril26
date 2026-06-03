# Recap
- override static method ?
- method hiding ?
- purpose of making a var private ?
- why getter & setter ?
- overloading vs overriding
- inheritance vs composition


Inheritance tells who you are
Encapsulation tells how to protect data
Abstraction tells what to expose and what to hide

Modifiers - access (private,public,default, protected) &
non-access (static, final, abstract )

Abstraction is hiding the implementation and showing only the functionality.

# 2 ways to achieve abstraction
- abstract class (0-100)
- interfaces (100)

Characteristics of abstract class
- object cannot be created.
- may or may not have an abstract method.
- abstract method does not have body.
- can have constructor
- can have instance variables.
- abstract method only exist in abs class.

Exercise - 1
abstract class BankAccount which will have concrete method deposit & abs method withdraw
concrete class - SavingAccount & CheckingAccount which will inherit the BankAccount

Exercise - 2 
Create an abs class Vehicle with abs method move() and concrete method fuel()
Create Car & Bike and extend Vehicle to override move method.  

Interface -> It is a contract which a class must adhere to.

- All the method in interface are by default abstract.
- No concrete method allowed
- No object for interface
- No constructor allowed
- can have instance variables
- variables are by default public, static & final

class to class -> extends
interface to class -> implements
interface to interface -> extends


Why interface when we have abstract class ?
Multiple inheritance is allowed with help of interface.


Duck -> swim, fly

Dog 
Employee
Robot

when to use abstract class and when to use interface ?
- Common identity - abstract class
- Multiple inheritance - interface
  what you are - abstract class
  what you can do - interface



using interface create a concrete class SmartPrinter which will inherit properties from
printer, scanner, fax







