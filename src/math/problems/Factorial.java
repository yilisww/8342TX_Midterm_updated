package math.problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

       /*
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number here: ");
        num = scanner.nextInt();
        */

       int num =5;
        System.out.println("The factorial of a given number is : " + factorialNum(5));

    }

    public static int factorialNum(int num){
        if(num==0) return 1;
        else return num*factorialNum(num-1);
    }
}


