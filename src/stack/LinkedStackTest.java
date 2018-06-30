package stack;

public class LinkedStackTest {
    public static void main(String[] args) {

        LinkedStack<String> linkedStack = new LinkedStack<String>();

        System.out.println(linkedStack.isEmpty());
        linkedStack.push("Java");
        System.out.println(linkedStack.peek());
        linkedStack.push("Program");
        System.out.println(linkedStack.peek());
        linkedStack.push("koniec");
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
