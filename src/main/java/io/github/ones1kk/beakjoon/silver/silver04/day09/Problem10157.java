package io.github.ones1kk.beakjoon.silver.silver04.day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10157 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        boolean[][] visit = new boolean[row][col];

        int cnt = 0, x = row - 1, y = 0, dir = 0;
        while (++cnt != k) {
            visit[x][y] = true;
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= row || ny >= col || visit[nx][ny]) {
                dir = ++dir % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        bw.append(String.valueOf((y + 1)))
                .append(" ")
                .append(String.valueOf(row - x));

        br.close();
        bw.close();
    }
}
