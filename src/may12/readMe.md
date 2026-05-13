static block - loads into the memory before even the static methods 
no need to call static block, gets called automatically

Instance block gets executed when object of the class is created.


this keyword is used to refer the current obj.



String -> char array.... sequence of chars treated as a single object.
it is non-primitive data type and it is a class also.

Strings are Immutable - value cannot be changed once assigned. 
heap & stack

ways to create a string
- new keyword
- string literal - memory saved, optimized performance.

stack will store the ref and heap will store the object when created with new keyword.

String Constant Pool is a special area in heap when string literals are stored.
Hello


string a = hello
string b = hello
string c = new String("hello);


string a = "hello world";


string methods
- length
- uppercase
- lowercase
- charAt
- indexOf
- isEmpty

- WAP to reverse a string.
- WAP to count the num of vowels in a string
abcdei -> 3
hjhyu -> 0
- WAP to check if string is palindrome ?
madam -> yes
hello -> no

StringBuilder - mutable & not thread-safe
StringBuffer - mutable & thread-safe


Interview question - > String vs StringBuilder vs StringBuffer





