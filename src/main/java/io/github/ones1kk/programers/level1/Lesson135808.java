package io.github.ones1kk.programers.level1;

import java.util.Arrays;

public class Lesson135808 {

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxCount = score.length / m;

        int[][] boxes = new int[boxCount][m];

        Arrays.sort(score);

        int idx = score.length - 1;
        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < boxes[i].length; j++) {
                boxes[i][j] = score[idx];
                idx--;
            }
        }

        for (int[] box : boxes) {
            int min = box[0];
            for (int i : box) {
                if (min > i) {
                    min = i;
                }
            }
            answer += min * box.length;
        }

        return answer;
    }

}
