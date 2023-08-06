package io.github.ones1kk.programers.level1;

import java.util.ArrayList;
import java.util.List;

public class Lesson42889 {

    // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
    // 전체 스테이지의 개수 N
    // 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages
    // 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] currentStages = new int[N + 1];
        int[] clearUsers = new int[N + 1];
        List<double[]> failureRate = new ArrayList<>();

        for (int stage : stages) {
            currentStages[stage - 1]++;
            for (int i = 0; i < stage; i++) {
                clearUsers[i]++;
            }
        }

        for (int i = 0; i < currentStages.length - 1; i++) {
            if (clearUsers[i] == 0) {
                failureRate.add(new double[]{i, 0});
                continue;
            }
            failureRate.add(new double[]{i, (double) currentStages[i] / clearUsers[i]});
        }

        failureRate.sort((f, s) -> Double.compare(s[1], f[1]));

        for (int i = 0; i < failureRate.size(); i++) {
            answer[i] = (int) failureRate.get(i)[0] + 1;
        }

        return answer;
    }
}
