import java.util.Scanner;

public class condition_elseif {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter Marks:\t");
        Scanner scanner = new Scanner(System.in);
        marks = scanner.nextInt();
        if(marks>=60 && marks<=100)
        {
            System.out.println("Passed In First Division");
        }
        else if(marks>=45 && marks<=60)
        {
            System.out.println("Passed In Second Division");
        }
        else if(marks>=33 && marks<=45)
        {
            System.out.println("Passed In Third Division");
        }
        else
        {
            System.out.println("Failed....");
        }
    }
}
