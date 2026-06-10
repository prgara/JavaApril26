# Recap
throw vs throws

type casting ?

try with resources 

wrapper class ? 

Boxing -> converting a primitive into its wrapper object
Unboxing -> converting a wrapper object into primitive

final vs finally vs finalize -> interview question

Wap to create a container class which will have student(name,rollNo) and course(courseName).
create container objects and print it.


Immutable class -> class whose objects cannot be changed after they are created.
- String
- Wrapper classes

How to create immutable class
- make class as final -> prevent subclass from overriding methods
- make all the fields as private and final -> no access from outside, value assigned only once.
- No setters -> don't provide any method to modify the value after construction.


                            Iterable I                           Map<K,V> I
                                |                               HashMap<K,V> C    
                            Collection I                    LinkedHashMap,TreeMap C
                                |
    List  I                    Set    I                     Queue I
    ArrayList  C              HashSet   C                    Deque
    LinkedList C             TreeSet     C                PriorityQueue
                           LinkedHashSet C


is map part of collection ?
collection interface - No
collection framework  - yes

