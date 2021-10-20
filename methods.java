public class methods {
    public static void main(String[] args) {
        int r1 = Sum(10, 20);
        int r2 = Sub(30, 20);
        int r3 = Mul(30, 20);
        int r4 = Div(40, 20);
        System.out.println("Addition at r1:\t\t" + r1);
        System.out.println("Subtraction at r2:\t" + r2);
        System.out.println("Multiplication at r3:\t" + r3);
        System.out.println("Division at r4:\t\t" + r4);
        methods m = new methods();
        // System.out.println("Hello,"+m.Hello());
        m.Hello();
    }

    void Hello()
    {
        System.out.println("Welcome to coding....");
    }
    
    static int Sum(int a, int b)
    {
        return a + b;
    }

    static int Sub(int a,int b)
    {
        return a - b;
    }

    static int Mul(int a,int b)
    {
        return a * b;
    }

    static int Div(int a,int b)
    {
        return a / b;
    }


}
