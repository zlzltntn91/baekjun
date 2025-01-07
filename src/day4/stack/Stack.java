package day4.stack;

public interface Stack<T> {
    T pop();
    T push(T data);
    T peek();
    boolean isEmpty();
}
