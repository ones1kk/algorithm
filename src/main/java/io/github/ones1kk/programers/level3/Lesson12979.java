package io.github.ones1kk.programers.level3;

import java.util.Arrays;

public class Lesson12979 {

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int current = 1;
        int range = (2 * w) + 1;
        int diff;

        for (int station : stations) {
            int start = station - w;
            int end = station + w;
            if (current < start) {
                diff = start - current;
                answer += (int) Math.ceil((double) diff / range);
            }
            current = end + 1;
        }

        if (current <= n) {
            diff = n - current + 1;
            answer += (int) Math.ceil((double) diff / range);
        }
        return answer;
    }

    // 시간 초과 코드
    public static int fail(int n, int[] stations, int w) {
        boolean[] map = new boolean[n + 1];

        for (int idx : stations) {
            int start = idx - w;
            if (start < 1) {
                start = 1;
            }
            int end = idx + w;
            if (end > n) {
                end = n;
            }
            Arrays.fill(map, start, end + 1, true);
        }

        int limit = (2 * w) + 1;
        int answer = 0;
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (map[i]) {
                answer += (int) Math.ceil((double) idx / limit);
                idx = 0;
            } else if (i == n) {
                if (idx != 0) {
                    answer += (int) Math.ceil((double) idx / limit);
                } else {
                    answer++;
                }
            } else {
                idx++;
            }
        }
        return answer;
    }

}
