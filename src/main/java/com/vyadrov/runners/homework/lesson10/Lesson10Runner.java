package com.vyadrov.runners.homework.lesson10;

import com.vyadrov.app.utils.homework.lesson10.Palindroms;

import java.util.Scanner;

public class Lesson10Runner {
    public static void runnerPalindromeFirstMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your word:");
        String word = scanner.nextLine();
        Palindroms.palindromeByCharAt(word);
    }
    public static void runnerPalindromeSecondMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your word:");
        String word = scanner.nextLine();
        Palindroms.palindromeByReverse(word);
    }
    public static void runnerPalindromeThirdMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your word:");
        String word = scanner.nextLine();
        Palindroms.palindromeByCheckingFromStartToEnd(word);
    }
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
                    runnerPalindromeFirstMethod();
                    break;
                case 2:
                    runnerPalindromeSecondMethod();
                    break;
                case 3:
                    runnerPalindromeThirdMethod();
                    break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number !=0);
    }
}
