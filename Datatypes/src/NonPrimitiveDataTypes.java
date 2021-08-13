public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String str1 = "test";
        System.out.println("String is:" +str1);

        String str2 = new String("test");
        System.out.println("Another string:" +str2);

        int arr[];
        arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        System.out.println(arr);
        System.out.println(arr[0]);
    }
}

//output:
/**
 *
       String is:test
       Another string:test
       [I@7440e464
       0
 *
 */
