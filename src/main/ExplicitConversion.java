package main;

public class ExplicitConversion {
    public static void main(String[] args) {

        int i = 1000;
        byte b = (byte) i;
        System.out.println(b);

        double c = 1.2;
        float d = 0.9F;

        int e = (int) c + (int) d;
        int f = (int) (c + d);

        System.out.println(e);
        System.out.println(f);

    }
}
