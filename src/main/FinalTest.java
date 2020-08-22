package main;

import java.util.Scanner;

public class FinalTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int starCount = 1;
        int blankCount = count - 1;
        int lineCount = 0;

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < blankCount / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < starCount; k++) {
                System.out.print("*");
            }

            for (int l = 0; l < blankCount / 2; l++) {
                System.out.print(" ");
            }

            if(count / 2 > i) {
                starCount += 2;
                blankCount -= 2;
            } else {
                starCount -= 2;
                blankCount += 2;
            }
            System.out.println("");
        }

    }
}
