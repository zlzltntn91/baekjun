package day7;

import java.util.Scanner;

public class Back10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int result = 1;
        for (int j = i; j > 0; j--) {
            result *= j;
        }
        System.out.println(result);
    }
}
