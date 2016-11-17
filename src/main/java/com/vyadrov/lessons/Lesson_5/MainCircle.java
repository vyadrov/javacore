package com.vyadrov.lessons.Lesson_5;

import java.util.Scanner;

public class MainCircle {
    public static void main (String[] args) {
       // CircleRadius.calculate();

       // RightAngledTriangle.rightAngledTriangleCheck(2,4);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter radius for first circle");
        double radius1 = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter radius for second circle");
        double radius2 = scanner2.nextDouble();
        CircleArea.calculateBigger(radius1, radius2);
        System.out.println("привет... \n" + "шаша\n");

    }
}
