package tree;

public class TreeTest {
    public static void main(String[] args) {
        Node a = new Node("A", null, null);
        Node c = new Node("C", null, null);
        Node e = new Node("E", null, null);
        Node h = new Node("H", null, null);
        Node d = new Node("D", c, e);
        Node b = new Node("B", a, d);
        Node i = new Node("I", h, null);
        Node g = new Node("G", null, i);
        Node root = new Node("F", b, g);

        BinaryTree tree = new BinaryTree(root);

        System.out.println("Wykorzystanie typu Enum");
        tree.showTree(DfsType.PRE_ORDER);
        tree.showTree(DfsType.IN_ORDER);
        tree.showTree(DfsType.POST_ORDER);
        System.out.println("Tradycyjnie");
        System.out.println("\nPre-order");
        tree.showTreePreOrder(root);
        System.out.println("\nIn-order");
        tree.showTreeInOrder(root);
        System.out.println("\nPost-order");
        tree.showTreePostOrder(root);
    }
}
