package io.github.ones1kk.beakjoon.silver.silver05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem11866 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int standard = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        sb.append("<");

        int idx = 1;
        while (!q.isEmpty()) {
            for (int i = 1; i <= n; i++) {
                Integer poll = q.poll();
                if (idx == standard) {
                    if (q.isEmpty()) {
                        sb.append(poll).append(">");
                    } else {
                        sb.append(poll).append(", ");
                    }
                    idx = 1;
                } else {
                    q.add(poll);
                    idx++;
                }
            }
        }

        System.out.println(sb);

        br.close();
    }

    public static void fail(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int standard = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        List<Integer> list = new ArrayList<>();
        list.add(arr[standard]);
        visited[standard] = true;

        sb.append("<");
        int start = standard + 1;

        while (list.size() < n) {
            if (start > n) {
                start %= n;
            }
            int end = start + (standard - 1);
            for (int i = start; i <= end; i++) {
                if (i > n) {
                    i %= n;
                    end %= n;
                }
                if (visited[i]) {
                    end++;
                }
            }

            list.add(arr[end]);
            visited[end] = true;
            start = end + 1;
        }

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i)).append(">");
            } else {
                sb.append(list.get(i)).append(", ");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
