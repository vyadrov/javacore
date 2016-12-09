package com.vyadrov.app.utils.homework.lesson10;

import java.util.Scanner;

public class Palindroms {
    public static void polindromByLoopFor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your word:");
        String word = scanner.nextLine();
        String reverse = "";
        for (int i = word.length() -1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (reverse.equalsIgnoreCase(word)) {
            System.out.println("Your world is Polindrome");
        } else {
            System.out.println("Your world is NOT Polindrome");
        }
    }
    public static void polindromBoolean() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your word:");
        String word = scanner.nextLine();
        StringBuffer buffer = new StringBuffer(word);
        buffer.reverse();
        System.out.println(buffer.toString().equals(word));
    }
}
