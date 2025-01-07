package day3;

import java.util.Scanner;

public class MyStack {

    private int[] stack;
    private int count = 0;

    public MyStack() {
        stack = new int[10];
    }

    public MyStack(int size) {
        stack = new int[size];
    }

    private void push(int i) {
        stack[count++] = i;
    }

    private int pop() {
        if(empty() == 1){
            return stack[count];
        }
        return -1;
    }

    private int size() {
        return stack.length;
    }


    private int empty() {
        if (stack != null && count != 0) {
            return 0;
        }
        return 1;
    }

    private int peek() {
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int commandCount = limit;
        MyStack myStack = new MyStack();

        while (true) {
            int message = scanner.nextInt();
            switch (message) {
                case 1:
                    myStack.push(scanner.nextInt());
                    break;
                case 2:
                    System.out.println(myStack.pop());
                    break;
                case 3:
                    System.out.println(myStack.size());
                    break;
                case 4:
                    System.out.println(myStack.empty());
                    break;
                case 5:
                    System.out.println(myStack.peek());
                    break;
                default:
                    break;
            }
        }
    }

}
