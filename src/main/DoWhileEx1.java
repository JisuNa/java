package main;

public class DoWhileEx1 {

    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num ++;
        } while (sum <= 1000);

        System.out.println(num);
        System.out.println(sum);
    }
}
