public class Second {
    int a = 10; // Instance variable
    static double b = 20.5; // Static variable

    public static void main(String[] args) {
        boolean c = true; // local variable

        Second s = new Second();
        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(c);
    }
}
