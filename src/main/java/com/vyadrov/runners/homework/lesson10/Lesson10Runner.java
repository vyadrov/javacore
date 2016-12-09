package com.vyadrov.runners.homework.lesson10;

import com.vyadrov.app.utils.homework.lesson10.Palindroms;

import java.util.Scanner;

public class Lesson10Runner {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Hi! Please, enter the number of Method which will determine String is palindrome OR Not: " + "\n" +
                    "1. First Method." + "\n" +
                    "2. Second Method." + "\n" +
                    "3. Third Method." + "\n" +
                    "0. Exit.\n");
            Scanner scanner = new Scanner(System.in);
            int numberOfTask = scanner.nextInt();
            switch (numberOfTask) {
                case 1:
                    Palindroms.palindromeFirstMethod();
                    break;
                case 2:
                    Palindroms.palindromeSecondMethod();
                    break;
                case 3:
                    Palindroms.palindromeThirdMethod();
                    break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number !=0);
    }
}
