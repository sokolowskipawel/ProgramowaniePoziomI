package stack;
// test klasy Stack
public class StackTest {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack(5);
        System.out.println("Is empty?: " + stack.isEmpty());
        stack.push(1);
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Is empty?: " + stack.isEmpty());
        stack.push(2);
        System.out.println("Stack top: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack top: " + stack.peek());
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.peek());
        stack.push(7);
        stack.push(8);
        System.out.println(stack.peek());
    }
}
