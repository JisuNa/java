package main;

public class Double2 {

    public static void main(String[] args) {

        // 부동 소수점의 오차
        double a = 1;

        for ( int i = 0; i < 10000; i++) {
            a += 0.1;
        }

        System.out.println(a);
    }
}
