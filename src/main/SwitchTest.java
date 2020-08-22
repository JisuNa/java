package main;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int days = 31;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                days = 28;
        }


        System.out.println(days);
    }
}
