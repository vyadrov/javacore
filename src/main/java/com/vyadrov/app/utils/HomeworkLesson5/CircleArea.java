package com.vyadrov.app.utils.HomeworkLesson5;


public class CircleArea {
    public static final double PI = 3.14d;
    public static double calculateBigger(double radius1, double radius2){

        double circleArea1 = PI * radius1 * radius1;
        double circleArea2 = PI * radius2 * radius2;

        if (radius1 > radius2){
            System.out.println("Area1 is bigger");
            System.out.println("Area2 is smaller");
            return circleArea1;
        } else {
            System.out.println("Area2 is bigger");
            System.out.println("Area1 is smaller");

        }
        return circleArea2;

    }
}
