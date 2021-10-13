import java.util.Scanner;
public class Do_while {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number:\t");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        do
        {
            // System.out.println("Learn Coding....");
            System.out.print(num + " ");
            ++num;
        }
        while (num <= 10);
    }
}
