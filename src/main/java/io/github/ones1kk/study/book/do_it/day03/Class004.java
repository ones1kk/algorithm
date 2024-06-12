package io.github.ones1kk.study.book.do_it.day03;

public class Class004 {

    public static long resolve(int[][] sources, int x1, int y1, int x2, int y2) {
        int length = sources.length;
        int[][] sumArray = new int[length + 1][length + 1];

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                sumArray[i][j] = sumArray[i - 1][j] + sumArray[i][j - 1] - sumArray[i - 1][j - 1] + sources[i - 1][j - 1];
            }
        }

        return sumArray[x2][y2] - sumArray[x2][y1 - 1] - sumArray[x1 - 1][y2] + sumArray[x1 - 1][y1 - 1];
    }
}
