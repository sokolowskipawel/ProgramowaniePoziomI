package stack;
// test klasy Stack
public class StackTest {

    public static void main(String[] args) {

        Stack<Integer> arrayStack = new ArrayStack<>(5);
        System.out.println("Is empty?: " + arrayStack.isEmpty());
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        System.out.println(arrayStack.peek());
        arrayStack.push(5);

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
    }
}
