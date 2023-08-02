package io.github.ones1kk.programers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson42862 {

    public static int solution(int n, int[] lost, int[] reserve) {
        // 최초 가져온 학생 수
        int answer = n - lost.length;

        // 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        Map<Integer, Boolean> reserveMap = new HashMap<>();
        Map<Integer, Boolean> lostMap = new HashMap<>();

        // 여벌의 체육복을 가져온 학생 등록
        for (int i : reserve) {
            reserveMap.put(i, true);
        }

        // 체육복 도둑맞은 학생 등록
        for (int i : lost) {
            lostMap.put(i, true);
            // 여벌 체육복 가져온 학생이 도둑맞았다면
            if (reserveMap.containsKey(i)) {
                // 비정상으로 등록
                reserveMap.put(i, false);
                lostMap.put(i, false);
                // 최초 수에서 정상 처리
                answer++;
            }
        }

        for (int i : lost) {
            // 비정상이라면
            Boolean isLost = lostMap.get(i);
            if (!isLost) {
                continue;
            }

            for (int j : reserve) {
                // 비정상이라면
                Boolean isReserved = reserveMap.get(j);
                if (!isReserved) {
                    continue;
                }

                // 빌려줄 수 있는 번호라면
                if (Math.abs(i - j) == 1) {
                    reserveMap.put(j, false);
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }

    // 풀이 좋아요 1위
    public static int mostLikedSolution(int n, int[] lost, int[] reserve) {
        int answer = n;

        // 초기화
        int[] student = new int[n];

        for (int i : lost) {
            student[i - 1]--;
        }

        for (int i : reserve) {
            student[i - 1]++;
        }

        for (int i = 0; i < student.length; i++) {
            if (student[i] == -1) {
                if (i - 1 >= 0 && student[i - 1] == 1) {
                    student[i]++;
                    student[i - 1]--;
                } else if (i + 1 < student.length && student[i + 1] == 1) {
                    student[i]++;
                    student[i + 1]--;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }
}
