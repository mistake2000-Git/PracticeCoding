package Sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSort {
    public static void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int midIndex = n / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[n - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = arr[i];
        }
        for (int j = midIndex; j < n; j++) {
            rightArray[j - midIndex] = arr[j];
        }

        mergeSort(leftArray, midIndex);
        mergeSort(rightArray, n - midIndex);
        merge(arr, leftArray, rightArray, midIndex, n - midIndex);
    }

    private static void merge(int[] arr, int[] leftArray, int[] rightArray, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            arr[k++] = leftArray[i++];
        }
        while (j < right) {
            arr[k++] = rightArray[j++];
        }
    }

    @Test
    public void positiveTest() {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

}
