package searchAlgorithms;

import java.util.Optional;

public class BinarySearch {

    public static Optional<Integer> search(int[] array, int toSearch) {

        Optional<Integer> score = binarySearch(array, toSearch, 0, array.length - 1);

        return score;
    }

    private static Optional<Integer> binarySearch(int[] array, int toSearch, int left, int right) {

        int pivot = (left + right) / 2;

        if (left <= right) {
            if (array[pivot] == toSearch) {
                return Optional.of(pivot);
            } else if (toSearch < array[pivot]) {
                return binarySearch(array, toSearch, left, pivot - 1);

            } else {
                return binarySearch(array, toSearch, pivot + 1, right);
            }
        }
        return Optional.empty();    //gdy nie znaleziono elementu
    }
}
