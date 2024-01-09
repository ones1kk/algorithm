package io.github.ones1kk.programers.level3;

import java.util.Arrays;
import java.util.Comparator;

public class Lesson42884 {

    public static int solution(int[][] routes) {
        int answer = 1;

        Arrays.sort(routes, Comparator.comparingInt(a -> a[1]));

        int start = routes[0][1];
        for (int i = 1; i < routes.length; i++) {
            if (routes[i][0] > start || routes[i][1] < start) {
                start = routes[i][1];
                answer++;
            }
        }

        return answer;
    }
}
