// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42584#

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                   answer[i]++;
                if(prices[i] > prices[j]) {
                    break;
                }

            }
        }

        return answer;
    }
}