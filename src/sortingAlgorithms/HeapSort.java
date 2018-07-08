package sortingAlgorithms;

import tree.Heap;

public class HeapSort {

    // dzięki static mam dostęp do metody bez tworzenia obiektu
    public static int[] sort(int[] tab) {

        Heap tree = new Heap(tab.length);

        for (int i = 0; i < tab.length; i++) {
            tree.add(tab[i]);
        }
        int[] sorted = new int[tab.length];
        for (int i = sorted.length - 1; i >= 0; i--) {
            sorted[i] = tree.remove2();
        }
        return sorted;
    }

}
