package io.github.ones1kk.programers.level2;

public class Lesson70129 {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                }
            }
            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }

        return answer;
    }
}
