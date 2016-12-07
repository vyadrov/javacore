package com.vyadrov.app.utils.homework.lesson9;

public class MaxValueInArray {
    public static int[][] maxValueInArray() {
        System.out.println("Multi-dimension array[5][8] is: ");
        System.out.println();
        int[][] array = new int[5][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*199-99);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
        int maxValue = array[0][0];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Max Value in this Array is: " + maxValue);
        return array;
    }
}
