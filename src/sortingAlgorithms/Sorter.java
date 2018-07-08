package sortingAlgorithms;

public class Sorter {

    static int[] quikSort(int[] array){

        return quickSort(array, 0, array.length - 1);
    }

    private static int[] quickSort(int[] array, int left, int right){

        int pivot = array[(left + right) / 2];
        int p = left;
        int q = right;
        while (p <= q){
            while (array[p] < pivot){
                p ++;
            }
            while (array[q] > pivot){
                q --;
            }
            if (p <=q){
                int temp = array[p];
                array[p] = array[q];
                array[q] = temp;
                p ++;
                q --;
            }
        }

    }
}
