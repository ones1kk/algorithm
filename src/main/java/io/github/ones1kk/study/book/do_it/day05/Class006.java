package io.github.ones1kk.study.book.do_it.day05;

public class Class006 {


    public static int resolve(int n) {
        int left = 1, right = 1, sum = 1, answer = 1;

        while (right != n) {
            if (sum == n) {
                answer++;
                right++;
                sum = sum + right;
            } else if (sum > n) {
                sum = sum - left;
                left++;
            } else {
                right++;
                sum = sum + right;
            }

        }

        return answer;
    }
}
