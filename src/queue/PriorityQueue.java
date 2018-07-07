package queue;

import java.util.EmptyStackException;

public class PriorityQueue<T> {

    private PriorityQueueElement<T> first;
    private PriorityQueueElement<T> last;
    protected int size;

    public PriorityQueue() {
        this.first = this.last = null;
        size = 0;
    }

    public void push(T value, int priority) {
        PriorityQueueElement newElement = new PriorityQueueElement(value, priority);

        if (isEmpty()) {
            first = newElement;
            last = newElement;
        } else if (newElement.getPriority() > first.getPriority()) {
            newElement.setNextElement(first);
            first = newElement;
        } else if (first != last) {
            PriorityQueueElement currentElement = first;
            for (int i = 0; i < size; i++) {
                if (newElement.getPriority() > currentElement.getNextElement().getPriority()) {
                    newElement.setNextElement(currentElement.getNextElement());
                    currentElement.setNextElement(newElement);
                    break;
                }
                last.setNextElement(newElement);
                last = newElement;
                last.setNextElement(null);
            }
        } else {
            first.setNextElement(newElement);
            last = newElement;
        }
        size++;
        //  System.out.println(size);
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
    }

    public boolean isEmpty() {
        return size == 0;
    }

//     public String toString() {
//  //        return "{" + print(first) + "}";
//     StringBuilder outBuild = new StringBuilder();
//
//        if (size == 0) {
//            return "{}";
//        }
//        PriorityQueueElement printElement = first;
//        System.out.print("{");
//        for (int i = 0; i < size - 1; i++) {
//            System.out.print(printElement.getValue() + ", ");
//            //   String = (S)
//            //    outBuild.append()
//            printElement = printElement.getNextElement();
//        }
//        return printElement.getValue() + "}";
//      }

    public String toString() {

        return first.toString();

    }
}
