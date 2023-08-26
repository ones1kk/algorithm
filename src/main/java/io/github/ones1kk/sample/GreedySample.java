package io.github.ones1kk.sample;

public class GreedySample {

    public static int solution1(int n) {
        int answer = 0;
        int[] coins = {500, 100, 50, 10};

        for (int coin : coins) {
            answer += n / coin;
            n = n % coin;
        }

        return answer;
    }

    public static int solution2(int n, int k) {
        int answer = 0;

        while (n > 1) {
            if (n % k == 0) {
                n = n / k;
            } else {
                n -= 1;
            }
            answer++;
        }
        return answer;
    }
}
