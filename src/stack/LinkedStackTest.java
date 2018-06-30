package stack;

public class LinkedStackTest {
    public static void main(String[] args) {

        Stack<String> linkedStack = new LinkedStack<String>();

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

        Stack<Integer> stack = new ArrayStack<>(5);
        System.out.println("Is empty?: " + stack.isEmpty());
        stack.push(1);

        stack.push(2);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);
    }
}
