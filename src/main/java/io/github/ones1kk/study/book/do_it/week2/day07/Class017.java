package io.github.ones1kk.study.book.do_it.week2.day07;

import java.util.Arrays;

public class Class017 {

    public static int resolve(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
