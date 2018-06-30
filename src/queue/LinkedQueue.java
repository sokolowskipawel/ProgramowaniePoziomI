package queue;

import java.util.EmptyStackException;

// pamiętamy pierwszy i ostatni element

public class LinkedQueue<T> {

    private QueueElement first;
    private QueueElement last;
    private int size;

    public LinkedQueue() {
        size = 0;
        first = null;
        last = null;
    }

    public void push(T value) {
        QueueElement newLast = new QueueElement(value);

        if (size == 0) {
            first = newLast;
            last = newLast;
        }else {
            last.nextElement = newLast;
            last = newLast;
        }
        size++;
    }

    public T front() {
        if (size > 0) {
            return first.valu;
        } else {
            throw new EmptyStackException();
        }
    }

    public T pop() {
        if (size > 0) {
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
        }
    }

    /*  public T pop() {

          if (size > 0) {
              LinkedStack.StackElement popElement = top;
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
  */
    public boolean isEmpty() {
        return size == 0;
    }

    private class QueueElement {
        T valu;
        QueueElement nextElement;


        public QueueElement(T valu) {
            this.valu = valu;
            this.nextElement = null;
        }
    }
}
