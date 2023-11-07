package io.github.ones1kk.study.sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            boolean swapped = false;

            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

        }

    }

    private static void swap(int[] arr, int current, int next) {
        int temp = arr[current];
        arr[current] = arr[next];
        arr[next] = temp;
    }

}
