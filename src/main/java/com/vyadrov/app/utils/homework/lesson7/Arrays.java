package com.vyadrov.app.utils.homework.lesson7;

import java.util.Random;

public class Arrays {
    public static void arrayHorizontalVertical() {
        int[] a = new int[10];
        int i = 0;
        int b = 0;
        for (i=0; i<10; i++) {
            b=b+2;
            a[i] = b;
        }
        for (i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        for (i = 1; i < 10; i++)
            System.out.println(a[i]);

    }
    public static void oddNumbersArray() {
        int a = 0;
        for (int i = 0; i<=99; i++) {
            if (i % 2 != 0) {
                a++;
            }
        }
        int[] array = new int[a];
        for (int i = 0, b = 0; i<=99; i++) {
            if (i % 2 != 0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println();
        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    public static void randomArray() {
        Random random = new Random();
        int[] array = new int[15];
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] != 0 && array[i] % 2 == 0) {
                b++;
            }
        }
        System.out.println();
        System.out.println("The number of even numbers in an array: " + b);
    }
    public static void minMaxElementsInArray() {
        Random random = new Random();
        int[] array = new int[15];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.print(array[i] + " ");
            if (max < array[i])max = array[i];
        }
        System.out.println();
        System.out.println("Maximum value in Array is:" + max);
    }

}
