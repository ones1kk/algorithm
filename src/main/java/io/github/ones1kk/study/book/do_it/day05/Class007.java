package io.github.ones1kk.study.book.do_it.day05;

import java.util.Arrays;

public class Class007 {

    public static int resolve(int m, int[] arr) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int answer = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < m) {
                left++;
            } else if (sum > m) {
                right--;
            } else {
                answer++;
                left++;
                right--;
            }

        }


        return answer;
    }
}
