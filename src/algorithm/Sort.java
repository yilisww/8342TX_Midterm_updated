package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        try {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here

        final long startTime = System.currentTimeMillis();
        int len = array.length;
        sortPart(array, 0, len - 1);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public void sortPart(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sortPart(arr, l, m);
            sortPart(arr, m + 1, r);
            mergePart(arr, l, m, r);
        }
    }

    public void mergePart(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here

        final long startTime = System.currentTimeMillis();
        int len = array.length;
        quicksort(list, 0, len - 1);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    public void quicksort(int[] list, int low, int high) {
        int i = low, j = high;
        int pivot = list[low + (high - low) / 2];

        while (i <= j) {
            while (list[i] < pivot) {
                i++;
            }
            while (list[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(list, i, j);
                i++;
                j--;
            }
        }

        if (low < j)
            quicksort(list, low, j);
        if (i < high)
            quicksort(list, i, high);
    }

    public void exchange(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here

        final long startTime = System.currentTimeMillis();
        int len = array.length;

        for (int i = len / 2 - 1; i >= 0; i--)
            heapify(array, len, i);

        for (int i = len - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    void heapify(int[] array, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[l] > array[largest])
            largest = l;

        if (r < n && array[r] > array[largest])
            largest = r;


        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }


    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here

        final long startTime = System.currentTimeMillis();
        int maxVal = array.length + 1;
        int[] bucket = new int[maxVal];  //bucket

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[outPos++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;


        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here

        final long startTime = System.currentTimeMillis();
        int len = array.length;

        for (int gap = len/2; gap > 0; gap /= 2) {

            for (int i = gap; i < len; i += 1) {
                int temp = array[i];

                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];

                array[j] = temp;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
}
