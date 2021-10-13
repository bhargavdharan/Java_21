public class Nested_ifelse {
    public static void main(String[] args) {
        int num1 = 20,num2 =30,num3=45;
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("Maximum Number:\t"+num1);
            }
            else
            {
                System.out.println("Maximum Number:\t"+num3);
            }
        }
        else
        {
            if(num2>num3)
            {
                System.out.println("Maximum Number:\t"+num2);
            }
            else
            {
                System.out.println("maximum Number:\t"+num3);
            }
        }
    }
}
