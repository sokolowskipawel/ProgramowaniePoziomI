package stack;

public class LinkedStackTest {
    public static void main(String[] args) {

        LinkedStack linkedStack = new LinkedStack();

        System.out.println(linkedStack.isEmpty());
        linkedStack.push(10);
        System.out.println(linkedStack.peek());
        linkedStack.push(20);
        System.out.println(linkedStack.peek());
        linkedStack.push(30);
        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.isEmpty());
        linkedStack.pop();
        System.out.println(linkedStack.peek());
        linkedStack.pop();
        System.out.println(linkedStack.peek());
        linkedStack.pop();
        System.out.println(linkedStack.isEmpty());
    }
}
