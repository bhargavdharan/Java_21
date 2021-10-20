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
7. Operators
8. Java Methods
9. Java Array
10. Java Strings

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
        -- It is used when we want to test a single condition.
        syntax:

        ```syntax
        if(condition){
            //statements
        }
        ```

    2. if-else statement
        -- it is used when we want to execute two statements for a single condition.
        syntax:

        ```syntax
        if(condition){
            //statement1;
        }else{
            //statement2;
        }
        ```

    3. else-if statement
        -- it is used when we have only one if block, multiple else-if blocks and at the last else block

        syntax:

        ```syntax
        if(condition1){
            //statement1
        }else-if(condition2){
            //statement2
        }else{
            //statement2
        }
        ```

    4. nested if statement
        -- whenever, we define if-else block inside another if-else block called "nested if-else"

        syntax:

        ```syntax
        if(condition1){
            if(condition2){
                //statement1
            }
            else{
                //statement2
            }
        }else{
            if(condition3){
                //statement3
            }else{
                //statement4
            }
        }
        ```

    5. switch case statement
         switch statement: switch is a multiple choice decision making selection statement. it is used when we want to select only one case out of multiple cases

       ```syntax
            switch(exp)
            {
                case 1: statement1;
                        break;
                case 2: statement2;
                        break;

                case n: statement n;
                        break;

                default: statement;
            }
        ```

* Looping Statements.
    0. Loop
        -- Whenever we want to repeat certain statements several times then,we should write those statements inside loop body.

    1. for-loop
        syntax:

        ```syntax
        for(initialization; condition; incr/decr)
        {
            //code
        }
        ```

    2. while-loop
        syntax:

        ```syntax
        while(condition)
        {
            //code
        }
        ```

    3. do-while loop
        syntax:

        ```syntax
        do
        {
            //statement
        }
        while(condition)
        ```

    4. for-each
        syntax:

        ```syntax
        for(datatype var1:var2){
            //statement
        }
        ```

* Transfer Statements.

1. break -- it stops the execution of program
2. continue -- it skips the execution of program
3. return

## Operators

* what is operator ?

operator is a symbol that is used to perform operations according to user requirement.

Types:

1. Arithematic operators (+,-,x./,%)
2. Relational operators (>,<,>=,<=,!=)
3. Logical operators (&&,||,!)
4. increment/decrement (preInc/postInc(++a/a++)) / (preDec/postDec(--a/a--))
5. Assignment operator (=.+=)
6. Ternary operator (?:)(a>b>c)

## Method

* What is method ?

Method is a group/block of code which take input from the user, processed it, and gives output.

**Note** 1. Method runs only when it is called
         2. Code reusability

* Types of Methods

1. pre-defined ( print();, sort();, nextInt();, sleep();, concat(); )
2. user-defined ( add(), sum(), learn())

syntax:

```syntax
return-type method-name(--)
{
    //statement;
}
```

## Arrays

* What is Arrays ?

Arrays is an object in java, which contains similar type of data in a contigous memory locations.

syntax:

1. ```data-type[] var-name```

2. ```data-type var-name[] = {10,20,30}```

3. ```int a[] = new int[5]```

* Types of Arrays

1. 1D array
2. 2D array

## Strings

* What is Strings ?

1. String is a pre-defined class in java but we can also use as a datatype.

2. Strings are the sequence of character and its index starts from 0.

Syntax:

1. ```String str = new String("DHARAN")```

2. ```String str = "DHARAN"```

* Why Strings are immutable in java ?

... immutable - can't change
... bcoz duplicate values cannot copy to original values.

## Java OOPs

* **Class & Object**

* What is class & object ?

.. class is a group of elements having common properties and behaviours
.. object is a real-world entity

```class
class person{
   String name;
   int age;
   int phoneNo;
}
```

```object
person P = new person();
```

* Types of classes:

1. user-defined (A,Person,Animal)
2. pre-defined (System,Strings,Scanner)

* **Access Specifier**

* **Constructors:**

* What is constructor ?

constructor is a special type of method whose name is same as class

Note:

1. The main purpose of constructor is initialize the object
2. Every java class has a constructor
3. A constructor is automatically called at the time of object creation.
4. A constructor never contain any return-type including void

syntax:

```constructor
class class-name
{
    class-name()
    {

    }
}
```

* Types of constructor:

1. default

2. private

3. copy

4. parameterized

* ***Default constructor***:

* what is default constructor ?

A constructor which does not have any parameters is called default constructor.

syntax:

```syntax
class A
{
    A()
    {

    }
}
```

* ***Parameterized constructor***

* what is parameterized constructor ?

A constructor through which we can pass one or more parameters is called parameterized constructor

syntax:

```syntax
class A
{
    A(int x, int y)
    {
        
    }
}
```

* **Super Keyword**

* **this Keyword**

* **Instance block**

* **Static block**

* **Encapsulation**

* **Abstraction**

1. abstract class

2. interface

* **Inheritance**

* **polymorphism**

* **Exception Handling**

* **Multi-Threading**

* **Packages**

* **Collections**
