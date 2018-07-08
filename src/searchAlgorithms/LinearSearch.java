package searchAlgorithms;

import java.util.Arrays;

public class LinearSearch {

    static int linearSearch(int[] array, int s){

        //wyszukanie elementu a nie indeksu
//       int searchValue =  Arrays.stream(array)  // opakowanie tablicy w stream
//               .filter(elem -> elem == s)       // wyszukaliśmy pasujące elementy (może być kilka
//               .findFirst()                     // bierzemy pierwszy element ze znalezionych
//               .orElseThrow(RuntimeException :: new);  // jeżeli nie znaleźliśmy wyrzucamy wyjątek
        int searchIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == s){
                searchIndex = i;
            }
        }
        return searchIndex;
    }
}
