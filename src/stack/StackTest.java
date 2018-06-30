package stack;
// test klasy Stack
public class StackTest {

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>(5);
        System.out.println("Is empty?: " + stack.isEmpty());
        stack.push(1);

        stack.push(2);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);

    }
}
