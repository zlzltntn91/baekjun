package day6;

import java.util.*;

public class Back11659_usedScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = " ";

        int conditions = scanner.nextInt();
        int conditions2 = scanner.nextInt();

        scanner.nextLine();

        int[] nums = new int[conditions];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        scanner.nextLine();

        long[] prefixSum = new long[conditions];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] += prefixSum[i-1] + nums[i];
        }

        String[] ranges = new String[conditions2];

        for (int i = 0; i < conditions2; i++) {
            ranges[i] = scanner.nextLine();
        }

        for (int i = 0; i < ranges.length; i++) {
            String[] range = ranges[i].split(regex);
            int from = Integer.parseInt(range[0]) - 1;
            int to = Integer.parseInt(range[1]) - 1;
            long result = prefixSum[to];
            if (from != 0) {
                int before = from - 1;
                result = prefixSum[to] - prefixSum[before];
            }
            System.out.println(result);
        }
    }
}
