public class Constructor {
    String name;
    int a;
    Constructor()
    {
        a = 0;
        name = null;
    }

    void show()
    {
        System.out.println(a+" "+name);
    }
}

class B
{
    public static void main(String[] args) {
        Constructor c = new Constructor();
         c.show();
    }

}