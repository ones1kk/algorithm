package io.github.ones1kk.programers.level2;

public class Lesson12980 {

    public static int solution(int n) {
        int answer = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                answer++;
            }
        }

        return answer;
    }
}
