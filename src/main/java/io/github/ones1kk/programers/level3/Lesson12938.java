package io.github.ones1kk.programers.level3;

import java.util.Arrays;

public class Lesson12938 {

    public static int[] solution(int n, int s) {
        if (n > s) {
            return new int[]{-1};
        }

        int[] answer = new int[n];
        int value = s / n;
        int remainder = s % n;

        if (remainder == 0) {
            Arrays.fill(answer, value);
        } else {
            Arrays.fill(answer, 0, n - remainder, value);
            Arrays.fill(answer, n - remainder, n, value + 1);
        }

        return answer;
    }
}
