package linkedList;

import java.util.EmptyStackException;

//lista dwukierunkowa
// add dwie wersje z indeksem i tylko wartością
// get
// remove
public class LinkedList<T> {

    private ListElement head;
    private ListElement tail;
    private Integer size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // nie musimy rozpatrywać sytuacji przy dodawaniu drugiego elementu
    // ponieważ tail i head sa wskaźnikami na ten sam obiekt
    public void add(T value) {
        if (!isEmpty()) {
            tail.nextElement = new ListElement(value);
            tail.nextElement.proviousElement = tail;
            tail = tail.nextElement;
        } else {
            head = new ListElement(value);
            tail = head;
        }
        size++;
    }

    //element wstawiamy przed obecny element tylko do niepustej listy
    public void add(int index, T valu) {
        if (isEmpty() || index >= size) {
            throw new EmptyStackException();
        }

        ListElement currentElement = getElement(index);
        ListElement addedElement = new ListElement(valu);

        if (index != 0) {
            currentElement.proviousElement.nextElement = addedElement;
            addedElement.proviousElement = currentElement.proviousElement;
            currentElement.proviousElement = addedElement;
            addedElement.nextElement = currentElement;
        } else {
            currentElement.proviousElement = addedElement;
            addedElement.nextElement = currentElement;
            head = addedElement;
        }
        size++;
    }

    private ListElement getElement(int index) {
        if (index < 0 || index > size) {
            throw new EmptyStackException();
        }
        ListElement currentElement = head;
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.nextElement;
        }
        return currentElement;
    }

    public T get(int index) {
        return getElement(index).value;
    }

    public int getSize() {

        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public T getHead() {
        if (!isEmpty()) {
            return head.value;
        }
        return null;
    }

    public T getTail() {
        if (!isEmpty()) {
            return tail.value;
        }
        return null;
    }

    private class ListElement {
        T value;
        ListElement proviousElement;
        ListElement nextElement;

        public ListElement(T value) {
            this.value = value;
            this.proviousElement = null;
            this.nextElement = null;
        }
    }
}
