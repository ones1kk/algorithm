package io.github.ones1kk.programers.series.backtracking.day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson172927 {

    static int[] counts = new int[3];
    static int[][] map = {{1, 1, 1}, {5, 1, 1}, {25, 5, 1}};

    // test case 8번 실패
    // 이유는 알지만 코드 작성을 못하겠음...
    public static int solution(int[] picks, String[] minerals) {
        for (int i = 0; i < picks.length; i++) {
            counts[i] = picks[i] * 5;
        }

        List<Mineral> list = new ArrayList<>();
        int n = minerals.length;
        for (int i = 0; i < (int) Math.ceil((double) n / 5); i++) {
            Mineral m = new Mineral();
            for (int j = i * 5; j < (i * 5) + 5; j++) {
                if (j < n) {
                    String mineral = minerals[j];
                    if (mineral.equals("diamond")) {
                        m.d++;
                    } else if (mineral.equals("iron")) {
                        m.i++;
                    } else {
                        m.s++;
                    }
                } else {
                    break;
                }
            }
            list.add(m);
        }

        list.sort(Collections.reverseOrder());

        int answer = 0;
        List<Integer> candidates = new ArrayList<>();
        for (Mineral mineral : list) {
            int diamond = mineral.d;
            int iron = mineral.i;
            int stone = mineral.s;
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > 0) {
                    int sum = map[i][0] * diamond + map[i][1] * iron + map[i][2] * stone;
                    if (sum < min) {
                        min = sum;
                        idx = i;
                    }
                    candidates.add(sum);
                }
            }
            int value = candidates.isEmpty() ? 0 : Collections.min(candidates);
            counts[idx] -= 5;
            answer += value;
            candidates.clear();
        }
        return answer;
    }

    static class Mineral implements Comparable<Mineral> {
        private int d;
        private int i;
        private int s;

        @Override
        public int compareTo(Mineral o) {
            if (d == o.d) {
                if (i == o.i) {
                    return Integer.compare(s, o.s);
                }
                return Integer.compare(i, o.i);
            }
            return Integer.compare(d, o.d);
        }
    }
}
