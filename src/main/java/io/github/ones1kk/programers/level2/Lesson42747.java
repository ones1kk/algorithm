package io.github.ones1kk.programers.level2;

public class Lesson42747 {

    public static int solution(int[] citations) {
        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            int count = 0;
            int h = i + 1;
            for (int citation : citations) {
                if (citation >= h) {
                    count++;
                }
            }
            if (h == count) {
                answer = count;
            }

        }

        return answer;
    }
}
