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

    //element wstawiamy przed obecny element
    public void add(int index, T valu) {
        if ((isEmpty() || index < 0 || index >= size)) {
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

    public T remove(int index) {
        ListElement removableElement = getElement(index);
        if (size == 1) {
            head = tail = null;
        } else if (index == 0) {
            head = head.nextElement;
            head.proviousElement = null;
        } else if (index == size - 1) {
            tail = tail.proviousElement;
            tail.nextElement = null;
        } else {
            removableElement.proviousElement.nextElement = removableElement.nextElement;
            removableElement.nextElement.proviousElement = removableElement.proviousElement;
        }
        size--;
        return removableElement.value;
    }

    private ListElement getElement(int index) {
        if (index < 0 || index > size - 1) {
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

    @Override
    public String toString() {

        ListElement currentElement = head;

        return toString("", currentElement);
    }

    private String toString(String outText, ListElement currentElement) {
        if (currentElement.nextElement == null) {
            //   System.out.println(currentElement.value.toString());
            return currentElement.value.toString() + ", ";
        } else {
            System.out.println(currentElement.value.toString());
            return outText + toString(outText, currentElement.nextElement);
        }
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
