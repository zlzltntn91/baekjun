package day6;

import java.util.Scanner;

public class Back1546 {
    public static void main(String[] args) {
        // 최대값 M
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        String next2 = scanner.nextLine();

        String[] points = next2.split(" ");
        int max = Integer.parseInt(points[0]);
        int sum = max;
        for (int i = 1; i < points.length; i++) {
            int another = Integer.parseInt(points[i]);
            sum += another;
            if (max < another) {
                max = another;
            }
        }

        System.out.println((sum / new Double(max) * 100) / Double.parseDouble(next));
    }
}
