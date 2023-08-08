package io.github.ones1kk.programers.level1;

public class Lesson147355 {

    public static int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String value = t.substring(i, i + p.length());
            if (Long.parseLong(value) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}
