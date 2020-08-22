package main;

import java.util.Scanner;

public class SwitchEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rank = sc.nextInt();
        char medal;

        switch (rank) {
            case 1:
                medal = 'G';
                System.out.println("금");
                break;
            case 2:
                medal = 'S';
                System.out.println("은");
                break;
            case 3:
                medal = 'B';
                System.out.println("동");
                break;
            default:
                medal = 'A';
        }

        System.out.println(rank + " " + medal);
    }
}
