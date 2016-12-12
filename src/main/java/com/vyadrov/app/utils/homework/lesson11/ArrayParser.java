package com.vyadrov.app.utils.homework.lesson11;

import com.vyadrov.app.utils.homework.lesson9.ArrayPrint;
import com.vyadrov.app.utils.homework.lesson9.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayParser {
    public static void arrayParserSorter() {
        System.out.println("Enter your array:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(";");
        int[] intArray = new int[splittedStringArray.length];
        for (int i = 0; i < splittedStringArray.length; i++) {
            intArray[i] = Integer.parseInt(splittedStringArray[i].trim());
        }
        System.out.println("Created array is:" + Arrays.toString(intArray));
        System.out.println("How do you want to sort your array?" + "\n" +
                "1. From Min to Max" + "\n" +
                "2. From Max to Min" + "\n");
        int numberOfSort = scanner.nextInt();
        if (numberOfSort == 1) {
            Sorting.selectionSortMinToMax(intArray);
            ArrayPrint.selectionOutMinToMax(intArray);
        } else if (numberOfSort == 2) {
            Sorting.selectionSortMaxToMin(intArray);
            ArrayPrint.selectionOutMaxToMin(intArray);
        }

    }
}
