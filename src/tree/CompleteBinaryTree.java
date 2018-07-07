package tree;

import java.util.Arrays;

public class CompleteBinaryTree<T> {

    private T[] tree;
    private int lastIndex;

    public CompleteBinaryTree(int size) {
        this.tree = (T[]) new Object [size];
        this.lastIndex = 0;
    }

    void add(T value) {
        tree[lastIndex++] = value;
    }

    T getLeftChild(int index) {
        return tree[getLeftChildIndex(index)];
    }

    T getRightChild(int index) {
        return tree[getRightChildIndex(index)];
    }

    int getLeftChildIndex(int index) {
        if (isLeftChild(index)) {
            return 2 * index + 1;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isLeftChild(int index) {
        return (2 * index + 1) < lastIndex;
    }

    int getRightChildIndex(int index) {
        if (isRightChild(index)) {
            return 2 * index + 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isRightChild(int index) {
        return (2 * index + 2) < lastIndex;
    }

    int getParent(int index) {
        if (index != 0) {
            return (index - 1) / 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    boolean isLeaf(int index) {
        return !isLeftChild(index);
    }

    @Override
    public String toString() {
        return Arrays.toString(tree);
    }
}
