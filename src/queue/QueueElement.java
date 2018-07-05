package queue;

public class QueueElement<T> {

    private T value;
    private QueueElement nextElement;


    public QueueElement(T value) {
        this.value = value;
        this.nextElement = null;
    }

    public T getValue() {
        return value;
    }

    public QueueElement getNextElement() {
        return nextElement;
    }

    public void setValu(T valu) {
        this.value = value;
    }

    public void setNextElement(QueueElement nextElement) {
        this.nextElement = nextElement;
    }

    @Override
    public String toString() {
        if (nextElement == null){
            return value.toString();
        }
        return toString();
    }
}
