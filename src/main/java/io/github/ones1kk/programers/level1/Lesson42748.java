package io.github.ones1kk.programers.level1;

import java.util.Arrays;

public class Lesson42748 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int idx = commands[i][2];

            int[] arr = Arrays.copyOfRange(array, start - 1, end);

            Arrays.sort(arr);
            answer[i] = arr[idx - 1];
        }

        return answer;
    }
}
