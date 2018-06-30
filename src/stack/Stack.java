package stack;

public interface Stack<T> {

    public void push(T value);

    public T peek();

    public T pop();

    public boolean isEmpty();
}
