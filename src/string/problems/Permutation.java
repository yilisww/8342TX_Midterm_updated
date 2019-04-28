package string.problems;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

       // Scanner scanner = new Scanner(System.in);
        // String word = scanner.nextLine();

        String word = "ABCD";
        int n = word.length();
        Permutation permutation = new Permutation();
        permutation.permute(word, 0, n - 1);

    }


        private void permute(String word, int l, int r)
        {
            if (l == r)
                System.out.println(word);
            else {
                for (int i = l; i <= r; i++) {
                    word = swap(word, l, i);
                    permute(word, l + 1, r);
                    word = swap(word, l, i);
                }
            }
        }


        public String swap(String a, int i, int j)
        {
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }




}
