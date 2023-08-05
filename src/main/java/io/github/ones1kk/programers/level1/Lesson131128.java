package io.github.ones1kk.programers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson131128 {

    // 시간 복잡도
    // 숫자로 구성된 문자열은 최초 모든 데이터가 0~9로 구성되어있음
    // 배열로 숫자표를 만들어 갯수를 체크. 즉 직접 모든 문자열을 순환해 탐색할 필요 X -> 보유 갯수를 체크하면 됨
    // 그 후 내림차순은 reverse direction of for loop, 오름차순은 일반적 for loop
    public static String solution(String x, String y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (int i = 0; i < x.length(); i++) {
            xArr[Character.getNumericValue(x.charAt(i))]++;
        }
        for (int i = 0; i < y.length(); i++) {
            yArr[Character.getNumericValue(y.charAt(i))]++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (xArr[i] > 0 && yArr[i] > 0) {
                answer.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }

        if (answer.toString().startsWith("0") && answer.toString().endsWith("0")) {
            return "0";
        }

        if (answer.toString().isEmpty()) {
            return "-1";
        }

        return answer.toString();
    }

    public static String fail(String x, String y) {
        StringBuilder standard = new StringBuilder(x);
        StringBuilder target = new StringBuilder(y);

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < x.length(); i++) {
            char s = standard.charAt(i);
            int idx = target.toString().indexOf(s);
            if (idx != -1) {
                list.add(s);
                target.deleteCharAt(idx);
            }
        }

        if (list.isEmpty()) {
            return "-1";
        }

        list.sort(Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();
        for (Character value : list) {
            answer.append(value);
        }

        if (answer.toString().startsWith("0") && answer.toString().endsWith("0")) {
            return "0";
        }

        if (answer.length() > 1) {
            while (answer.toString().startsWith("0")) {
                answer = new StringBuilder(answer.substring(1) + answer.charAt(0));
            }
        }

        return answer.toString();
    }
}
