package tree;

import java.util.Arrays;

public class Heap {

    private Integer[] tree;
    private int lastIndex; // index gdzie wstawiamy nowy element

    public Heap(int size) {
        this.tree = new Integer[size];
        this.lastIndex = 0;
    }

    public void add(Integer value) {
        tree[lastIndex] = value;
        int index = lastIndex++; //najpierw przypisze lastIndex a następnie zwiększy LastIndex
        while (index > 0 && tree[getParentIndex(index)] < tree[index]) {
            tree[index] = tree[getParentIndex(index)];
            tree[getParentIndex(index)] = value;
            index = getParentIndex(index);
        }
    }

    public int remove() {
        if (!hasNodes()) {
            throw new IndexOutOfBoundsException();
        }
        int elementToRemove = tree[0];
        int currenIndex = 0;
        int greatChildIndex = getGreaterChildIndex(0);
        int lastValue = tree[--lastIndex];

        while (greatChildIndex < lastIndex && tree[greatChildIndex] > lastValue) {
            tree[currenIndex] = tree[greatChildIndex];
            currenIndex = greatChildIndex;
            greatChildIndex = getGreaterChildIndex(currenIndex);
        }
        tree[currenIndex] = lastValue;
        return elementToRemove;
    }

    public int remove2() {
        int root;
        if (tree[0] == null) {
            throw new IndexOutOfBoundsException();
        }
        root = tree[0];
        if (lastIndex > 0) {
            tree[0] = tree[--lastIndex];
            tree[lastIndex] = null;

            int index = 0;
            while (isLeftChild(index)) {

                int biggerChildIndex = getLeftChildIndex(index);

                if (isRightChild(index)) {
                    if (getLeftChild(index) < getRightChild(index)) {
                        biggerChildIndex = getRightChildIndex(index);
                    }
                }
                if (tree[index] < tree[biggerChildIndex]) {
                    int current = tree[index];
                    tree[index] = tree[biggerChildIndex];
                    tree[biggerChildIndex] = current;
                }
                index = biggerChildIndex;
            }
        } else {
            tree[0] = null;
        }

        return root;
    }

    public int getGreaterChildIndex(int index) {
        if (isRightChild(index)) {
            return getLeftChild(index) > getRightChild(index) ? getLeftChildIndex(index) : getRightChildIndex(index);
        } else if (isLeftChild(index)) {
            return getLeftChildIndex(index);
        } else {
            return lastIndex + 1;
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


    public boolean hasNodes() {
        return lastIndex > 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(tree, 0, lastIndex));
    }
}
