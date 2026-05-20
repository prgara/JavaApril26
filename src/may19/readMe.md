Garbage collection is the process of automatically freeing up memory that is no longer being used by a program.
In Java, the garbage collector is responsible for identifying and removing objects that are no longer reachable 
by the application. This helps to prevent memory leaks and ensures efficient use of system resources.


StringBuilder - not thread safe 
stringbuffer - thread safe


String ? 

== reference equality 
.equals() -> check content


OOPs pillars
- Inheritance - inherit the properties and behavior from the another class.
- Polymorphism - many forms - ability of a method to behave differently
- Abstraction - hiding the implementation and showing necessary features.
- Encapsulation - bundling the data and method in a single unit.


# Inheritance
It allows one class to reuse the properties and behaviour of another class.

parent class - superclass
Child class - subclass
extends keyword
IS A relationship

Dog is a animal
employee is a human
manager is a employee
car is a vehicle

Family
Parent -> has surname, house
child -> automatically gets them
child can add new things (skill, job)

vehicle - start, stop
car - start, stop, ac/heat, music
bike - start, stop, kickStart

common behaviour in parent
specific behaviour in child

Employee - name, id, work() -> Superclass
Developer - writeCode(), name, id, work() -> Child class
Manager - name, id, work(), manageTeam() -> Child class

Why inheritance ?
- code reuse  -> DRY principle
- Centralized maintenance
- Extensibility without modification -> Open/closed principle

SOLID principles


- Create a vehicle class and then create car, bus and truck class and inherit the properties from vehicle class.

Types of inheritance
- Single inheritance -> one parent and one child class
- Multilevel inheritance -> A -> B -> C
- Hierarchical inheritance -> one parent and multiple child
- Multiple inheritance -> class A extends from B & C both -> java does not support

Diamond problem