package day6;

import java.io.*;
import java.util.*;

public class Back10986 {
    public static void main(String[] args) throws IOException {
        // M으로 나누어 떨어지는 연속된 구간의 합의 개수
        // 첫줄 입력 받아서 (M)[0] == 주어진 수 배열 사이즈, (N)[1] == 몫
        // 연속된 수 배열 초기화
        // 구간합 배열 초기화
        // 구간합 배열을 %로 초기화
        // result++;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int div = Integer.parseInt(st.nextToken());

        int[] numbers = new int[length];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        long[] prefixSum = new long[length];
        prefixSum[0] = numbers[0];
        for (int i = 1; i < length; i++) {
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }

        long result = 0;
        for (int i = 0; i < length; i++) {
            prefixSum[i] = prefixSum[i] % div;
            result += prefixSum[i] == 0 ? 1 : 0;
        }

        Map<Long, Long> resultMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            resultMap.put(prefixSum[i], resultMap.getOrDefault(prefixSum[i], 0l) + 1);
        }

        for (Long aLong : resultMap.keySet()) {
            long reminderCounts = resultMap.get(aLong);
            if (reminderCounts > 1) {
                result += reminderCounts * (reminderCounts-1) / 2 ;
            }
        }

        System.out.println(result);

    }
}
