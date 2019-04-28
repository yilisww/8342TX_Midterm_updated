package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first word here: ");
        String word1 = scanner.next();
        System.out.println("Enter your second word here: ");
        String word2 = scanner.next();
        anagramCheck(word1, word2);
    }

    public static void anagramCheck (String word1, String word2){

        char[] arrayofCharFromStringA = word1.toCharArray();
        char[] arrayofCharFromStringB = word2.toCharArray();

        Arrays.sort(arrayofCharFromStringA);
        Arrays.sort(arrayofCharFromStringB);

        if (Arrays.equals(arrayofCharFromStringA,arrayofCharFromStringB)){
            System.out.println(word1+" and "+word2+" are anangram");
        } else
            System.out.println(word1+" and "+word2+" are not anangram");


    }
}
