package stack;

import java.util.EmptyStackException;

public class LinkedStack<T> {

    private StackElement top;
    private int size;

    public LinkedStack() {
        size = 0;
        top = null;
    }

    public void push(T value) {

        top = new StackElement(value, top);
        size++;
    }

    public T peek() {
        if (size > 0) {
            return top.valu;
        } else {
            throw new EmptyStackException();
        }
    }

    public T pop() {

        if (size > 0) {
            StackElement popElement = top;
            size--;
            if (size == 0) {
                top = null;
                return popElement.valu;
            }
            top = top.previousElement;
            return popElement.valu;
        } else {
            throw new EmptyStackException();
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class StackElement {
        T valu;
        StackElement previousElement;

        public StackElement(T valu, StackElement previousElement) {
            this.valu = valu;
            this.previousElement = previousElement;
        }
    }
}
