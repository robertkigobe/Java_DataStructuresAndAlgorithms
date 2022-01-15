/*
* uses complexity of O(nlogn)
*steps
*1. split the array into the middle
*2. sort each part recursively separately
*3. merge the sorted parts together
* */

public class MergeSort {

    private void merge(int[] array, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int[] arrayTemp = new int[end - start + 1];
        for (int k = 0; k < arrayTemp.length; k++) {
            if (i <= middle && (j > end || array[i] <= array[j])) {
                arrayTemp[k] = array[i];
                i++;
            } else {
                arrayTemp[k] = array[j];
                j++;
            }
        }
        System.arraycopy(arrayTemp, 0, array, start, arrayTemp.length);
    }

    private void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int middle = (end - start) / 2 + start;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    public void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }
}

