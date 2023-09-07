package io.github.ones1kk.programers.level3;

public class Lesson43105 {

    public static int solution(int[][] triangle) {
        int answer = 0;

        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            // 왼쪽
            dp[i][0] = dp[i - 1][0] + triangle[i][0];

            // 중간
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
            }

            // 오른쪽
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];
        }

        for (int i = 0; i < triangle.length; i++) {
            answer = Math.max(dp[triangle.length - 1][i], answer);
        }

        return answer;
    }

}
