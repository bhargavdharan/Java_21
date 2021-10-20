// import java.util.*;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int a[] = { 10, 20, 30, 40, 50 }; //a[5]
        // System.out.println(a[2]);

        int a[] = new int[5];
        System.out.println("Enter array elements: \t");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Arrays elements are: \t");
        // Arrays.sort(a);

        for (int b : a) {
            System.out.print(1 * b + " ");
            // System.out.println(" ");
            // System.out.print(2*b+" ");

        }

    }
}
