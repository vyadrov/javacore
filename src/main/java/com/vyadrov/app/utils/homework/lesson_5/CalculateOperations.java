package com.vyadrov.app.utils.homework.lesson_5;


public class CalculateOperations {

    public static double calculate(double pi, double radius) {


        double circleArea = pi * radius*radius;
        System.out.println("Circle square is: " + circleArea);
        return circleArea;

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
