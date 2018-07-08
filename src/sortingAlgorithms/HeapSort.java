package sortingAlgorithms;

import tree.Heap;

import java.util.Arrays;

public class HeapSort {

    // dzięki static mam dostęp do metody bez tworzenia obiektu
    public static int[] sort(int[] tab) {

        Heap heap = new Heap(tab.length);

//        for (int i = 0; i < tab.length; i++) {
//            tree.add(tab[i]);
//        }
        Arrays.stream(tab).forEach(heap::add);
        int[] sortedTab = new int[tab.length];
        for (int i = sortedTab.length - 1; i >= 0; i--) {
            sortedTab[i] = heap.remove2();
        }
        return sortedTab;
    }

}
