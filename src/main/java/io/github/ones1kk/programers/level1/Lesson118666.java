package io.github.ones1kk.programers.level1;

import java.util.HashMap;
import java.util.Map;

public class Lesson118666 {

    public static String solution(String[] survey, int[] choices) {
        // 점수표 생성
        int[] scores = new int[]{0, 3, 2, 1, 0, 1, 2, 3};

        // 초기화
        char[][] indicators = new char[][]{{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        Map<Character, Integer> resultMap = new HashMap<>();
        for (char[] indicator : indicators) {
            for (char type : indicator) {
                resultMap.put(type, 0);
            }
        }

        // 입력 값 등록
        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            Integer score = scores[choice];
            if (choice > 4) {
                resultMap.put(survey[i].charAt(1), resultMap.get(survey[i].charAt(1)) + score);
            } else {
                resultMap.put(survey[i].charAt(0), resultMap.get(survey[i].charAt(0)) + score);
            }
        }

        // 정렬
        StringBuilder answer = new StringBuilder();
        for (char[] indicator : indicators) {
            char x = indicator[0];
            char y = indicator[1];

            char type = resultMap.get(x) >= resultMap.get(y) ? x : y;
            answer.append(type);
        }

        return answer.toString();
    }
}
