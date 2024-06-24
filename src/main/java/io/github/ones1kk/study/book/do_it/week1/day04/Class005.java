package io.github.ones1kk.study.book.do_it.week1.day04;

public class Class005 {

    public static long resolve(int n, int m, int[] arr) {
        long[] s = new long[n];
        long[] c = new long[m];
        long answer = 0;

        s[0] = arr[0];
        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int remainder = (int) s[i] % m;
            if (remainder == 0) {
                answer++;
            }
            c[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if (c[i] > 1) {
                answer = answer + (c[i] * (c[i] - 1) / 2);
            }
        }


        return answer;
    }
}
