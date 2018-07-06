package queue;

public class LinkedQueueTest {

    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<Integer>();

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

        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        System.out.println("Kolejka priorytetowa");
        System.out.println(priorityQueue.isEmpty());
        System.out.println(priorityQueue);
        priorityQueue.push("1",10);
        System.out.println(priorityQueue.isEmpty());
        System.out.println(priorityQueue);
      //  System.out.println("do pobrania " + priorityQueue.front());
        priorityQueue.push("2",10);
        priorityQueue.push("3",10);
        priorityQueue.push("4",10);
//        System.out.println(priorityQueue);
      //  System.out.println("do pobrania " + priorityQueue.front());
    }
}
