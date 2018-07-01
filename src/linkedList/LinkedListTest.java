package linkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("Aktualny rozmiar: " + linkedList.getSize());
        System.out.println(" Head :" + linkedList.getHead());
        System.out.println(" Tail :" + linkedList.getTail());
        linkedList.add(10);
        System.out.println("dodałem 10");
        System.out.println(" Head :" + linkedList.getHead());
        System.out.println(" Tail :" + linkedList.getTail());
        linkedList.add(20);
        System.out.println("dodałem 20");
        System.out.println(" Head :" + linkedList.getHead());
        System.out.println(" Tail :" + linkedList.getTail());
        linkedList.add(30);
        System.out.println("dodałem 30");
        System.out.println(" Head :" + linkedList.getHead());
        System.out.println(" Tail :" + linkedList.getTail());
        System.out.println("Dodaję pod index 0 wartość 5: ");
        linkedList.add(0, 5);
        System.out.println("Aktualny rozmiar: " + linkedList.getSize());
        System.out.println("Dodaję pod index 4 wartość 35: ");
        System.out.println(" Head :" + linkedList.getHead());
        linkedList.add(3, 35);
        System.out.println(" Tail :" + linkedList.getTail());
        linkedList.remove(0);
        System.out.println("usuwam Head nowy Head to: " + linkedList.getHead());
        linkedList.remove(linkedList.getSize() - 1);
        System.out.println("usuwam Tail nowy Tail to: " + linkedList.getTail());
        System.out.println(" element :" + linkedList.get(2));
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println("Wartość w " + i + " wynosi: " + linkedList.get(i));
        }
        System.out.println("A teraz od ogona");
        for (int i = linkedList.getSize() - 1; i >= 0; i--) {
            System.out.println("Wartość w " + i + " wynosi: " + linkedList.get(i));
        }
        System.out.println(" Head :" + linkedList.getHead());
        System.out.println(" Tail :" + linkedList.getTail());
        System.out.println(linkedList);
    }
}
