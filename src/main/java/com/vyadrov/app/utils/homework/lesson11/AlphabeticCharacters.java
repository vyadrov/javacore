package com.vyadrov.app.utils.homework.lesson11;

import java.util.Scanner;

public class AlphabeticCharacters {
    public static void alphabeticCharactersExtract() {
        System.out.println("Please, enter symbol which will be a spliter:");
        Scanner scanner1 = new Scanner(System.in);
        String inputSpliter = scanner1.nextLine();
        System.out.println("Enter your symbols:");
        Scanner scanner2 = new Scanner(System.in);
        String inputString = scanner2.nextLine();
        String[] splittedStringArray = inputString.split(inputSpliter);
        char[] charArray = new char[splittedStringArray.length];
        for (int i = 0; i < splittedStringArray.length; i++) {
            for(int k = 0; k < splittedStringArray[i].length(); k++) {
                charArray[i] = splittedStringArray[i].charAt(k);

                if ((charArray[i] > 64 && charArray[i] < 91) || (charArray[i] > 96 && charArray[i] < 123)) {

                    System.out.print(charArray[i]);
                }
            }
            System.out.print(", ");
        }
    }
}
