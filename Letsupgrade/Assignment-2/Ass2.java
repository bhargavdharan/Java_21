import java.util.*;
class Add{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A:");
        a = sc.nextInt();
        System.out.print("Enter value of B:");
         b = sc.nextInt();
         c = a+b;
         System.out.println("Addition of two numbers is:" +c);

    }
}

/**
 * ------output--------
 *              Enter value of A:25
                Enter value of B:35
                Addition of two numbers is:60
 */