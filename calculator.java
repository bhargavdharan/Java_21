import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a,b,c,choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:\t");
        a = sc.nextInt();
        System.out.println("Enter second number:\t");
        b = sc.nextInt();
        System.out.println("Enter your choice");
        choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                c = a + b;
                System.out.println("Addition:\t" + c);
                break;
            case 2:
                c = a - b;
                System.out.println("Subtraction:\t" + c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication:\t" + c);
                break;
            case 4:
                c = a / b;
                System.out.println("Division:\t" + c);
                break;
            case 5:
                c = a % b;
                System.out.println("Remainder:\t" + c);
                break;

            default:
                System.out.println("Invalid choice........");
        }
    }
}
