package io.github.ones1kk.programers.level1;

public class Lesson12921 {

    public static int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n + 1];
        check[0] = check[1] = false;

        for (int i = 2; i <= n; i++) {
            check[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!check[i]) {
                continue;
            }

            for (int j = 2; i * j <= n; j++) {
                check[i * j] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (check[i]) {
                answer++;
            }
        }

        return answer;
    }
}

