package io.github.ones1kk.programers.level2;

public class Lesson12911 {

    public static int solution(int n) {
        int count = Integer.bitCount(n);
        while (true) {
            n++;
            int targetCount = Integer.bitCount(n);
            if (count == targetCount) {
                return n;
            }
        }
    }

}
