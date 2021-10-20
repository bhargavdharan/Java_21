public class Dc {
    int a;
    String b;
    boolean c;

    // Dc() {
    //     a = 100;
    //     b = "Dharan";
    //     c = true;
    // }

    void display() {
        System.out.println(a + " " + b + " " + c);
    }
}
class Dcm
{
public static void main(String[] args) {
    Dc d = new Dc();
    System.out.println(d.a);
    System.out.println(d.b);
    System.out.println(d.c);
    d.display();
}
}
