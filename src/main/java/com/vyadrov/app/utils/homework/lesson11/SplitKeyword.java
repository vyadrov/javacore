package com.vyadrov.app.utils.homework.lesson11;

import java.util.Arrays;
import java.util.Scanner;


public class SplitKeyword {
    public static void spliKeyword() {
        System.out.println("Please, enter KEYWORD which will be a spliter:");
        Scanner scanner1 = new Scanner(System.in);
        String keywordInputSpliter = scanner1.nextLine();
        System.out.println("Enter your string:");
        Scanner scanner2 = new Scanner(System.in);
        String inputString = scanner2.nextLine();
        String[] splittedStringArray = inputString.split(keywordInputSpliter);
        for (int i = 0; i < splittedStringArray.length; i++) {
            System.out.println(splittedStringArray[i].trim());
        }
    }
}
