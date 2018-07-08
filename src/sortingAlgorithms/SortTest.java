package sortingAlgorithms;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {
        int[] tab = new int[]{1, 5, 8, 2, 3, 10, 112};
        BubbleSort bubbleSort = new BubbleSort(tab);

        //   bubbleSort.sort();
        //    tab = bubbleSort.sort();
        // HeapSort. heapSort = new HeapSort();

     //   int[] sorted = HeapSort.sort(tab);

        int[] quicksorted = Sorter.quikSort(tab);
       // System.out.println(Arrays.toString(Arrays.copyOfRange(sorted, 0, sorted.length)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(quicksorted, 0, quicksorted.length)));
    }
}
