package queue;

public class PriorytyQueue<T> extends LinkedQueue<T> {

    private PriorytyQueueElement first;
    private PriorytyQueueElement last;
    private int size;

    public PriorytyQueue() {
        super();
    }

    public void push(T value, int prioryty) {
        PriorytyQueueElement newLast = new PriorytyQueueElement(value, prioryty);

        if (isEmpty()) {
            first = newLast;
            last = newLast;
        } else {
            last.nextElement = newLast;
            last = last.nextElement;
        }
        size++;
    }

    private class PriorytyQueueElement {
        T valu;
        int priority;
        PriorytyQueueElement nextElement;


        public PriorytyQueueElement(T valu, int priority) {
            this.valu = valu;
            this.priority = priority;
            this.nextElement = null;
        }

        @Override
        public String toString() {
            if (nextElement == null) {
                return valu.toString();
            }
            return toString();
        }
    }
}
