package io.github.ones1kk.study.sorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RadixSort {

    public static int[] radixSort(int[] arr) {
        int maxDigit = getMaxDigit(arr);

        List<Queue<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Queue<Integer> q = new LinkedList<>();
            bucket.add(q);
        }

        for (int digit = 0; digit < maxDigit; digit++) {
            for (int number : arr) {
                int bucketIdx = (number / (int) Math.pow(10, digit)) % 10;
                bucket.get(bucketIdx).add(number);
            }
            int arrIndex = 0;
            for (int i = 0; i < 10; i++) {
                Queue<Integer> q = bucket.get(i);
                int qSize = q.size();
                for (int j = 0; j < qSize; j++) {
                    arr[arrIndex] = q.poll();
                    arrIndex++;
                }
            }
        }
        return arr;
    }

    private static int getMaxDigit(int[] numbers) {
        int maxDigit = 0;
        for (int number : numbers) {
            int digit = (int) Math.log10(number) + 1;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }
        return maxDigit;
    }

}
