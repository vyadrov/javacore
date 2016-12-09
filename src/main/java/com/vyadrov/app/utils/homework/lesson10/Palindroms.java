package com.vyadrov.app.utils.homework.lesson10;

import java.util.Scanner;

public class Palindroms {
    public static void palindromeFirstMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your word:");
        String word = scanner.nextLine();
        String reverse = "";
        for (int i = word.length() -1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (reverse.equalsIgnoreCase(word)) {
            System.out.println("Your world is Palindrome");
        } else {
            System.out.println("Your world is NOT Palindrome");
        }
    }
    public static void palindromeSecondMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your word:");
        String word = scanner.nextLine();
        StringBuffer buffer = new StringBuffer(word);
        buffer.reverse();
        buffer.toString();
        if (buffer.toString().equals(word) == true) {
            System.out.println("Your world is Palindrome");
        } else {
            System.out.println("Your world is NOT Palindrome");
        }
    }
    public static boolean palindromeThirdMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your word:");
        String word = scanner.nextLine();
        for (int i = 0, j = word.length() - 1; i <= j; i++, j--) {
            if (word.charAt(i) == word.charAt(j)) {
                System.out.println("Your world is Palindrome");
                return true;
            }
        }
        System.out.println("Your world is NOT Palindrome");
        return false;
    }
}
