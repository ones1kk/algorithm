package io.github.ones1kk.programers.level2;

public class Lesson43165 {

    private static int answer = 0;

    public static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0);
        return answer;
    }

    public static void dfs(int[] numbers, int target, int idx, int sum) {
        if (idx == numbers.length) {
            if (target == sum) {
                answer++;
            }
            return;
        }
        dfs(numbers, target, idx + 1, sum + numbers[idx]);
        dfs(numbers, target, idx + 1, sum - numbers[idx]);
    }
}
