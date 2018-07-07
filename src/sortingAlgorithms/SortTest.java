package sortingAlgorithms;

public class SortTest {

    public static void main(String[] args) {
        int[] tab = new int[]{5, 8, 2, 3, 10};
        BubbleSort bubbleSort = new BubbleSort(tab);

     //   bubbleSort.sort();
        tab = bubbleSort.sort();

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
    }
}
