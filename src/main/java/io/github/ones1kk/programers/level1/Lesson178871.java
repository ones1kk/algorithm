package io.github.ones1kk.programers.level1;

import java.util.HashMap;
import java.util.Map;

public class Lesson178871 {
    public static String[] solution(String[] players, String[] callings) {
        Map<Integer, String> scoreMap = new HashMap<>();
        Map<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
            scoreMap.put(i, players[i]);
        }

        for (String calling : callings) {
            Integer score = playerMap.get(calling);
            String frontRunner = scoreMap.get(score - 1);
            scoreMap.put(score, frontRunner);
            scoreMap.put(score - 1, calling);

            playerMap.put(calling, score - 1);
            playerMap.put(frontRunner, score);
        }

        String[] answer = new String[players.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = scoreMap.get(i);
        }

        return answer;
    }
}
