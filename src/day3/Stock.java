package day3;

import java.util.Arrays;

public class Stock {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int sec = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        Stock stock = new Stock();
        int[] prices = {1, 2, 3, 2, 3};
//        int[] prices = {3, 2, 1, 2, 3}; // 1, 1, 1, 2, 1
        stock.solution(prices);
    }
}
