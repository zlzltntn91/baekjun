package day7;

import java.util.Scanner;

public class Back24723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int result = 1;
        for (int j = 1; j < i + 1; j++) {
            result *= 2;
        }
        System.out.println(result);
    }
}
