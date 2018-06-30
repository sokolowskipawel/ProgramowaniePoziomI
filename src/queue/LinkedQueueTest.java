package queue;

public class LinkedQueueTest {

    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();

        System.out.println(linkedQueue.isEmpty());
        linkedQueue.push(1);
        linkedQueue.push(2);
        linkedQueue.push(3);
        System.out.println(linkedQueue.front());
        linkedQueue.pop();
        System.out.println(linkedQueue.front());
        linkedQueue.pop();
        System.out.println(linkedQueue.front());
        linkedQueue.pop();
        linkedQueue.push(4);
        System.out.println(linkedQueue.front());
        linkedQueue.push(5);
        System.out.println(linkedQueue.front());
        System.out.println(linkedQueue.isEmpty());
        linkedQueue.pop();
        System.out.println(linkedQueue.front());
    }
}
