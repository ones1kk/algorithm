package io.github.ones1kk.study.book.do_it.week1.day01;

public class Class002 {

    static double resolve(int[] scores) {
        double max = Double.MIN_VALUE;
        double sum = 0;
        int length = scores.length;

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            sum = sum + score;
        }

        return sum * 100.0 / max / length;

    }
}
