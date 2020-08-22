package main;

import java.util.Scanner;

public class IfTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        char result = 'A';

        if (score < 60) {
            result = 'F';
        } else if (score < 70) {
            result = 'D';
        } else if (score < 80) {
            result = 'C';
        } else if (score < 90) {
            result = 'B';
        }

        System.out.println(result);
    }
}
