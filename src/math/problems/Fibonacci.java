package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your wanted number here: ");
        int input = scanner.nextInt();
        // you could input the number "8"

        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.println("The fibonacci numbers till " + input +" are: ");  // be careful is x here

        for (int i = 0; i <input; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }



    }
}
