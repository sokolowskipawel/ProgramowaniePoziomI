package sortingAlgorithms;

public class Sorter {

    static int[] quikSort(int[] array) {

        return quickSort(array, 0, array.length - 1);
    }

    private static int[] quickSort(int[] array, int left, int right) {

        int index = partition(array, left, right);
        //sprawdzamy czy jest więcej niż jeden element w tablicy po lewej
        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        //sprawdzamy czy jest więcej niż jeden element w tablicy po prawej
        if(index < right){
            quickSort(array,index, right);
        }
        return array;
    }

    // dzieli tablicę na mniejsze elementy na lewo a większe na prawo
    private static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];
        int p = left;
        int q = right;
        while (p <= q) {
            while (array[p] < pivot) {
                p++;
            }
            while (array[q] > pivot) {
                q--;
            }
            if (p <= q) {
                int temp = array[p];
                array[p] = array[q];
                array[q] = temp;
                p++;
                q--;
            }
        }
        return p;
    }
}
