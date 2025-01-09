package day7;

import java.util.Scanner;

public class Back11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int factorial = factorial(i, j);
        int factorial1 = factorial(j, j);
        System.out.println(factorial / factorial1);
    }

    private static int factorial(int i, int limit) {
        if (i == 1 || limit == 0) return 1;
        return i * factorial(i - 1, limit - 1);
    }
}
