package stack;//implementacja stosu

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class ArrayStack<T> {
    private List<T> stack;
    private T top;
    private Integer size;
    private Integer currentSize;

    public ArrayStack(int size) {
        stack = new ArrayList<>();
        this.size = size;
        currentSize = 0;
        //  stack = (T[]) new Object[size]; pozwala stworzyć tablicę typów generycznych
    }

    public void push(T element) {
        if (size != stack.size()) {
            stack.add(element);
            top = element;
            currentSize++;
        } else {
            System.out.println("Nie można dodać elementu. Stos jest już zapełniony!");
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return top;
        } else {
            throw new EmptyStackException();
        }
    }

    public T pop() {
        if (!isEmpty()) {
            currentSize--;
            T element = stack.get(currentSize);
            System.out.println("pop" + stack.get(currentSize));
            stack.remove(currentSize);
            if (currentSize == 0) {
                top = null;
                return element;
            }
            top = stack.get(currentSize - 1);
            return element;
  /*          size--;
            if (size == 0) {
                top = null;
                return stack[size]; //return wychodzi z metody i nie musimy dodawać else
            }
            top = stack[size - 1];
            return stack[size]; */
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }
}
