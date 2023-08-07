package io.github.ones1kk.programers.level1;

public class Lesson132267 {

    public static int solution(int a, int b, int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % a == 0) {
                answer += b;
                n += b;
            }
        }

        return answer;
    }
}
