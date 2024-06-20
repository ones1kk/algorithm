package io.github.ones1kk.study.book.do_it.day06;

import java.util.Arrays;

public class Class008 {

    public static int resolve(int[] arr) {
        Arrays.sort(arr);
        int answer = 0;

        for (int find : arr) {
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                if (arr[left] + arr[right] == find) {
                    if (left != right) {
                        answer++;
                        break;
                    }
                } else if (arr[left] + arr[right] < find) {
                    left++;
                } else {
                    right--;
                }


            }
        }

        return answer;
    }
}
