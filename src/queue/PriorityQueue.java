package queue;

public class PriorityQueue<T> extends LinkedQueue<T> {

    private PriorityQueueElement<T> first;
    private PriorityQueueElement<T> last;

    public PriorityQueue() {
        super();
    }

    public void push(T value, int priority) {
        PriorityQueueElement newElement = new PriorityQueueElement(value, priority);

        if (isEmpty()) {
            first = newElement;
            last = newElement;
        } else if (newElement.getPriority() < first.getPriority()) {
            newElement.setNextElement(first);
            first = newElement;
        } else if (first != last) {
            PriorityQueueElement currentElement = first;
            for (int i = 0; i < size; i++) {
                if (newElement.getPriority() < currentElement.getNextElement().getPriority()) {
                    newElement.setNextElement(currentElement.getNextElement());
                    currentElement.setNextElement(newElement);
                    break;
                }
                last.setNextElement(newElement);
                last = newElement;
            }
        } else {
            first.setNextElement(newElement);
            last = newElement;
            //   last.setNextElement(newElement);
            //   last = last.getNextElement();
        }

        size++;
        System.out.println(size);
    }
}
