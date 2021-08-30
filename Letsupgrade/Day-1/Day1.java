/**
 * OOP vs POP
 * OOP - bottom up approach, focuses on data
 * POP - Top down approach, focuses more on performing the task.

 * Classes & Object
 *

 */

 class Demo {
     public static void main(String[] args) {
         System.out.println("Hello java coders");
         System.out.println("Hi LetsUpgraders");
     }
 }

class Test{
    int x; // instance variable or object variable
    static int y; // static variable or class
    // void show(){ // method
    //     System.out.println("Test Class method");
    // }
    void show(){
        System.out.println(" X = " +x+ " Y = " +y);
    }
}

class TestDrive{
    public static void main(String[] args) {
        Test ob1 = new Test();
        Test ob2 = new Test();
        ob1.x = 20;
        ob2.x = 40;

        ob1.y = 30;
        ob2.y = 50;

        System.out.println(ob1.y);

        // System.out.println("Data1: " + ob1.x);
        // System.out.println("Data2: " + ob2.x);

        ob1.show();
        ob2.show();
    }
}