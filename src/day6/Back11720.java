package day6;

import java.util.Scanner;

public class Back11720 {

    public static void main(String[] args) {

        int result = 0;

        Scanner scanner = new Scanner(System.in);
        // 첫째 줄에 숫자의 개수
        String count = scanner.next();
        // 둘째줄에 숫자 N개가 공백없이 주어짐
        String numbers = scanner.next();
        char[] chars = numbers.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            result += chars[i] - '0';
        }

        System.out.println(result);
    }
}
