public class Pc {
    int x;
    int y;
    Pc(int a, int b) // parameterized constructor
    {
        x = a;
        y = b;

    }

    Pc(int a,String b)
    {
        System.out.println(a+" "+b);
    }

    void show() {
        System.out.println(x+" "+y);
    }
}

class Pcm {
    public static void main(String[] args) {
        Pc p = new Pc(100, 200);
        p.show();
        Pc p1 = new Pc(100, "Dharan");
        p1.show();
    }
}
