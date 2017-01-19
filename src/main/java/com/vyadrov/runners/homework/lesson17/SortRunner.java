package com.vyadrov.runners.homework.lesson17;
import com.vyadrov.app.utils.homework.lesson17.ArraySorterGenerics1;

import java.util.Arrays;

public class SortRunner {
    public static void main(String[] args) {
        Double[] array1 = {3.2, -96.56, 1.025, -26.0, 74.1};
        Integer[] array2 = {11, 2, 53, 6};
        ArraySorterGenerics1 arraySorterGenerics1 = new ArraySorterGenerics1<>(array1);
        arraySorterGenerics1.getArray();
        arraySorterGenerics1.unStaticSort();

        ArraySorterGenerics1.staticSort(array1);
    }
}
