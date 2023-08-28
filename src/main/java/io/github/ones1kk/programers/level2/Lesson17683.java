package io.github.ones1kk.programers.level2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Lesson17683 {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    // 12, 15, 20, 21, 27, 28
    public static String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        Map<String, String> map = new HashMap<>();
        map.put("C#", "c");
        map.put("D#", "d");
        map.put("F#", "f");
        map.put("G#", "g");
        map.put("A#", "a");

        for (String key : map.keySet()) {
            m = m.replace(key, map.get(key));
        }

        int maxTime = 0;
        for (String musicinfo : musicinfos) {
            StringTokenizer st = new StringTokenizer(musicinfo, ",");
            LocalTime startTime = LocalTime.parse(st.nextToken(), FORMATTER);
            LocalTime endTime = LocalTime.parse(st.nextToken(), FORMATTER);
            String songName = st.nextToken();
            String melody = st.nextToken();

            for (String key : map.keySet()) {
                melody = melody.replace(key, map.get(key));
            }

            long between = Duration.between(startTime, endTime).getSeconds() / 60;


            while (melody.length() < between) {
                melody += melody;
            }

            melody = melody.substring(0, (int) between);

            if (melody.contains(m)) {
                if (maxTime < between) {
                    maxTime = (int) between;
                    answer = songName;
                }
            }

        }

        return answer;
    }

}
