package io.github.ones1kk.programers.level1;

public class Lesson161989 {


    public static int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + m -1;
        int answer = 1;

        for (int i : section) {
            if(i >= start && i <= end) {
                continue;
            }else {
                start = i;
                end = start + m-1;
                answer++;
            }
        }

        return answer;
    }

    public static int fail(int n, int m, int[] section) {
        int answer = 0;

        int[] walls = new int[n];
        for (int j : section) {
            int area = j - 1;
            walls[area]++;
        }

        int scope = m == 1 ? 1 : m - 1;
        for (int i = 0; i < walls.length; i++) {
            if (walls[i] == 1) {
                if (i + scope < walls.length) {
                    for (int j = i; j <= i + scope; j++) {
                        walls[j] = 0;
                    }
                    answer++;
                }
                if (i - scope > 0) {
                    for (int j = i; j <= i - scope; j++) {
                        walls[j] = 0;
                    }
                    answer++;
                }
            }
        }

        return answer;
    }
}
