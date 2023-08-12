package io.github.ones1kk.programers.level2;

public class Lesson87390 {

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];
        for (int i = 0; i < answer.length; i++) {
            int row = (int) (left % n + 1);
            int col = (int) (left / n + 1);
            answer[i] = Math.max(row, col);
            left++;
        }
        return answer;
    }
}
