package com.vyadrov.app.utils.homework.lesson9;

public class ArrayGenerating {
    public static int[] arrayGenerating() {
        System.out.println("Array before sorting:");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }


}
