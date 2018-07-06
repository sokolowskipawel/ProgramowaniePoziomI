package queue;

public class PriorityQueueElement<T> {

    private int priority;
    private T value;
    private PriorityQueueElement nextElement;

    public PriorityQueueElement(T value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public T getValue() {
        return value;
    }

    public PriorityQueueElement getNextElement() {
        return nextElement;
    }

    public void setValu(T valu) {
        this.value = value;
    }

    public void setNextElement(PriorityQueueElement nextElement) {
        this.nextElement = nextElement;
    }
}
