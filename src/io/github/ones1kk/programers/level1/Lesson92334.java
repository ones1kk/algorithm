package io.github.ones1kk.programers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson92334 {

    private static final String[] ID_LIST1 = new String[]{"muzi", "frodo", "apeach", "neo"};
    private static final String[] ID_LIST2 = new String[]{"con", "ryan"};

    private static final String[] REPORT1 = new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    private static final String[] REPORT2 = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};

    private static final int COUNT1 = 2;
    private static final int COUNT2 = 3;

    public static void main(String[] args) {
        int[] solution1 = solution2(ID_LIST1, REPORT1, COUNT1);
        for (int i : solution1) {
            System.out.println(i);
        }

        System.out.println("========");

        int[] solution2 = solution2(ID_LIST2, REPORT2, COUNT2);
        for (int i : solution2) {
            System.out.println(i);
        }
    }


    // 테스트 케이스 3 실패
    public static int[] solution1(String[] id_list, String[] report, int k) {
        Set<User> users = new HashSet<>();
        for (String id : id_list) {
            users.add(new User(id));
        }

        // 신고 현황을 파악한다.
        for (String history : report) {
            String[] ids = history.split(" ");
            String reportId = ids[0];
            String reportedId = ids[1];
            for (User user : users) {
                if (user.contains(reportedId)) {
                    user.addReportId(reportId);
                }
            }
        }

        // 신고 현황을 계산한다.
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            for (User user : users) {
                // 정지 여부
                if (user.isSuspend(k)) {
                    // 해당 유저를 신고한 유저 정보를 가져온다.
                    Set<String> reportIds = user.getReportIds();
                    for (String reportId : reportIds) {
                        if (id.equals(reportId)) {
                            answer[i]++;
                        }
                    }
                }
            }
        }

        return answer;
    }

    static class User {

        private final String id;

        private final Set<String> reportIds;

        public User(String id) {
            this.id = id;
            this.reportIds = new HashSet<>();
        }

        public Set<String> getReportIds() {
            return reportIds;
        }

        public boolean contains(String id) {
            return this.id.equals(id);
        }

        public boolean isSuspend(int standardCount) {
            return this.reportIds.size() >= standardCount;
        }

        public void addReportId(String reportId) {
            this.reportIds.add(reportId);
        }

    }

    // 통과
    public static int[] solution2(String[] id_list, String[] report, int k) {
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
