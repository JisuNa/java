package main;

public class Integer {

    public static void main(String[] args) {
        byte a = -128;
//        byte b = -129; // error

        System.out.println(a);

//        int c = 12345678900; // out of range
        long d = 100;
        long e = 12345678900L;
    }
}
