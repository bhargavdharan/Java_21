import java.util.Scanner;
public class While_loop {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number:\t");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num >=0 )
        {
            if(num%2==0)
            {
                System.out.println("Even Number");
                break;
            } else {
                System.out.println("Odd Number");
                break;
            }
        }
    }
}
