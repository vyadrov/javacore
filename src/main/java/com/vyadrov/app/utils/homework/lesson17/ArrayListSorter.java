package com.vyadrov.app.utils.homework.lesson17;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayListSorter {
    public static void main(String[] args) {
        System.out.println("Please, enter any words: ");
        TreeSet<String> words = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            input = scanner.nextLine();
            words.add(input);
        } while (input.length() != 0);
        System.out.print("You entered this unique words (Without Dublicates!):");
        for(String elements: words) {
            System.out.println(elements);
        }
    }
}
