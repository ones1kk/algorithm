package io.github.ones1kk.beakjoon.series.backtracking.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem15654 {

    static int n, m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int[] nums;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n];
        arr = new int[m];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        dfs(0);

        System.out.println(sb);

        br.close();
    }

    private static void dfs(int depth) {
        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                arr[depth] = nums[i];
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

}
