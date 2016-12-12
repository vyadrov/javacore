package com.vyadrov.app.utils.classwork.lesson11;


import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        System.out.println("Enter your sentence:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(",");
        for (String str: splittedStringArray){
            System.out.print(str);
        }

    }
}
