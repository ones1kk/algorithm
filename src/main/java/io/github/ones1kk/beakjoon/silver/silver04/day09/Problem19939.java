package io.github.ones1kk.beakjoon.silver.silver04.day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Problem19939 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[k];

        for (int i = 1; i <= k; i++) {
            arr[i - 1] = i;
            n -= i;
        }

        if (n >= 0) {
            if(n % k ==0) {
                bw.append(String.valueOf(arr[k-1] - arr[0]));
            }else {
                bw.append(String.valueOf(k));
            }
        } else {
            bw.append("-1");
            bw.flush();
            return;
        }

        br.close();
        bw.close();
    }
}
