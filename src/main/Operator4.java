package main;

public class Operator4 {

    public static void main(String[] args) {

        int num1 = 0B00001010; // 10
        int num2 = 0B00000101; // 5

        System.out.println(num1 & num2); // 0
        System.out.println(num1 | num2); // 15
        System.out.println(num1 ^ num2); // 15


        System.out.println(num2 << 1); // 5 * 2^1 = 10
        System.out.println(num2 << 2); // 5 * 2^2 = 20
        System.out.println(num2 << 3); // 5 * 2^3 = 40

        System.out.println(num2); // 5;

        num2 <<= 3;
        System.out.println(num2); // 40;

        System.out.println(num1 >> 3); // 1;
        System.out.println(num1 >> 1); // 5;
    }
}
