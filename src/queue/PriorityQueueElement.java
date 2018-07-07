package queue;

public class PriorityQueueElement<T> {

    private int priority;
    private T value;
    private PriorityQueueElement<T> nextElement;

    public PriorityQueueElement(T value, int priority) {
        this.value = value;
        this.priority = priority;
        this.nextElement = null;
    }

    public int getPriority() {
        return priority;
    }

    public T getValue() {
        return value;
    }

    public PriorityQueueElement<T> getNextElement() {
        return nextElement;
    }

    public void setValu(T valu) {
        this.value = value;
    }

    public void setNextElement(PriorityQueueElement nextElement) {
        this.nextElement = nextElement;
    }

    @Override
    public String toString() {
//      return getNextElement() != null ? getValue() + " " + getNextElement().toString() : getValue().toString();
        // to jest to samoa
        return getNextElement() != null ? getValue() + " " + getNextElement() : getValue().toString();
    }
}
