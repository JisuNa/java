package main;

public class BreakContinueEx {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {

            if(i % 2 != 0) {
                continue;
            }

            for (int j = 1; j < 10; j++) {
                if(i < j) {
                    break;
                }
                System.out.println(i + " x " + j + " = " + i * j );
            }

        }
    }
}
 