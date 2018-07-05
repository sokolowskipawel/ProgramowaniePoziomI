package tree;

public class BinaryTree {

    private Node root;

    public BinaryTree(String valu) {
        this.root = new Node(valu);
    }

    private class Node{
        String valu;
        Node leftChild;
        Node rightChild;

        public Node(String valu) {
            this.valu = valu;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
}
