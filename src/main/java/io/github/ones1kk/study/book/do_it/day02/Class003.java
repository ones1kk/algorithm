package io.github.ones1kk.study.book.do_it.day02;

public class Class003 {

    public static long resolve(long[] sources, int start, int end) {
        int length = sources.length;
        long[] sumArray = new long[length + 1];
        for (int i = 1; i <= length; i++) {
            sumArray[i] = sumArray[i - 1] + sources[i - 1];
        }

        return sumArray[end] - sumArray[start - 1];
    }
}
