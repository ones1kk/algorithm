package io.github.ones1kk.programers.series.backtracking.day01;

public class Lesson43165 {

    static int n;
    static int answer = 0;

    public static int solution(int[] numbers, int target) {
        n = numbers.length;

        dfs(0, 0, numbers, target);

        return answer;
    }

    private static void dfs(int idx, int value, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (value == target) {
                answer++;
            }
            return;
        }

        int current = numbers[idx];
        int plus = value + current;
        int minus = value - current;
        dfs(idx + 1, plus, numbers, target);
        dfs(idx + 1, minus, numbers, target);
    }
}
