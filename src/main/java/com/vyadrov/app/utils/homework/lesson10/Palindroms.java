package com.vyadrov.app.utils.homework.lesson10;

public class Palindroms {
    public static void palindromeByCharAt(String word) {
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
    public static boolean palindromeByReverse(String word) {
        StringBuffer buffer = new StringBuffer(word);
        buffer.reverse();
        if (buffer.toString().equals(word)) {
            System.out.println("Your world is Palindrome");
            return true;
        } else {
            System.out.println("Your world is NOT Palindrome");
            return false;
        }
    }
    public static boolean palindromeByCheckingFromStartToEnd(String word) {
        if (word.length() == 1) {
            System.out.println("Your world is Palindrome");
            return true;
        }
        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
            if (word.charAt(i) == word.charAt(j)) {
                System.out.println("Your world is Palindrome");
                return true;
            }
        }
        System.out.println("Your world is NOT Palindrome");
        return false;
    }
}
