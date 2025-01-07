package day1;
import java.util.Scanner;
import java.lang.String;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        String j = sc.next();

        int number = Integer.parseInt(i);
        String[] anotherNumbers = j.split("");
        
        int a = number * Integer.parseInt(anotherNumbers[2]);
        int b = number * Integer.parseInt(anotherNumbers[1]);
        int c = number * Integer.parseInt(anotherNumbers[0]);

 	    System.out.println(a);       
        System.out.println(b);
        System.out.println(c);
        System.out.println((a) + (b * 10) + (c * 100));
    }
}