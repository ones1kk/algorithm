package io.github.ones1kk.programers.level2;

public class Lesson148653 {

    // -1, +1, -10, +10, -100, +100

    static int[][] map;

    public static int solution(int storey) {
        int length = String.valueOf(storey).length();
        map = new int[length][2];
        int start = 1;
        for (int i = 0; i < length; i++) {
            map[i][0] = start;
            map[i][1] = -start;

            start *= 10;
        }

        int answer = 0;
        return answer;
    }
}
