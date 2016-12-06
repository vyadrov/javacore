package com.vyadrov.app.utils.homework.lesson9;

public class ArrayPrint {
    ArrayGenerating arrayGenerating = new ArrayGenerating();
    public static void bubbleOutMinToMax(int[] arr) {
        //arr = Sorting.bubbleSortingMinToMax(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //arr = Sorting.bubbleSortingMaxToMin(arr);


    }
    public static void bubbleOutMaxToMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
