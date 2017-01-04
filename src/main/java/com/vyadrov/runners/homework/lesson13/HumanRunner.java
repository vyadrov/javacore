package com.vyadrov.runners.homework.lesson13;

import com.vyadrov.app.utils.homework.lesson13.Human;

import java.util.Scanner;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human("John Doe", 1);
        System.out.println("Please enter human's age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        human.setAge(age);
    }
}
