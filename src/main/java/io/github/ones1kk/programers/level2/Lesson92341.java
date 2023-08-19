package io.github.ones1kk.programers.level2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Lesson92341 {

    public static int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        Map<String, List<LocalTime>> map = new HashMap<>();
        for (String record : records) {
            StringTokenizer st = new StringTokenizer(record);
            String[] splitTime = st.nextToken().split(":");
            String car = st.nextToken();
            String info = st.nextToken();
            LocalTime time = LocalTime.of(Integer.parseInt(splitTime[0]), Integer.parseInt(splitTime[1]));

            List<LocalTime> list = map.getOrDefault(car, new ArrayList<>());
            list.add(time);
            map.put(car, list);
        }

        List<Integer> list = new ArrayList<>();
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (String car : keys) {
            List<LocalTime> times = map.get(car);
            if (times.size() % 2 == 1) {
                times.add(LocalTime.of(23, 59));
            }

            int totalDuration = 0;
            for (int i = 0; i < times.size(); i++) {
                if (i < times.size() - 1) {
                    totalDuration += Duration.between(times.get(i), times.get(i + 1)).getSeconds() / 60;
                    i++;
                }
            }

            if (totalDuration < baseTime) {
                list.add(baseFee);
            } else {
                int additional = (int) Math.ceil((double) (totalDuration - baseTime) / unitTime) * unitFee;
                list.add(baseFee + additional);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
