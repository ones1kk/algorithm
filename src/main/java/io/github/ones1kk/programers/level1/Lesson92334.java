package io.github.ones1kk.programers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson92334 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> resultMap = new HashMap<>();
        for (String id : id_list) {
            resultMap.put(id, new HashSet<>());
        }

        // 신고 현황을 파악한다.
        for (String history : report) {
            String[] ids = history.split(" ");
            String reportId = ids[0];
            String reportedId = ids[1];

            Set<String> reportSet = resultMap.get(reportedId);
            reportSet.add(reportId);

            resultMap.put(reportedId, reportSet);
        }

        // 신고 현황을 계산한다.
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            for (String reportedId : resultMap.keySet()) {
                Set<String> reporting = resultMap.get(reportedId);
                if (reporting.size() >= k) {
                    for (String id : reporting) {
                        if (id_list[i].equals(id)) {
                            answer[i]++;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
