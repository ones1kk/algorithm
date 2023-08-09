package io.github.ones1kk.programers.level2;

public class Lesson12951 {

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String lowerCase = s.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (i == 0 && Character.isLetter(c)) {
                answer.append(Character.toUpperCase(c));
                continue;
            }

            if (i > 0 && Character.isWhitespace(lowerCase.charAt(i - 1))) {
                answer.append(Character.toUpperCase(c));
                continue;
            }
            answer.append(c);
        }
        return answer.toString();
    }
}
