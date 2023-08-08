package io.github.ones1kk.programers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson12915 {

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (f, s) -> {
                    if (f.charAt(n) == s.charAt(n)) {
                        return f.compareTo(s);
                    } else if (f.charAt(n) > s.charAt(n)) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
        );
        return strings;
    }

    public static String[] mostLikedSolution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add(string.charAt(n) + string);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}
