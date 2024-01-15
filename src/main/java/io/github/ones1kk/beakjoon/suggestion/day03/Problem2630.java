package io.github.ones1kk.beakjoon.suggestion.day03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2630 {

    static int n;
    static int white;
    static int blue;
    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int val = Integer.parseInt(st.nextToken());
                arr[i][j] = val;
            }
        }

        partition(0, 0, n);

        System.out.println(white);
        System.out.println(blue);

        br.close();
    }

    private static void partition(int row, int col, int size) {
        if (check(row, col, size)) {
            if (arr[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newSize = size / 2;

        // 1사분면
        partition(row, col + newSize, newSize);

        // 2사분면
        partition(row, col, newSize);

        // 3사분면
        partition(row + newSize, col, newSize);

        // 4사분면
        partition(row + newSize, col + newSize, newSize);
    }

    private static boolean check(int row, int col, int size) {
        int first = arr[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }

}
