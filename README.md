# Java Programming

* Flavours of Java

1. Core Java (J2SE)     -- it is used to create softwares

2. Advance Java(J2EE)   -- It is used to create web applications

3. Android Java(J2ME)   -- It is used to create Android Applications

## Core Java

* Why learn Java ?

1. Simple and easy to learn
2. Open source
3. platform independent
4. Secure
5. Embedded
6. Compile & interpreted
7. Robust
8. Large library & frameworks

* What is Java ?

Java is a class based, hight-level,object-oriented programming language developed by "James Gosing" and his friends in the year 1995.

* **Note**

1. The first version of java(JDK 1.0) was released on the year Jan-23rd 1996 by "Sun Microsystem"

2. Latest version of java(JDK 16) on the day 16th march-2021 by "Oracle"

```syntax
class class_name
{
    public Static void main(String args[])
    {
        // write code here
    }
}
```

* **Compilation and execution process of java**

First.java(Javac)(source code) ==> First.class(JVM)(byte code) ==> output

* Syllabus in java

1. Datatype
2. Variables
3. Keywords
4. input & output
5. Control flow
6. indentifier

## DataTypes

* What is Datatype?
Datatype specifies the different type of values that are stored on the variables.

* They are two types of datatypes:

1. Primitive datatypes
2. Non-Primitive datatypes

* Primitive Datatypes

1. Numeric ( byte[1 byte] ,short[2 bytes] ,int[4 bytes] ,long[8 bytes] ,double[8 bytes] ,float[4 bytes] )

2. Non-numeric ( char[2 bytes], boolean[1 bit] )

* Non-Primitive Datatypes (class, Array, String, Queue...etc..)

## Variables

* What is variable ?
variable is the name of memory location where we stored different types of values.

* Types of variables

1. Local
2. Static
3. Instance
4. Final

## Keywords

* What is Keyword ?
Keywords are the reserve words whose meaning is already define in the java compiler.
**Note:** 1. We can't use keyword for our personal use
          2. Keywords are case-sensitive.

* Java Keywords are totally  have 50 keywords

```keywords
byte | short | int | long | float | double | void | char | boolean | if

else | for | do | while | break | continue | default | private | protected | public

extends | implements | final | finally | try | catch | throw | throws | static | volatile

import | class | interface | new | native | instanceOf | package | return | this | super

switch | case | const * | goto * | strictfp ** | enum **** | assert *** | abstract | transient | synchronized

```

**Note:**  *(not used),**(added in 1.2 v),***(added in 1.4 v),****(added in 5.0 v) , (null , true , false) used as a literals in java.

## Identifiers

* what is identifier ?
identifiers refer to the name of variables, methods, classes and so on.
ec: int a , void mic, class A ...

## Input & Output

* input -- Scanner class ( java.util.Scanner )

syntax: Scanner obj_name = new Scanner(System.in);

* **Scanner class methods**

1. nextInt() -- for Integer value
1. nextLine() -- for String value
1. nextDouble() -- for double value

* output -- System class (java.lang.System)

syntax: System.out.print(" ");

## Control flow

* Conditional Statements.

    1. if statement
        -- It is used when we want to test a single condition
    2. if-else statement
    3. else-if statement
    4. nested if statement
    5. switch case statement

* Looping Statements.
* Transfer Statements.
