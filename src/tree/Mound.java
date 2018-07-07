package tree;

import java.util.Arrays;

public class Mound {

    private Integer[] tree;
    private int lastIndex;

    public Mound(int size) {
        this.tree = new Integer[size];
        this.lastIndex = 0;
    }

    void add(Integer value) {
        tree[lastIndex] = value;
        int index = lastIndex ++; //najpierw przypisze lastIndex a następnie zwiększy LastIndex
        while (index > 0 && tree[getParentIndex(index)] < tree[index]) {
                tree[index] = tree[getParentIndex(index)];
                tree[getParentIndex(index)] = value;
                index = getParentIndex(index);
        }
    }

    Integer getLeftChild(int index) {
        return tree[getLeftChildIndex(index)];
    }

    Integer getRightChild(int index) {
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

    int getParentIndex(int index) {
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
