package stack;

import java.util.EmptyStackException;

public class LinkedStack {

    private StackElement top;
    private int size;

    public LinkedStack() {
        size = 0;
        top = null;
    }

    public void push(int value) {

        top = new StackElement(value, top);
        size++;
    }

    public int peek() {
        if (size > 0) {
            return top.valu;
        } else {
            throw new EmptyStackException();
        }
    }

    public int pop() {

        if (size > 0){
            StackElement popElement = top;
            size --;
            if (size == 0){
                top = null;
                return popElement.valu;
            }
            top = top.previousElement;
            return popElement.valu;
        } else{
            throw new EmptyStackException();
        }

    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        return top.valu.toString();
    }

    private class StackElement {
        Integer valu;
        StackElement previousElement;

        public StackElement(Integer valu, StackElement previousElement) {
            this.valu = valu;
            this.previousElement = previousElement;
        }
    }
}
