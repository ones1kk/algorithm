package io.github.ones1kk.study.sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int target = arr[i];

            int j = i - 1;
            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = target;
        }
    }

}
