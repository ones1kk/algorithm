package io.github.ones1kk.programers.level2;

public class Lesson42883 {

    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int idx = 0;
        for (int i = 0; i < number.length() - k; i++) {
            char max = 0;
            for (int j = idx; j <= i + k; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            answer.append(max);
        }

        return answer.toString();
    }
}
