package queue;

public class LinkedQueueTest {

    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();

        System.out.println(linkedQueue.isEmpty());
        System.out.println(linkedQueue);
        linkedQueue.push(1);
        linkedQueue.push(2);
        linkedQueue.push(3);
        System.out.println(linkedQueue);
        System.out.println("Gotowy do pobrania: " + linkedQueue.front());
        System.out.println("Pobrałem: " + linkedQueue.pop());
        System.out.println("Gotowy do pobrania: " + linkedQueue.front());
        System.out.println("Pobrałem: " + linkedQueue.pop());
        System.out.println("Gotowy do pobrania: " + linkedQueue.front());
        System.out.println("Pobrałem: " + linkedQueue.pop());
        linkedQueue.push(4);
        System.out.println("Gotowy do pobrania: " + linkedQueue.front());
        linkedQueue.push(5);
        System.out.println("Gotowy do pobrania: " + linkedQueue.front());
        System.out.println("Pobrałem: " + linkedQueue.pop());
        System.out.println("Gotowy do pobrania: " + linkedQueue.front());
    }
}
