package io.github.ones1kk.beakjoon.silver.silver04.day07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Problem1205 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        if(n == 0) {
            System.out.println(1);
            return;
        }
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Comparator.reverseOrder());

        if (n == p && score <= list.get(list.size() - 1))
            System.out.print(-1);
        else {
            int rank = 1;
            for (Integer integer : list) {
                if (score < integer)
                    rank++;
                else {
                    break;
                }
            }
            System.out.print(rank);
        }

        br.close();
    }
}
