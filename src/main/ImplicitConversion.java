package main;

public class ImplicitConversion {
    public static void main(String[] args) {

        byte a = 10;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        int c = 20;
        float d = c;

        System.out.println(d);

        double e = b + d;
        System.out.println(e);
    }
}
