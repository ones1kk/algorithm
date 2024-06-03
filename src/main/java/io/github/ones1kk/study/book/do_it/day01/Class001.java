package io.github.ones1kk.study.book.do_it.day01;

public class Class001 {

    public static int resolve(int count, long num) {
        String str = String.valueOf(num);
        int answer = 0;
        for (int i = 0; i < count; i++) {
            answer += Character.getNumericValue(str.charAt(i));
        }

        return answer;
    }
}
