package day4.stack;

import java.util.Arrays;


/**
 * LIFO
 * <p>
 * pop() 꺼내고 지운다
 * push() 넣는다
 * peek() 조회용
 * isEmpty() 비어있는지 확인
 */
public class MyStack<T> implements Stack<T> {

    int size;
    T[] stack;

    public MyStack() {
        new MyStack(100);
    }

    public MyStack(int size) {
        this.size = 0;
        stack = (T[]) new Object[size * 2];
    }

    @Override
    public T push(T data) {
        if (size >= stack.length) {
            throw new IndexOutOfBoundsException();
        }
        this.stack[size] = data;
        size++;
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NullPointerException();
        }
        T t = stack[size - 1];
        System.out.println(t);
        return t;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException();
        }
        T returnV = stack[--size];
        stack[size] = null;
        System.out.println(returnV);
        return returnV;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push(123);
        myStack.push(1);
        myStack.push(5);
        myStack.push(6);
        myStack.push(3);
        myStack.push(1);

        myStack.peek();
        myStack.peek();
        myStack.peek();
        myStack.peek();
        myStack.peek();
        System.out.println(Arrays.toString(myStack.stack));
        System.out.println(myStack.isEmpty());

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.isEmpty());
        myStack.pop();
        System.out.println(myStack.isEmpty());
        myStack.pop();
//        myStack.pop(); // error
        System.out.println(myStack.isEmpty());
        System.out.println(Arrays.toString(myStack.stack));
    }
}
