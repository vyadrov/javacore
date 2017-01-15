package com.vyadrov.runners.homework.lesson10;

import com.vyadrov.app.utils.homework.lesson10.Palindroms;

import java.util.Scanner;

public enum  Lesson10Runner { ONE, TWO, THREE, ZERO;
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
        try {
            System.out.println("Hi! Please, enter the number of Method by word (NOT NUMBER) which will determine String is palindrome OR Not: " + "\n" +
                    "ONE. First Method." + "\n" +
                    "TWO. Second Method." + "\n" +
                    "THREE. Third Method." + "\n" +
                    "ZERO. Exit.\n");
            Scanner scanner = new Scanner(System.in);
            String numberOfTask = scanner.nextLine();
            //String name = "One";
            Lesson10Runner lesson10Runner = Lesson10Runner.valueOf(numberOfTask);
            switch (lesson10Runner) {
                case ONE:
                    runnerPalindromeFirstMethod();
                    break;
                /*case 2:
                    runnerPalindromeSecondMethod();
                    break;
                case 3:
                    runnerPalindromeThirdMethod();
                    break;*/
                default:
                    System.out.println("You have made incorrect choice.");
            } //number = numberOfTask;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        }
    }
}
