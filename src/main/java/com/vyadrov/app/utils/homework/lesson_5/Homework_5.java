package com.vyadrov.app.utils.homework.lesson_5;


public class Homework_5 {
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
    public static double calculate(double pi, double radius) {


        double circleArea = pi * radius*radius;
        System.out.println("Circle square is: " + circleArea);
        return circleArea;

    }
    public static double biggerValue(double a, double b) {
        if (a > b) {
            System.out.println("Value a is bigger than value b");
        } else {
            System.out.println("Value b is bigger than value a");
        }
            return a;
    }
    public static double rightAngledTriangleCheck(double a, double b){
        double c = Math.sqrt(a * a + b * b);
        if (c > a && c > b && a > 0 && b > 0) {
            System.out.println("Hypotenuse of your right-angled triangle is:" + c);
        } else {
            if (a <= 0 && b <= 0) {
                System.out.println("Cathetus a & b are contain negative or zero values. Please enter correct values");
            } else {
                if (a <= 0) {
                    System.out.println("Cathetus a contains negative or zero alue. Please enter correct value");
                } else {
                    if (b <= 0 ){
                        System.out.println("Cathetus b contains negative or zero value. Please enter correct value");
                    }
                }
            }
        }



        return c;
    }
}
