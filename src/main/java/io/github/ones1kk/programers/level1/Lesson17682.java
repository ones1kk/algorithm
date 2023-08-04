package io.github.ones1kk.programers.level1;

public class Lesson17682 {

    public static int solution(String dartResult) {
        int[] scores = new int[3];
        int idx = 0;

        StringBuilder number = new StringBuilder();
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                number.append(c);
                if (Character.isDigit(dartResult.charAt(i + 1))) {
                    number.append(dartResult.charAt(i + 1));
                    i++;
                }
            }

            int score;
            if (c == 'S' || c == 'D' || c == 'T') {
                score = getScore(c, Integer.parseInt(number.toString()));
                scores[idx] = score;
                number = new StringBuilder();
                idx++;
            }

            if (c == '*') {
                scores[idx - 1] = scores[idx - 1] * 2;
                if (idx - 1 > 0) {
                    scores[idx - 2] = scores[idx - 2] * 2;
                }
            }

            if (c == '#') {
                scores[idx - 1] = scores[idx - 1] * -1;
            }
        }
        return scores[0] + scores[1] + scores[2];
    }

    public static int getScore(char option, int score) {
        switch (option) {
            case 'S':
                return (int) Math.pow(score, 1);
            case 'D':
                return (int) Math.pow(score, 2);
            case 'T':
                return (int) Math.pow(score, 3);
        }
        return score;
    }
}
