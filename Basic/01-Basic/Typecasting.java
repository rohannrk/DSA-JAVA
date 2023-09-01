import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //type casting
//        int num = (int)(89.96f);
//        System.out.println(num);

        //automatic type conversion in expressions
//        int a = 258;
//        byte b = (byte)(a);
//        System.out.println(b);

//        byte a =  40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;
//        System.out.println(d);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i / c) - (d - s);
        System.out.println((f*b)+" "+ (i / c)+" "+ (d - s));
        System.out.println(result);
    }
}
