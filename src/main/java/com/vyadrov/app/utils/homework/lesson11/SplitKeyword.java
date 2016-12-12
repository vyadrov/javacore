package com.vyadrov.app.utils.homework.lesson11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Виталий on 12.12.2016.
 */
public class SplitKeyword {
    public static void spliKeyword() {
        System.out.println("Please, enter symbol which will be a spliter:");
        Scanner scanner1 = new Scanner(System.in);
        String inputSpliter = scanner1.nextLine();
        System.out.println("Enter your string:");
        Scanner scanner2 = new Scanner(System.in);
        String inputString = scanner2.nextLine();
        String[] splittedStringArray = inputString.split(inputSpliter);
        System.out.println(Arrays.toString(splittedStringArray));

    }
}
