package queue;

public class PriorityQueueElement<T> extends QueueElement<T> {

    private int priority;
    private PriorityQueueElement nextElement;

    public PriorityQueueElement(T value, int priority) {
        super(value);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public PriorityQueueElement<T> getNextElement() {
        return nextElement;
    }

    public void setNextElement(PriorityQueueElement<T> nextElement) {
        this.nextElement = nextElement;
    }
}
