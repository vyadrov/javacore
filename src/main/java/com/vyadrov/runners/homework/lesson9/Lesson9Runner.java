package com.vyadrov.runners.homework.lesson9;

import com.vyadrov.app.utils.homework.lesson9.ArrayGenerating;
import com.vyadrov.app.utils.homework.lesson9.ArrayPrint;
import com.vyadrov.app.utils.homework.lesson9.MaxValueInArray;
import com.vyadrov.app.utils.homework.lesson9.Sorting;

import java.util.Scanner;

public class Lesson9Runner {
    public static void main(String[] args) {
<<<<<<< HEAD

=======
        int number;
        do {
            System.out.println("\n\nPlease, enter the number of the task to execute: " + "\n" +
                    "1. Bubble sort of the array. " + "\n" +
                    "2. Selection sort of the array." + "\n" +
                    "3. Maximum element of the multi-dimension array[5][8]." + "\n" +
                    "4. Multiplication table [2..9]" + "\n" +
                    "0. Exit.\n");
            Scanner scanner = new Scanner(System.in);
            int numberOfTask = scanner.nextInt();
            switch (numberOfTask) {
                case 1:
                    int[] array1 = ArrayGenerating.arrayGenerating();
                    int[] toMax = Sorting.bubbleSortingMinToMax(array1);
                    ArrayPrint.bubbleOutMinToMax(toMax);
                    int[] toMin = Sorting.bubbleSortingMaxToMin(array1);
                    ArrayPrint.bubbleOutMaxToMin(toMin);
                    break;
                case 2:
                    int[] array2 = ArrayGenerating.arrayGenerating();
                    int[] toMax2 = Sorting.selectionSortMinToMax(array2);
                    ArrayPrint.selectionOutMinToMax(toMax2);
                    int [] toMin2 = Sorting.selectionSortMaxToMin(array2);
                    ArrayPrint.selectionOutMaxToMin(toMin2);
                    break;
                case 3: MaxValueInArray.maxValueInArray();
                    break;
                /*case 4:
                    MultiplyTab.multiplyTabArray();*//*
                    break;*/
                case 0: break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number != 0);
>>>>>>> 0332d500ed107ee92db9d288ad9e62974826ba5d
    }
}
