package queue;

import java.util.EmptyStackException;

// pamiętamy pierwszy i ostatni element

public class LinkedQueue<T> {

    private QueueElement<T> first;
    private QueueElement<T> last;
    protected int size;

    public LinkedQueue() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    public void push(T value) {
        QueueElement newLast = new QueueElement(value);

        if (isEmpty()) {
            first = newLast;
            last = newLast;
        } else {
            last.setNextElement(newLast);
            last = last.getNextElement();
        }
        size++;
    }

    public T front() {
        if (!isEmpty()) {
            return first.getValue();
        } else {
            throw new EmptyStackException();
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        if (size == 1) {
            last = null;
        }
        T temp = first.getValue();
        first = first.getNextElement();
        size--;
        return temp;
  /*      if (size > 0) {
            QueueElement popElement = first;
            size--;
            if (size == 0) {
                first = null;
                return popElement.valu;
            }
            first = first.nextElement;
            return popElement.valu;
        } else {
            throw new EmptyStackException();
        }  */
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {

        StringBuilder outBuild = new StringBuilder();

        if (size == 0) {
            return "{}";
        }
        QueueElement printElement = first;
        System.out.print("{");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(printElement.getValue() + ", ");
            //   String = (S)
            //    outBuild.append()
            printElement = printElement.getNextElement();
        }
        return printElement.getValue() + "}";
    }
}
