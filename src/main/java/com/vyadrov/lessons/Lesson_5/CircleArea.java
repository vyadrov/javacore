package com.vyadrov.lessons.Lesson_5;


public class CircleArea {
    public static final double PI = 3.14d;
    public static void calculateBigger(double radius1, double radius2){


        double circleArea1 = PI * radius1 * radius1;
        double circleArea2 = PI * radius2 * radius2;

        if ((radius1 > radius2) || (circleArea1 > circleArea2)) {
            System.out.println("Area1 is bigger");
            System.out.println("Area2 is smaller");
        } else {
            System.out.println("Area2 is bigger");
            System.out.println("Area1 is smaller");
        }
    }
}
