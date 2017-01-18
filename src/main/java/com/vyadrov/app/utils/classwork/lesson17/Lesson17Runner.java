package com.vyadrov.app.utils.classwork.lesson17;

import java.util.Arrays;

public class Lesson17Runner {
    public static void main(String[] args) {
        Integer[] array = {12, 52, 36, 8};
        ArraySorterGenerics<Integer> arraySorterGenerics = new ArraySorterGenerics<>();
        arraySorterGenerics.bubbleSortingMaxToMin(array);
        System.out.println(Arrays.toString(arraySorterGenerics.bubbleSortingMaxToMin(array)));
    }
}
