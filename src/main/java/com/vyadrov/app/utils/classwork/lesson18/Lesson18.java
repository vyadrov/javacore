package com.vyadrov.app.utils.classwork.lesson18;

import java.util.*;

public class Lesson18 {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>();
        HashSet hs = new HashSet();
        Map m1 = new HashMap();
        System.out.println("Enter your words: ");
        Scanner scanner = new Scanner(System.in);
        String inputword1 = scanner.nextLine();
        hs.add(inputword1);
        String inputword2 = scanner.nextLine();
        hs.add(inputword2);
        String inputword3 = scanner.nextLine();
        hs.add(inputword3);

        System.out.println(hs);
    }



}
