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
