package string.problems;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String forward, reverse = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string here:");
        forward = scanner.nextLine();

        int length = forward.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + forward.charAt(i);

        if (forward.equals(reverse))
            System.out.println("The string <"+ forward + "> is a palindrome.");
        else
            System.out.println("The string <"+ forward + "> isn't a palindrome.");

    }
}
