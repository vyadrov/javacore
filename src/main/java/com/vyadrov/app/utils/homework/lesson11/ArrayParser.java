package com.vyadrov.app.utils.homework.lesson11;

import java.util.Scanner;

public class ArrayParser {
    public static void arrayParserSorter() {
        System.out.println("Enter your array:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(";");
        System.out.println("How do you want to sort your array&" + "\n" +
                "1. From Min to Max" + "\n" +
                "2. From Max to Min" + "\n");
        int numberOfSort = scanner.nextInt();
        if (numberOfSort == 1) {
            for (int i = 0; i < splittedStringArray.length; i++) {
                for (int j = i + 1; j < splittedStringArray.length; j++) {
                    if (splittedStringArray[j] < splittedStringArray[i]) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(splittedStringArray));
    }
}
