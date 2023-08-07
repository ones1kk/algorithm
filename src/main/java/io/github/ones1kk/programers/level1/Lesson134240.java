package io.github.ones1kk.programers.level1;

public class Lesson134240 {

    public static String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i];
            int idx = count / 2;
            answer.append(String.valueOf(i).repeat(Math.max(0, idx)));
        }

        StringBuilder reverser = new StringBuilder(answer).reverse();
        answer.append("0");
        answer.append(reverser);

        return answer.toString();
    }
}
