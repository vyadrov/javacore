package com.vyadrov.app.utils.homework.lesson9;
public class Sorting {
    public static int[] bubbleSortingMinToMax(int[] array) {
        //int[] arr = array.clone();
        System.out.println("Array after Buuble-Sorting from Min value to Max:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] bubbleSortingMaxToMin(int[] array) {
        System.out.println("Array after Buuble-Sorting from Max value to Min:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
