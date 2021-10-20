public class stringClass {
    public static void main(String[] args) {
        String str = "Dharan";
        String str2 = new String("Vignan Bhargav Sai");
        // if( str == str2 )
        if( str.equals(str2) )
        {
            System.out.println("Both are Equals..");
        }
        else
        {
            System.out.println("two strings are Not equal");
        }
        int l = str.length();
        String U = str.toUpperCase();
        String L = str.toLowerCase();
        System.out.println("String length: \t"+l);
        System.out.println("Changed String to Upper-case: \t"+U);
        System.out.println("Changed String to Lower-case: \t"+L);
    }
}
