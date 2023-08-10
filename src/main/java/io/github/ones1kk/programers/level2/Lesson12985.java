package io.github.ones1kk.programers.level2;

public class Lesson12985 {

    // 구글링 후 작성함
    public static int solution(int n, int a, int b) {
        int answer = 0;
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }
}
