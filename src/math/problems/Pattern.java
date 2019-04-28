package math.problems;

import java.util.ArrayList;

public class Pattern {

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         *
         */
        ArrayList<Integer> numList = new ArrayList<>();
        int n =100;
        int i =1;
        numList.add(n);
        int counter = n/10;
        do {
            for (int j=0; j<counter; j++) {
                n = n - i;
                numList.add(n);
                }
            i++;
        } while (n>0);

        for (Integer x : numList) System.out.print(x+ " ");
        System.out.println();



    }

}
