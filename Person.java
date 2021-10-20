public class Person {

    int age = 21;
    int weight = 21;
    String color = "Light";

    void eat()
    {
        System.out.println("I'm Eating");
    }
    void sleep()
    {
        System.out.println("I'm sleeping");
    }
    public static void main(String[] args) {
        Person P = new Person();
        System.out.println(P.age);
        System.out.println(P.weight);
        System.out.println(P.color);
        P.eat();
        P.sleep();
    }
}
