package io.github.ones1kk.programers.level2;

public class Lesson12939 {

    public static String solution(String s) {
        String[] split = s.split(" ");
        int min, max;
        min = max = Integer.parseInt(split[0]);
        for (String value : split) {
            min = Math.min(min, Integer.parseInt(value));
            max = Math.max(max, Integer.parseInt(value));
        }
        return min + " " + max;
    }
}
