package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int lowdiff = Math.abs(array1[0]-array1[1]);
        for (int i=0; i<array1.length-1; i++) {
            for (int j=i+1; j<array1.length; j++) {
                lowdiff = Math.min(lowdiff, Math.abs(array1[j]-array1[i]));
            }
        }

        for (int i=0; i<array2.length-1; i++) {
            for (int j=i+1; j<array2.length; j++) {
                lowdiff = Math.min(lowdiff, Math.abs(array2[j]-array2[i]));
            }
        }

        System.out.println("Lowest difference between the two array cell is " + lowdiff);
    }


}


