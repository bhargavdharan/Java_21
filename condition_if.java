import java.util.Scanner;

public class condition_if {
    public static void main(String[] args) {
        int pwd;
        System.out.print("Enter Password:");
        Scanner obj = new Scanner(System.in);
        pwd = obj.nextInt();

        if(pwd==2731)
        {
            System.out.println("My Name:\t Dharan");
            System.out.println("My Age:\t\t 21");
            System.out.println("My Contact:\t 7358454546");
            System.out.println("My Address:\t Visakhapatnam,Andhra");
        } else {
            System.out.println("Sorry! Wrong Password...");
        }
    }
}