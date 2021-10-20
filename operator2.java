public class operator2 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;
        System.out.println(a==b);    //false
        System.out.println(a!=b);    //true
        System.out.println(a>b);     //false
        System.out.println(a<b);     //true
        System.out.println(a<=b);    //true
        System.out.println(a >= b); //false
        
        System.out.println(a == b && a != b); // false
        System.out.println(a == b || a != b); // true
        System.out.println(!(a > b)); // true
        
        System.out.println("preInc:\t\t"+ a++ );
        System.out.println("postInc:\t"+ +a);
        System.out.println("postInc:\t" + ++a);
        
        System.out.println("preDec:\t\t"+ a--);
        System.out.println("postDec:\t" + --a);
        
        int r = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(r);
    }
}
