package io.github.ones1kk.programers.level2;

public class Lesson12899 {


    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] num = {"4", "1", "2"};

        while (n > 0) {
            answer.insert(0, num[n % 3]);
            n = (n - 1) / 3;
        }

        return answer.toString();
    }
}
