package io.github.ones1kk.beakjoon.series.backtracking.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem15656 {

    static int n, m;
    static int[] arr;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        answer = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0);

        System.out.println(sb);

        br.close();
    }

    private static void dfs(int depth) {
        if (depth == m) {
            for (int i : answer) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            answer[depth] = arr[i];
            dfs(depth + 1);
        }

    }
}
