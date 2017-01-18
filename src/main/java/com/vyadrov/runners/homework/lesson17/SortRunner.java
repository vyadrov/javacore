package com.vyadrov.runners.homework.lesson17;

import com.vyadrov.app.utils.homework.lesson17.ArraySorterGenerics1;

public class SortRunner {
    public static void main(String[] args) {
        Integer[] array = {11, 2, 53, 6};
        ArraySorterGenerics1<Number> arraySorterGenerics1 = new ArraySorterGenerics1<>(array);
        //System.out.println(Arrays.toString(arraySorterGenerics1.sort(array)));
        arraySorterGenerics1.sort(array);
    }
}
