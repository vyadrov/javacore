package com.vyadrov.lessons.Lesson_5;

import java.util.Scanner;

public class CircleRadius {

    public static void calculate() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius");
        double radius = scanner.nextDouble();
        System.out.println("Please enter pi value");
        double pi = scanner.nextDouble();
        double circleArea = pi * radius * radius;
        System.out.println("Area is " + circleArea);
    }



}
