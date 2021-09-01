/**
 * System.out.print()  / println()
 * Scanner sc = new Scanner(System.in)
 * Final
 * Constructor
 * Mini Project - Cab(Uber) Fare Calculation
 * 
 */

/**
 * PrintStream class - present in java.io package
 *  ---print() & println() are members of PrintStream class
 * we need object of PrintStream to access print() or println()
 * "out" is object of PrintStream which is present in System class.
 * "out" is a static member of System class
 * So, out can be accessed by System.out
 * Finally, to access println(), System.out.println() is used

 * "javap" it list out all particular files
 *
 */

/**
 * ----Constructor----
 * objects doesn't create object itself it takes help from constructor
 * implicitly call constructor and constructor creates object
 *
 * what is a constructor?
 * -- It is a method with the same name as class and no return type.
 *
 *
 * when user don't mention any constructor , then JVM places a default constructor automatically.
 */

//    class Test{
//        int x;

//        /**
//         * Hidden Constructor - placed by JVM
//         Test(){

//         }
//         * @param args
//         */
//        public static void main(String[] args) {
//            Test ob = new Test();
//            ob.x = 20;
//            System.out.println(ob.x);

//        }
//    }

/**
 * ----Task of Constructor------
 * 1.It creates object
 * 2.It Initializes the object
 * 
 * Types:
 * - Default
 * - Parameterized
 * - copy constructor --- it copies one object data into another.
 */

// ----Mini Project----

import java.util.*;

class Uber {
    int fare;
    int d; // distance travelled by the user.
    int cd; // distance of cab from user

    public Uber() {
        fare = 30;
    }

    // parameterized constructor
    public Uber(int amt) {
        fare = amt;

    }

    //copy constructor
    public Uber(Uber ub2){  // Uber ub1 = new Uber(ub);
        fare = ub2.fare;    // ub1.fare = ub.fare
    }

    void showFare() {
        System.out.println("Total Fare: Rs " + fare);
    }
}

class Driver {
    public static void main(String[] args) {
        int cd;
        // Uber ub = new Uber();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a cab distance from user:");
        cd = sc.nextInt();

        if (cd > 5) {
            Uber ub = new Uber(30 + 10 * (cd - 5));
            System.out.print("Enter the distance travelled:");
            ub.d = sc.nextInt();

            ub.fare = ub.fare + 10 * ub.d;

            ub.showFare();

            Uber ub1 = new Uber(ub);
            ub1.showFare();
        } else {
            Uber ub = new Uber();
            System.out.print("Enter the distance travelled:");
            ub.d = sc.nextInt();

            ub.fare = ub.fare + 10 * ub.d;

            ub.showFare();

            Uber ub1 = new Uber(ub);
            ub1.showFare();
        }

    }

}


/**
 * Scanner sc = new Scanner(System.in)
 * scanner doesn't have default constructor.
 * it has a parameterized constructor taking object of Inputstream class
 * "in" is object of InputStream class which is present in System class.
 * "in" is a static member of system class.
 * so, we can access "in" by System.in.
 * Finally, we write:
 * Scanner sc = new Scanner(System.in);
 */

 /**
  * ----Final,Static----> Non-access modifiers(they dont define how they access).
  * Final variable --- final int x;        -- value cannot be changed
  * Final method   --- final void fun();   -- it cannot be overridden
  * Final class    --- final class Test(); -- class cannot be inherited
  */












