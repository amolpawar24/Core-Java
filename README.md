# ☕ Core Java

> 🚀 A hands-on Core Java journey covering Java fundamentals, OOP, Collections Framework, Exception Handling, Multithreading, JVM concepts, and advanced Core Java concepts through practical programs and examples.

---

## 📚 Core Java Roadmap

```text
Java Introduction
      ↓
JDK / JRE / JVM
      ↓
Java Installation & Setup
      ↓
Java Program Structure
      ↓
Java Tokens
      ↓
Keywords & Identifiers
      ↓
Variables & Data Types
      ↓
Type Casting
      ↓
Operators
      ↓
Input & Output
      ↓
Decision Making
      ↓
Loops
      ↓
Jump Statements
      ↓
Methods
      ↓
Arrays
      ↓
Strings
      ↓
Classes & Objects
      ↓
Constructors
      ↓
Constructor Chaining
      ↓
Encapsulation
      ↓
Inheritance
      ↓
Polymorphism
      ↓
Abstraction
      ↓
Interfaces
      ↓
Packages & Access Modifiers
      ↓
Exception Handling
      ↓
Wrapper Classes
      ↓
Inner Classes
      ↓
Generics
      ↓
Collections Framework
      ↓
File Handling & I/O
      ↓
Java 8+ Features
      ↓
Lambda Expressions
      ↓
Stream API
      ↓
Multithreading
      ↓
Concurrency
      ↓
JVM & Memory Management
      ↓
Garbage Collection
      ↓
Reflection & Annotations
      ↓
Regular Expressions
      ↓
Practice Programs
```

---

# 1. Introduction to Java

* What is Java?
* History of Java
* Why Java?
* Features of Java
* Advantages of Java
* Limitations of Java
* Applications of Java
* Java Editions
* Java SE
* Java EE / Jakarta EE
* Java ME
* Java versions
* Java Development Environment
* Platform Independent
* WORA — Write Once, Run Anywhere
* Java as an object-oriented language
* Java as a strongly typed language

---

# 2. JDK, JRE & JVM

## JDK — Java Development Kit

* Java compiler
* Java launcher
* Development tools
* Javadoc
* Debugging tools

## JRE — Java Runtime Environment

* JVM
* Java class libraries
* Runtime environment

## JVM — Java Virtual Machine

* Loads bytecode
* Verifies bytecode
* Executes bytecode
* Provides runtime environment

### Relationship

```text
JDK
 └── JRE
      └── JVM
```

### Java Execution Flow

```text
Java Source Code
      ↓
   .java
      ↓
   javac
      ↓
   Bytecode
      ↓
    .class
      ↓
     JVM
      ↓
 Machine Code
```

---

# 3. Java Installation & Setup

* Install JDK
* Configure JAVA_HOME
* Configure PATH
* Check Java version
* Compile Java program
* Run Java program
* Command-line execution
* IDE setup

### Popular IDEs

* IntelliJ IDEA
* Eclipse
* VS Code

---

# 4. Java Program Structure

* Source file
* Class
* Main method
* Statements
* Expressions
* Blocks
* Comments
* Single-line comments
* Multi-line comments
* Documentation comments
* Compilation
* Execution
* Bytecode

### First Java Program

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, Java!");

    }
}
```

---

# 5. Java Tokens

Java tokens are the smallest individual elements of a Java program.

## Types of Tokens

1. Keywords
2. Identifiers
3. Literals
4. Operators
5. Separators

---

# 6. Java Keywords

Important Java keywords:

```text
abstract
assert
boolean
break
byte
case
catch
char
class
continue
default
do
double
else
enum
extends
final
finally
float
for
if
implements
import
instanceof
int
interface
long
native
new
package
private
protected
public
return
short
static
strictfp
super
switch
synchronized
this
throw
throws
transient
try
void
volatile
while
```

Also understand Java literals:

```text
true
false
null
```

---

# 7. Identifiers

Identifiers are names given to Java program elements.

Identifiers can represent:

* Classes
* Interfaces
* Methods
* Variables
* Objects
* Packages

## Identifier Rules

* Cannot start with a digit
* Cannot contain spaces
* Cannot use Java keywords
* Can contain letters, digits, `_`, `$`
* Java is case-sensitive

## Naming Conventions

```text
ClassName
methodName()
variableName
CONSTANT_NAME
package.name
```

---

# 8. Variables

* What is a variable?
* Variable declaration
* Variable initialization
* Variable assignment
* Local variables
* Instance variables
* Static variables
* Variable scope
* Variable lifetime
* Constants
* `final` variables
* `var` keyword

Example:

```java
int age = 25;
String name = "Amol";
```

---

# 9. Data Types

## Primitive Data Types

### Integer Types

* byte
* short
* int
* long

### Floating-Point Types

* float
* double

### Character

* char

### Boolean

* boolean

## Reference Data Types

* String
* Arrays
* Classes
* Interfaces
* Enums
* Objects

---

# 10. Type Casting

## Widening Casting

```text
byte
 ↓
short
 ↓
int
 ↓
long
 ↓
float
 ↓
double
```

Example:

```java
int number = 100;

double value = number;
```

## Narrowing Casting

```java
double number = 100.50;

int value = (int) number;
```

Topics:

* Implicit casting
* Explicit casting
* Widening conversion
* Narrowing conversion
* Type conversion

---

# 11. Operators

## Arithmetic Operators

```text
+
-
*
/
%
```

## Unary Operators

```text
+
-
++
--
!
```

## Assignment Operators

```text
=
+=
-=
*=
/=
%=
&=
|=
^=
<<=
>>=
>>>=
```

## Relational Operators

```text
==
!=
>
<
>=
<=
```

## Logical Operators

```text
&&
||
!
```

## Bitwise Operators

```text
&
|
^
~
```

## Shift Operators

```text
<<
>>
>>>
```

## Ternary Operator

```java
condition ? value1 : value2;
```

## instanceof Operator

```java
object instanceof ClassName
```

---

# 12. Input & Output

## Output

```java
System.out.print();
System.out.println();
System.out.printf();
```

## Input Using Scanner

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your name: ");

String name = scanner.nextLine();
```

## Input Methods

* next()
* nextLine()
* nextInt()
* nextDouble()
* nextFloat()
* nextBoolean()
* nextLong()

## Other Input Methods

* BufferedReader
* Command-line arguments

---

# 13. Decision Making Statements

Decision-making statements execute code based on conditions.

## if Statement

```java
if (condition) {

    // code

}
```

## if-else Statement

```java
if (condition) {

    // true

} else {

    // false

}
```

## else-if Ladder

```java
if (condition1) {

} else if (condition2) {

} else if (condition3) {

} else {

}
```

## Nested if

```java
if (condition) {

    if (anotherCondition) {

    }

}
```

## switch Statement

```java
switch (value) {

    case 1:
        break;

    case 2:
        break;

    default:
        break;
}
```

## Modern Switch

* Switch expressions
* Arrow labels
* `yield`

---

# 14. Loops

Loops repeatedly execute a block of code.

## for Loop

```java
for (int i = 1; i <= 10; i++) {

    System.out.println(i);

}
```

## while Loop

```java
while (condition) {

    // code

}
```

## do-while Loop

```java
do {

    // code

} while (condition);
```

## Enhanced for Loop

```java
for (int number : numbers) {

    System.out.println(number);

}
```

## Nested Loops

* Nested for loop
* Nested while loop
* Nested do-while loop
* Mixed loops

---

# 15. Jump Statements

## break

Terminates a loop or switch.

## continue

Skips the current iteration.

## return

Terminates method execution and optionally returns a value.

---

# 16. Methods

A method is a block of code designed to perform a specific task.

## Method Structure

```java
accessModifier returnType methodName(parameters) {

    // method body

}
```

---

# 17. Types of Methods

## Predefined Methods

```java
System.out.println();
Math.max();
String.length();
```

## User-Defined Methods

```java
void display() {

    System.out.println("Hello");

}
```

## Static Methods

```java
static void display() {

}
```

## Instance Methods

```java
void display() {

}
```

## Parameterized Methods

```java
void add(int a, int b) {

}
```

## Non-Parameterized Methods

```java
void display() {

}
```

## Returning Methods

```java
int add(int a, int b) {

    return a + b;

}
```

## Void Methods

```java
void display() {

}
```

## Recursive Methods

A method that calls itself.

```java
int factorial(int n) {

    if (n == 0) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

## Varargs Methods

```java
void display(int... numbers) {

}
```

---

# 18. Method Overloading

Method overloading means having multiple methods with the same name but different parameters.

```java
void add(int a, int b) {

}

void add(int a, int b, int c) {

}

void add(double a, double b) {

}
```

### Overloading Can Differ By

* Number of parameters
* Parameter types
* Parameter order

### Important

Return type alone cannot be used for method overloading.

---

# 19. Arrays

Arrays store multiple values of the same type.

## One-Dimensional Array

```java
int[] numbers = {10, 20, 30, 40};
```

Topics:

* Declaration
* Initialization
* Traversal
* Searching
* Sorting
* Copying
* Updating
* Iteration

## Two-Dimensional Array

```java
int[][] matrix = {

    {1, 2},
    {3, 4}

};
```

## Multi-Dimensional Arrays

* 2D arrays
* 3D arrays
* Jagged arrays

## Arrays Utility Class

```java
Arrays.sort();
Arrays.copyOf();
Arrays.equals();
Arrays.toString();
Arrays.binarySearch();
```

---

# 20. Strings

## String

* String creation
* String literals
* String objects
* String pool
* String immutability

## Important String Methods

```text
length()
charAt()
substring()
equals()
equalsIgnoreCase()
compareTo()
contains()
indexOf()
lastIndexOf()
replace()
replaceAll()
split()
trim()
strip()
toUpperCase()
toLowerCase()
startsWith()
endsWith()
concat()
```

## StringBuilder

* Mutable strings
* append()
* insert()
* delete()
* replace()
* reverse()

## StringBuffer

* Mutable strings
* Synchronized
* Thread-safe

## String Comparison

* `==`
* `equals()`
* `equalsIgnoreCase()`
* `compareTo()`

---

# 21. Classes & Objects

## Class

A class is a blueprint for creating objects.

## Object

An object is an instance of a class.

```java
class Student {

    String name;
    int age;

}

Student student = new Student();
```

Topics:

* Object creation
* Object reference
* Instance variables
* Instance methods
* Anonymous objects
* Object lifecycle

---

# 22. Constructors

A constructor is a special member used to initialize an object.

## Constructor Rules

* Same name as the class
* No return type
* Called automatically when an object is created

---

# 23. Types of Constructors

## Default Constructor

The compiler provides a default constructor when no constructor is explicitly declared.

## No-Argument Constructor

```java
Student() {

}
```

## Parameterized Constructor

```java
Student(String name, int age) {

    this.name = name;
    this.age = age;

}
```

## Constructor Overloading

```java
Student() {

}

Student(String name) {

}

Student(String name, int age) {

}
```

---

# 24. Constructor Chaining

Constructor chaining means calling one constructor from another constructor.

## Constructor Chaining Using this()

```java
class Student {

    Student() {

        this("Unknown");

    }

    Student(String name) {

        System.out.println(name);

    }

}
```

## Constructor Chaining Using super()

```java
class Child extends Parent {

    Child() {

        super();

    }

}
```

### Types

```text
Same Class
    ↓
this()

Parent Class
    ↓
super()
```

### Important Rule

`this()` or `super()` must be the first statement inside a constructor.

---

# 25. this Keyword

The `this` keyword refers to the current object.

Uses:

* Access current object's variables
* Resolve variable conflicts
* Call current class method
* Call current class constructor
* Pass current object
* Return current object

---

# 26. super Keyword

The `super` keyword refers to the parent class.

Uses:

* Access parent class variable
* Access parent class method
* Call parent class constructor

---

# 27. Encapsulation

Encapsulation means wrapping data and methods together and controlling access to the data.

Common implementation:

* private variables
* public getters
* public setters

```java
class Student {

    private String name;

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

}
```

---

# 28. Inheritance

Inheritance allows one class to acquire properties and methods from another class.

```java
class Animal {

}

class Dog extends Animal {

}
```

## Types of Inheritance

* Single inheritance
* Multilevel inheritance
* Hierarchical inheritance
* Multiple inheritance through interfaces

### IS-A Relationship

```text
Dog IS-A Animal
```

### HAS-A Relationship

```text
Car HAS-A Engine
```

---

# 29. Polymorphism

Polymorphism means "many forms."

## Compile-Time Polymorphism

* Method overloading

## Runtime Polymorphism

* Method overriding
* Dynamic method dispatch

---

# 30. Method Overriding

Method overriding occurs when a child class provides its own implementation of a parent class method.

```java
class Animal {

    void sound() {

        System.out.println("Animal Sound");

    }

}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog Barks");

    }

}
```

---

# 31. Abstraction

Abstraction hides implementation details and exposes only essential functionality.

## Abstract Class

```java
abstract class Animal {

    abstract void sound();

}
```

## Interface

```java
interface Vehicle {

    void start();

}
```

---

# 32. Interfaces

* Interface declaration
* Implementing interfaces
* Multiple interfaces
* Interface inheritance
* Default methods
* Static methods
* Private interface methods
* Functional interfaces

Keywords:

```text
interface
implements
```

---

# 33. Access Modifiers

## public

Accessible from anywhere.

## private

Accessible only inside the same class.

## protected

Accessible within the same package and through inheritance.

## default

Accessible within the same package.

```text
private
default
protected
public
```

---

# 34. Packages

Packages organize related classes and interfaces.

Topics:

* Creating packages
* User-defined packages
* Built-in packages
* import statement
* static import
* Package naming conventions
* Access across packages

Common packages:

```text
java.lang
java.util
java.io
java.nio
java.time
java.math
java.text
```

---

# 35. static Keyword

Topics:

* Static variables
* Static methods
* Static blocks
* Static nested classes
* Static initialization
* Static vs instance members

Example:

```java
class Counter {

    static int count = 0;

}
```

---

# 36. final Keyword

## final Variable

Cannot be reassigned.

## final Method

Cannot be overridden.

## final Class

Cannot be inherited.

```java
final int MAX_VALUE = 100;
```

---

# 37. Wrapper Classes

Primitive → Wrapper

```text
byte    → Byte
short   → Short
int     → Integer
long    → Long
float   → Float
double  → Double
char    → Character
boolean → Boolean
```

Topics:

* Autoboxing
* Unboxing
* Parsing
* Wrapper methods
* Primitive vs wrapper

---

# 38. Enum

* Enum declaration
* Enum constants
* Enum constructors
* Enum fields
* Enum methods
* Enum with switch
* values()
* valueOf()

---

# 39. Exception Handling

Exception handling manages runtime problems and allows programs to respond gracefully to exceptional situations.

## Keywords

```text
try
catch
finally
throw
throws
```

---

# 40. Exception Hierarchy

```text
Throwable
   |
   ├── Error
   |
   └── Exception
        |
        ├── RuntimeException
        |
        └── Other Exceptions
```

## Checked Exceptions

Examples:

```text
IOException
FileNotFoundException
SQLException
```

## Unchecked Exceptions

Examples:

```text
NullPointerException
ArithmeticException
ArrayIndexOutOfBoundsException
NumberFormatException
ClassCastException
IllegalArgumentException
```

## Errors

Examples:

```text
OutOfMemoryError
StackOverflowError
```

---

# 41. Exception Handling Topics

* try
* catch
* finally
* Multiple catch
* Nested try
* try-with-resources
* throw
* throws
* Exception propagation
* Exception chaining
* Custom exceptions
* Checked vs unchecked exceptions

---

# 42. Custom Exceptions

Creating your own exception classes.

```java
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {

        super(message);

    }

}
```

Topics:

* Checked custom exception
* Unchecked custom exception
* throw
* throws

---

# 43. Inner Classes

* Member inner class
* Static nested class
* Local inner class
* Anonymous inner class

---

# 44. Generics

Generics provide type safety and allow classes and methods to work with different types.

## Generic Class

```java
class Box<T> {

    T value;

}
```

## Generic Method

```java
<T> void display(T value) {

    System.out.println(value);

}
```

Topics:

* Generic classes
* Generic methods
* Generic interfaces
* Type parameters
* Multiple type parameters
* Bounded types
* Wildcards
* `?`
* `? extends`
* `? super`
* Type erasure

---

# 45. Collections Framework

The Java Collections Framework provides interfaces and classes for storing and manipulating groups of objects.

## Main Structure

```text
Iterable
   |
Collection
   |
   ├── List
   ├── Set
   └── Queue

Map
```

---

# 46. List

## ArrayList

* Dynamic array
* Allows duplicates
* Maintains insertion order

## LinkedList

* Doubly linked list
* List operations
* Queue operations
* Deque operations

## Vector

* Legacy synchronized dynamic array

## Stack

* LIFO
* push()
* pop()
* peek()
* search()

---

# 47. Set

## HashSet

* Unique elements
* Hash-based
* No guaranteed ordering

## LinkedHashSet

* Unique elements
* Maintains insertion order

## TreeSet

* Unique elements
* Sorted order
* Natural ordering
* Custom ordering

---

# 48. Queue

## Queue

* FIFO

Methods:

```text
add()
offer()
remove()
poll()
element()
peek()
```

## PriorityQueue

* Priority-based ordering
* Natural ordering
* Custom comparator

## Deque

* Double-ended queue

## ArrayDeque

* Efficient deque implementation

---

# 49. Map

Maps store data as key-value pairs.

## HashMap

* Key-value storage
* Unique keys
* Hashing

## LinkedHashMap

* Maintains insertion order

## TreeMap

* Sorted keys
* Natural ordering
* Custom ordering

## Hashtable

* Legacy synchronized map
* Does not allow null keys or values

---

# 50. Iterator

* Iterable
* Iterator
* ListIterator

Methods:

```text
hasNext()
next()
remove()
forEachRemaining()
```

---

# 51. Comparable & Comparator

## Comparable

Used for natural ordering.

```java
compareTo()
```

## Comparator

Used for custom ordering.

```java
compare()
```

Topics:

* Sorting objects
* Custom sorting
* Multiple sorting conditions
* Lambda Comparator

---

# 52. Collections Utility Class

Important methods:

```text
sort()
reverse()
shuffle()
min()
max()
frequency()
binarySearch()
swap()
rotate()
fill()
```

---

# 53. File Handling

Topics:

* Create file
* Read file
* Write file
* Delete file
* Rename file
* File properties
* Directory handling

Important classes:

```text
File
Path
Files
```

---

# 54. Java I/O

## Byte Streams

* InputStream
* OutputStream
* FileInputStream
* FileOutputStream

## Character Streams

* Reader
* Writer
* FileReader
* FileWriter

## Buffered Streams

* BufferedInputStream
* BufferedOutputStream
* BufferedReader
* BufferedWriter

---

# 55. Java NIO

* Path
* Paths
* Files
* Channels
* Buffers
* DirectoryStream
* StandardOpenOption

---

# 56. Serialization

Serialization converts an object into a byte stream.

Topics:

* Serialization
* Deserialization
* Serializable
* ObjectOutputStream
* ObjectInputStream
* serialVersionUID
* transient keyword

---

# 57. Date & Time API

Modern Java Date-Time API:

```text
LocalDate
LocalTime
LocalDateTime
ZonedDateTime
Instant
Duration
Period
```

Topics:

* Date creation
* Time creation
* Date formatting
* Date parsing
* Date calculations
* Time zones

---

# 58. Java Math API

Math class methods:

```text
abs()
max()
min()
pow()
sqrt()
random()
round()
ceil()
floor()
```

---

# 59. Java 8+ Features

## Lambda Expressions

```java
(a, b) -> a + b
```

## Functional Interfaces

* Predicate
* Consumer
* Supplier
* Function
* BiPredicate
* BiConsumer
* BiFunction
* UnaryOperator
* BinaryOperator

## Method References

```text
ClassName::methodName
```

## Optional

```text
Optional
of()
ofNullable()
empty()
isPresent()
ifPresent()
orElse()
orElseGet()
orElseThrow()
```

---

# 60. Stream API

## Stream Creation

* Collection streams
* Array streams
* Stream.of()

## Intermediate Operations

```text
filter()
map()
flatMap()
distinct()
sorted()
limit()
skip()
peek()
```

## Terminal Operations

```text
forEach()
collect()
reduce()
count()
min()
max()
findFirst()
findAny()
anyMatch()
allMatch()
noneMatch()
```

## Collectors

```text
toList()
toSet()
toMap()
joining()
groupingBy()
partitioningBy()
counting()
summarizingInt()
```

---

# 61. Multithreading

Multithreading allows multiple threads to execute concurrently.

## Concepts

* Process
* Thread
* Multitasking
* Multithreading
* Concurrency
* Parallelism

---

# 62. Creating Threads

## Extending Thread

```java
class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Thread Running");

    }

}
```

## Implementing Runnable

```java
class MyTask implements Runnable {

    @Override
    public void run() {

        System.out.println("Task Running");

    }

}
```

## Callable

* Callable
* Future
* FutureTask

---

# 63. Thread Lifecycle

```text
NEW
 ↓
RUNNABLE
 ↓
RUNNING
 ↓
BLOCKED
 ↓
WAITING
 ↓
TIMED_WAITING
 ↓
TERMINATED
```

---

# 64. Thread Methods

```text
start()
run()
sleep()
join()
interrupt()
yield()
currentThread()
isAlive()
setName()
getName()
setPriority()
getPriority()
```

---

# 65. Synchronization

Synchronization controls access to shared resources.

Topics:

* Race condition
* Critical section
* synchronized method
* synchronized block
* Object lock
* Class lock
* Intrinsic lock

---

# 66. Inter-Thread Communication

Methods:

```text
wait()
notify()
notifyAll()
```

Topics:

* Thread communication
* Thread coordination
* Monitor concept
* Producer-Consumer problem

---

# 67. Executor Framework

Package:

```java
java.util.concurrent
```

Topics:

* Executor
* ExecutorService
* Executors
* Callable
* Future
* FutureTask
* ScheduledExecutorService
* ThreadPoolExecutor
* Thread pools

---

# 68. Concurrent Collections

* ConcurrentHashMap
* CopyOnWriteArrayList
* BlockingQueue
* ArrayBlockingQueue
* LinkedBlockingQueue
* ConcurrentLinkedQueue

---

# 69. Atomic Classes

Package:

```java
java.util.concurrent.atomic
```

Topics:

* AtomicInteger
* AtomicLong
* AtomicBoolean
* AtomicReference
* CAS — Compare-And-Set

---

# 70. Locks

* Lock
* ReentrantLock
* ReadWriteLock
* ReentrantReadWriteLock
* StampedLock

---

# 71. Multithreading Problems

* Race condition
* Deadlock
* Starvation
* Livelock
* Thread contention

---

# 72. JVM Architecture

```text
Java Source Code
       ↓
     javac
       ↓
    Bytecode
       ↓
      JVM
       ↓
 ┌──────────────────┐
 │ Class Loader     │
 │ Runtime Memory   │
 │ Execution Engine │
 │ JNI              │
 │ Native Libraries │
 └──────────────────┘
```

## Runtime Memory Areas

* Heap
* Stack
* Method Area
* PC Register
* Native Method Stack

## Execution Engine

* Interpreter
* JIT Compiler
* Garbage Collector

---

# 73. Memory Management

* Stack memory
* Heap memory
* Method area
* Object allocation
* Object references
* Memory leaks
* StackOverflowError
* OutOfMemoryError

---

# 74. Garbage Collection

* What is Garbage Collection?
* Eligible objects
* `System.gc()`
* Garbage Collection basics
* Mark and Sweep concepts
* Generational concepts
* Garbage Collector basics

---

# 75. Object Class

Every Java class ultimately inherits from `Object`.

Important methods:

```text
toString()
equals()
hashCode()
getClass()
clone()
```

Topics:

* Object class
* Object identity
* `==` vs `equals()`
* Equality
* Hashing
* hashCode contract

---

# 76. Reflection API

Package:

```java
java.lang.reflect
```

Topics:

* Class object
* Class information
* Fields
* Methods
* Constructors
* Dynamic object creation
* Accessing members

---

# 77. Annotations

Built-in annotations:

```text
@Override
@Deprecated
@SuppressWarnings
@FunctionalInterface
@SafeVarargs
```

Topics:

* Custom annotations
* Annotation elements
* Retention policies
* Target
* Runtime annotations

---

# 78. Assertions

* assert keyword
* Assertion syntax
* Enabling assertions
* Disabling assertions
* Assertion use cases

---

# 79. Regular Expressions

Package:

```java
java.util.regex
```

Classes:

* Pattern
* Matcher

Topics:

* Character classes
* Quantifiers
* Groups
* Matching
* Searching
* Replacing

---

# 80. Internationalization

* Locale
* ResourceBundle
* Number formatting
* Date formatting
* Currency formatting

---

# 81. Core Java Best Practices

* Follow Java naming conventions
* Use meaningful variable names
* Use meaningful method names
* Keep methods focused
* Prefer encapsulation
* Prefer composition where appropriate
* Handle exceptions properly
* Avoid unnecessary static usage
* Use immutable objects where appropriate
* Write clean and readable code
* Follow DRY
* Follow KISS
* Apply SOLID principles
* Document important logic
* Avoid duplicate code

---

# 82. Practice Programs

## Basic Programs

* Hello World
* Even or Odd
* Positive or Negative
* Largest Number
* Smallest Number
* Calculator
* Swap Numbers
* Leap Year

## Number Programs

* Prime Number
* Factorial
* Fibonacci Series
* Palindrome Number
* Armstrong Number
* Reverse Number
* Sum of Digits
* Perfect Number
* Strong Number
* Neon Number

## Pattern Programs

* Star Pattern
* Number Pattern
* Pyramid
* Inverted Pyramid
* Diamond
* Floyd's Triangle
* Pascal's Triangle

## String Programs

* Reverse String
* String Palindrome
* Anagram
* Count Characters
* Count Vowels
* Character Frequency
* Remove Duplicate Characters
* String Compression
* First Non-Repeated Character

## Array Programs

* Find Maximum
* Find Minimum
* Second Largest
* Reverse Array
* Sort Array
* Search Element
* Remove Duplicates
* Merge Arrays
* Missing Number
* Duplicate Elements
* Frequency of Elements

## OOP Programs

* Student Management
* Employee Management
* Bank Account
* Vehicle Hierarchy
* Shape Hierarchy
* Library Management
* Shopping Cart
* Payment System

## Collections Programs

* ArrayList Operations
* LinkedList Operations
* HashSet Operations
* LinkedHashSet Operations
* TreeSet Operations
* HashMap Operations
* LinkedHashMap Operations
* TreeMap Operations
* Object Sorting
* Frequency Counting

## Multithreading Programs

* Creating Threads
* Runnable
* Callable
* Synchronization
* Producer-Consumer
* ExecutorService
* Thread Pool
* Locks
* Concurrent Collections

---

# 83. Core Java vs Advanced Java

This repository focuses on **Core Java and the Java Standard Library**.

## Core Java

```text
Java Fundamentals
Java Syntax
Tokens
Keywords
Identifiers
Variables
Data Types
Operators
Decision Making
Loops
Methods
Arrays
Strings
Classes & Objects
Constructors
Constructor Chaining
Encapsulation
Inheritance
Polymorphism
Abstraction
Interfaces
Packages
Access Modifiers
Exception Handling
Wrapper Classes
Inner Classes
Generics
Collections Framework
File Handling
I/O
NIO
Serialization
Date & Time
Lambda Expressions
Functional Interfaces
Optional
Stream API
Multithreading
Concurrency
JVM
Memory Management
Garbage Collection
Reflection
Annotations
Regular Expressions
```

## Advanced Java / Backend Java

These topics can be maintained separately:

```text
JDBC
Servlets
JSP
JSTL
Java Web Applications
Spring
Spring Boot
Spring MVC
Spring Security
Hibernate
JPA
REST APIs
Microservices
Enterprise Applications
```

> The boundary between Core Java and Advanced Java can vary by curriculum. This repository keeps enterprise technologies and backend frameworks separate so that the Core Java repository remains focused on the Java language, standard APIs, JVM, Collections, and concurrency.

---

# 84. Suggested Repository Structure

```text
Core-Java/
│
├── 01-Java-Introduction/
├── 02-JDK-JRE-JVM/
├── 03-Java-Installation-Setup/
├── 04-Java-Program-Structure/
├── 05-Java-Tokens/
├── 06-Keywords/
├── 07-Identifiers/
├── 08-Variables/
├── 09-Data-Types/
├── 10-Type-Casting/
├── 11-Operators/
├── 12-Input-Output/
│
├── 13-Decision-Making/
│   ├── If/
│   ├── If-Else/
│   ├── Else-If/
│   ├── Nested-If/
│   └── Switch/
│
├── 14-Loops/
│   ├── For/
│   ├── While/
│   ├── Do-While/
│   ├── Enhanced-For/
│   └── Nested-Loops/
│
├── 15-Jump-Statements/
│   ├── Break/
│   ├── Continue/
│   └── Return/
│
├── 16-Methods/
│   ├── Static-Methods/
│   ├── Instance-Methods/
│   ├── Parameterized-Methods/
│   ├── Return-Type-Methods/
│   ├── Recursive-Methods/
│   ├── Varargs/
│   └── Method-Overloading/
│
├── 17-Arrays/
├── 18-Strings/
│
├── 19-OOP/
│   ├── Classes-and-Objects/
│   ├── Constructors/
│   ├── Constructor-Chaining/
│   ├── This-Keyword/
│   ├── Super-Keyword/
│   ├── Encapsulation/
│   ├── Inheritance/
│   ├── Polymorphism/
│   ├── Abstraction/
│   └── Interfaces/
│
├── 20-Access-Modifiers/
├── 21-Packages/
├── 22-Static/
├── 23-Final/
├── 24-Wrapper-Classes/
├── 25-Enum/
│
├── 26-Exception-Handling/
├── 27-Custom-Exceptions/
├── 28-Inner-Classes/
├── 29-Generics/
│
├── 30-Collections-Framework/
│   ├── List/
│   │   ├── ArrayList/
│   │   ├── LinkedList/
│   │   ├── Vector/
│   │   └── Stack/
│   │
│   ├── Set/
│   │   ├── HashSet/
│   │   ├── LinkedHashSet/
│   │   └── TreeSet/
│   │
│   ├── Queue/
│   │   ├── PriorityQueue/
│   │   └── ArrayDeque/
│   │
│   ├── Map/
│   │   ├── HashMap/
│   │   ├── LinkedHashMap/
│   │   ├── TreeMap/
│   │   └── Hashtable/
│   │
│   ├── Iterator/
│   └── Comparable-Comparator/
│
├── 31-File-Handling/
├── 32-Java-IO/
├── 33-Java-NIO/
├── 34-Serialization/
├── 35-Date-Time/
├── 36-Math/
│
├── 37-Java-8-Features/
│   ├── Lambda/
│   ├── Functional-Interfaces/
│   ├── Method-Reference/
│   ├── Optional/
│   └── Stream-API/
│
├── 38-Multithreading/
│   ├── Thread/
│   ├── Runnable/
│   ├── Callable/
│   ├── Thread-Lifecycle/
│   ├── Synchronization/
│   ├── Inter-Thread-Communication/
│   ├── Executor-Framework/
│   ├── Concurrent-Collections/
│   ├── Atomic-Classes/
│   └── Locks/
│
├── 39-JVM/
├── 40-Memory-Management/
├── 41-Garbage-Collection/
├── 42-Object-Class/
├── 43-Reflection/
├── 44-Annotations/
├── 45-Assertions/
├── 46-Regular-Expressions/
├── 47-Internationalization/
│
└── 48-Practice-Programs/
    ├── Basic-Programs/
    ├── Number-Programs/
    ├── Pattern-Programs/
    ├── String-Programs/
    ├── Array-Programs/
    ├── OOP-Programs/
    ├── Collections-Programs/
    └── Multithreading-Programs/
```

---

# 85. Learning Goals

By completing this repository, you should be able to:

* Understand Java fundamentals
* Understand JDK, JRE and JVM
* Write Java programs from scratch
* Understand Java tokens and keywords
* Work with variables and data types
* Use operators
* Implement if-else and switch
* Work with loops
* Use break, continue and return
* Create and use methods
* Understand method overloading
* Work with arrays
* Work with Strings
* Understand Classes and Objects
* Create constructors
* Implement constructor chaining
* Understand `this` and `super`
* Apply encapsulation
* Implement inheritance
* Understand polymorphism
* Implement abstraction
* Work with interfaces
* Understand packages and access modifiers
* Handle exceptions
* Create custom exceptions
* Use Generics
* Work with Collections Framework
* Use List, Set, Queue and Map
* Sort objects using Comparable and Comparator
* Work with files and I/O
* Understand Serialization
* Use Java Date-Time API
* Use Lambda expressions
* Use Functional Interfaces
* Use Optional
* Work with Stream API
* Understand Multithreading
* Implement synchronization
* Use Executor Framework
* Work with concurrent collections
* Understand JVM architecture
* Understand memory management
* Understand garbage collection
* Understand Reflection and Annotations
* Solve programming problems using Core Java

---

# 86. Learning Progress

* [ ] Java Introduction
* [ ] JDK / JRE / JVM
* [ ] Installation & Setup
* [ ] Program Structure
* [ ] Tokens
* [ ] Keywords
* [ ] Identifiers
* [ ] Variables
* [ ] Data Types
* [ ] Type Casting
* [ ] Operators
* [ ] Input / Output
* [ ] Decision Making
* [ ] Loops
* [ ] Jump Statements
* [ ] Methods
* [ ] Method Overloading
* [ ] Arrays
* [ ] Strings
* [ ] Classes & Objects
* [ ] Constructors
* [ ] Constructor Chaining
* [ ] `this`
* [ ] `super`
* [ ] Encapsulation
* [ ] Inheritance
* [ ] Polymorphism
* [ ] Abstraction
* [ ] Interfaces
* [ ] Access Modifiers
* [ ] Packages
* [ ] static
* [ ] final
* [ ] Wrapper Classes
* [ ] Enum
* [ ] Exception Handling
* [ ] Custom Exceptions
* [ ] Inner Classes
* [ ] Generics
* [ ] Collections Framework
* [ ] List
* [ ] Set
* [ ] Queue
* [ ] Map
* [ ] Iterator
* [ ] Comparable & Comparator
* [ ] File Handling
* [ ] I/O
* [ ] NIO
* [ ] Serialization
* [ ] Date & Time
* [ ] Lambda Expressions
* [ ] Functional Interfaces
* [ ] Method References
* [ ] Optional
* [ ] Stream API
* [ ] Multithreading
* [ ] Synchronization
* [ ] Inter-Thread Communication
* [ ] Executor Framework
* [ ] Concurrent Collections
* [ ] Atomic Classes
* [ ] Locks
* [ ] JVM Architecture
* [ ] Memory Management
* [ ] Garbage Collection
* [ ] Object Class
* [ ] Reflection
* [ ] Annotations
* [ ] Assertions
* [ ] Regular Expressions
* [ ] Internationalization
* [ ] Practice Programs

---

# 🧠 Learning Approach

```text
Learn the Concept
       ↓
Understand the Syntax
       ↓
Write the Code
       ↓
Practice Examples
       ↓
Solve Problems
       ↓
Debug Errors
       ↓
Build Small Programs
       ↓
Master Core Java
```

---

# 🎯 Repository Purpose

This repository is a structured **Core Java learning and practice resource**, starting from absolute fundamentals and progressing to advanced Core Java concepts.

It is useful for:

* 📖 Java Learning
* 💻 Coding Practice
* 🎯 Interview Preparation
* 🔄 Java Revision
* 🧠 Problem Solving
* 🚀 Building a Strong Java Foundation

---

# ⭐ Support

If you find this repository useful, consider giving it a ⭐ on GitHub.

---

# ☕ Keep Learning. Keep Coding. Keep Building. 🚀
