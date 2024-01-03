package io.github.ones1kk.beakjoon.dps.day04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1388 {

    static int MAX = 60;
    static int ANSWER = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] map = new char[MAX][MAX];
        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= m; j++) {
                char c = line.charAt(j - 1);
                map[i][j] = c;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (map[i][j] != 0) {
                    dfs(i, j, map);
                    ANSWER++;
                }
            }
        }

        bw.append(String.valueOf(ANSWER));

        br.close();
        bw.close();
    }

    private static void dfs(int i, int j, char[][] map) {
        char cur = map[i][j];
        map[i][j] = 0;
        if (cur == '-' && map[i][j + 1] == '-') {
            dfs(i, j + 1, map);
        }
        if (cur == '|' && map[i + 1][j] == '|') {
            dfs(i + 1, j, map);
        }
    }

}
