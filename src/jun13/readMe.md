# Recap

Immutable class ?
- private final variables
- class final
- no setters

Collection framework
it is set of class & interfaces which is used to store and manipulate the group of objects.à
work with objects only -> wrapper classes

List -> It is an ordered collection, contain duplicates
ArrayList, linkedList


ArrayList -> It is a resizeable-array (dynamic) implementation of the List. ordered, duplicates
size vs capacity ?
By default, the list of size 10 will be created.
when it will reach 100% capacity it will grow by 1.5X

Arraylist is of continuous/contiguous memory location


you have to store 1500 elements  - what would you use ?

0         1         2        3        4
1x0B12 - 1X0B13 - 1X0B14 - 1X0B15 - 1X0B16

ArrayList of 1000 elements and you want to insert a new element at pos 5.
list.get(5);

Manipulation is costly in arrayList. Don't use it when you have to frequently insert or delete element from it
because it will invoke shifting of the elements to adjust the addition or deletion.
Use arraylist when you want to access element by an index. Fast retrieval of element.

O(1) - 10
O(n) - 10
Big(O) notation

java 7 -> 10
java 8 -> 0

Loop over arraylist
- traditional for loop
- for each loop

ConcurrentModificationException - > 

fail-fast iterators -> when you try to modify the list it will throw ConcurrentModificationException
fail-safe iterators




