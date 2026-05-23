# Recap
- Inheritance, Polymorphism, Abs, Encapsulation
- extends keyword
- IS A relationship 
- inheritance has a tight coupling


car is a vehicle

car has a engine

# Composition
One class contains another class object.
it promotes loose coupling.

- HAS A relationship
- car has  a engine
- house has a room
- class has a student


this keyword -> refers to current object
super keyword -> refers to the parent object


object class is the parent/super class of each class.


# Polymorphism
same action , different behavior

- payment - debit,credit,UPI
- person - employee, father/son,friend

# Two types 
- compile time , static binding, method overloading
- runtime, dynamic binding, method overriding

# Method overloading 
-> same name  with different parameters  and 
- only changing return type will not be considered as method overloading.
- which method to be called is decided at compile time itself.

calculate the area of a square and rectangle using method overloading.
area of square - side * side
rectangle - length * width


java class - compile the class and then run the class

# Method overriding

which method to be called happens at runtime. 
basically we override the method of parent class.
first it will look in child class, otherwise go to parent class


- Do following exercise using runtime polymorphism.
Payment - pay
credit card payment
debit card payment
upi payment


