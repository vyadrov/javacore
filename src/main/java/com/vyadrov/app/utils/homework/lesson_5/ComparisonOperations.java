package com.vyadrov.app.utils.homework.lesson_5;


public class ComparisonOperations {
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
    public static double biggerValue(double a, double b) {
        if (a > b) {
            System.out.println("Value a is bigger than value b");
            return a;
        } else if (a == b){
            System.out.println("Values are equals.");
            return (a = b);
        } else {
            System.out.println("Value b is bigger than value a");
            return b;
        }
    }

}
