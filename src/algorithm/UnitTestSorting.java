package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        System.out.println("After the selection sorting : ");
        for (int j = 0; j < unSortedArray.length; j++) {

            for (int i = j + 1; i < unSortedArray.length; i++) {
                if (unSortedArray[i] < unSortedArray[j]) {
                    unSortedArray[i] =  unSortedArray[i] + unSortedArray[j];
                    unSortedArray[j] =  unSortedArray[i] - unSortedArray[j];
                    unSortedArray[i] =  unSortedArray[i] - unSortedArray[j];
                }
            }
            System.out.print(unSortedArray[j]+", ");
        }


        System.out.println();
        System.out.println("This is for the insertion sort : ");
        int small = 0;
        int large =0;
        for (int i=0; i<unSortedArray.length-1; i++) {
            if ((unSortedArray[i+1] < unSortedArray[i]) ){
                small = unSortedArray[i+1];
                unSortedArray[i+1] = unSortedArray [i];
                unSortedArray[i] = small;
            }
            System.out.print(unSortedArray[i]+", ");
            large =i+1;
        }
        System.out.println(unSortedArray[large]);




    }
}
