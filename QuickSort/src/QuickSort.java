

import java.util.Arrays;

/*
* select a pivot
* ensure items on left of pivot are less than the pivot
* ensure items on the right of the pivot are greater than the pivot
*repeat steps 1 & 2 on the left and right
*
* Steps
*1. Pick the right most element of the array as the pivot
* 2. start from the left and find the element thats larger than the pivot
* 3. swap the chosen element with the next element smaller than the pivot
* 4. repeat steps 2 & 3 until no more swapping is possible
* 5. swap the first item which is larger than the pivot with the pivot itself
* */

public class QuickSort {
    public void sort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
    }

    /*
    * check that the array is more than one element
    * divide the array into two parts using partition function
    * call sort on the two partitions
    *
    * */
    private void sort(int[] numbers, int start, int end) {
        if (start < end) {
            int p = partition(numbers, start, end);
            sort(numbers, start, p - 1);
            sort(numbers, p + 1, end);
        }
    }

    private int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int x = start - 1;
        for (int i = start; i < end; i++) {
            if (numbers[i] < pivot) {
                x++;
                swap(numbers, x, i);
            }
        }
        swap(numbers, x + 1, end);
        return x + 1;
    }

    private void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }


    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
        int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0, 9, 3, 6};
        quickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}