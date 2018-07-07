package tree;

public class BinaryTree {

    private Node root;

    BinaryTree(Node node) {
        this.root = node;
    }

    void showTree(DfsType dfsType) {
        System.out.print(dfsType.name() + ": ");
        dfsType.showTree(root);
        System.out.println();
    }

    private void visitNode(Node node) {
        System.out.print(node.getValue() + " ");
    }

    public void showTreePreOrder(Node node) {
        if (node != null) {
            visitNode(node);
            showTreePreOrder(node.getLeftChild());
            showTreePreOrder(node.getRightChild());
        }
    }

    public void showTreeInOrder(Node node) {
        if (node != null) {
            showTreeInOrder(node.getLeftChild());
            visitNode(node);
            showTreeInOrder(node.getRightChild());
        }
    }

    public void showTreePostOrder(Node node) {
        if (node != null) {
            showTreePostOrder(node.getLeftChild());
            showTreePostOrder(node.getRightChild());
            visitNode(node);
        }
    }
}
