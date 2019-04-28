package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                *
               * *
              * * *
             * * * *
            * * * * *
           * * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How big is the Pyramid: ");
        int num = scanner.nextInt();
        // enter the number "6"

        for (int i=0; i<num; i++) {
            for (int a = num-1; a>=i; a--){
                System.out.print(" ");
            }
            for (int b = 0; b<=i; b++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
