package com.vyadrov.runners.homework.lesson7;

import com.vyadrov.app.utils.homework.lesson7.Arrays;

import java.util.Scanner;

public class LoopsArraysRunner {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Which task do you want to solve? Please choose number: \n" + "\t" + "Press 1 if you want to see even numbers of an array[2-20] horizontal and vertical. \n" + "\t" + "Press 2 if you want to see Odd numbers of an array[1-99]. \n" + "\t" + "Press 3 if you want to see Random numbers of an array[0-9]. \n" + "\t" + "Press 4 if you want to see min & max numbers of an array[0-999]. \n" + "\t" + "Press 5 if you want to see multi-dimension array[8][5]. \n" + "\t" + "Press 6 if you want to see right side format of a multi-dimension array[8][5]. \n" + "\t" + "Press 7 if you want to calculate sum of entered numbers. \n" + "\t" + "Press 0 if you want to EXIT.");

            Scanner sc1 = new Scanner(System.in);
            int inputNumber = sc1.nextInt();
            if (inputNumber == 1) {
                Arrays.arrayHorizontalVertical();
            } else if (inputNumber == 2) {
                Arrays.oddNumbersArray();
            } else if (inputNumber == 3) {
                Arrays.randomArray();
            } else if (inputNumber == 4) {
                Arrays.minMaxElementsInArray();
            } else if (inputNumber == 5) {
                Arrays.multidimensionalArray();
            } else if (inputNumber == 6) {
                Arrays.rightSideFormatArray();
            } else if (inputNumber == 7) {
                Arrays.addElements();
            } else if (inputNumber == 0) {
                System.out.println(" Good Day! Bye!");
            } else {
                System.out.println("You entered wrong number. Try again");
            }
            number = inputNumber;
        } while (number != 0);
    }
}
