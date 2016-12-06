package com.vyadrov.app.utils.homework.lesson9;

public class ArrayPrint {
    Sorting sorting = new Sorting();
    public static void bubbleOutMinToMax() {
        System.out.println("Array before sorting:");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arr = Sorting.bubbleSortingMinToMax(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arr = Sorting.bubbleSortingMaxToMin(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
