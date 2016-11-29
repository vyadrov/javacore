package com.vyadrov.app.utils.homework.lesson7;

import java.util.Random;

public class Arrays {
    public static void arrayHorizontalVertical() {
<<<<<<< HEAD
        /*int a = 0;
=======
<<<<<<< HEAD
        int[] array = new int[10];
=======
        int a = 0;
>>>>>>> 0e260a3a0dc834bd5dac2ab21cd82f7ce90f3d8f
        for (int i = 2; i <=20; i++) {
            if (i%2==0) {
                a++;
            }
<<<<<<< HEAD
        }*/
        int[] array = new int[10];
=======
        }
        int[] array = new int[a];
>>>>>>> d853df1d277cf12764b97d72306ee7dd3cb304a1
>>>>>>> 0e260a3a0dc834bd5dac2ab21cd82f7ce90f3d8f
        for (int i = 2, b = 0; i <=20 ; i++) {
            if (i%2==0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
<<<<<<< HEAD
=======

>>>>>>> d853df1d277cf12764b97d72306ee7dd3cb304a1
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
    public static void oddNumbersArray() {
        int a = 0;
        for (int i = 0; i <= 99; i++) {
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

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int min = array[0];
            for (int i = 0; i < array.length ; i++) {
                if (max < array[i]){
                    max = array[i];
                }
                else if (min > array[i]) {
                    min = array[i];
                }
            }



        System.out.println();
        System.out.println("Maximum value in Array is:" + max + "\n" +"Minimum value in Array is:" + min);
    }
    public static void multidimensionalArray() {
        int[][] array = new int[8][5];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*90 + 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void rightSideFormatArray() {
        int[][] array = new int[8][5];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*999 + 1);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

}
