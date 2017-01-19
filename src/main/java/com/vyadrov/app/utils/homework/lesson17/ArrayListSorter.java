package com.vyadrov.app.utils.homework.lesson17;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayListSorter {
    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Please, enter states which you know: ");
        do {
            states.add(input);
            //System.out.println(states);
        } while (input.length() != 0);
        System.out.println(states);


        /*for(String elements: states) {
            System.out.println(elements);
        }*/

    }
}
