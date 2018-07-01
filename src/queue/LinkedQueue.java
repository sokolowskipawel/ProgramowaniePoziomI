package queue;

import java.util.EmptyStackException;

// pamiętamy pierwszy i ostatni element

public class LinkedQueue<T> {

    private QueueElement first;
    private QueueElement last;
    private int size;

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
            last.nextElement = newLast;
            last = last.nextElement;
        }
        size++;
    }

    public T front() {
        if (!isEmpty()) {
            return first.valu;
        } else {
            throw new EmptyStackException();
        }
    }

    public T pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        if (size == 1){
            last = null;
        }
        T temp = first.valu;
        first = first.nextElement;
        size --;
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
            System.out.print(printElement.valu + ", ");
         //   String = (S)
        //    outBuild.append()
            printElement = printElement.nextElement;
        }
        return printElement.valu + "}";
    }

    private class QueueElement {
        T valu;
        QueueElement nextElement;


        public QueueElement(T valu) {
            this.valu = valu;
            this.nextElement = null;
        }

        @Override
        public String toString() {
            if (nextElement == null){
                return valu.toString();
            }
            return toString();
        }
    }
}
