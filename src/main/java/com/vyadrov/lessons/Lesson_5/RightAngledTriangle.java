package com.vyadrov.lessons.Lesson_5;

import java.util.Scanner;


public class RightAngledTriangle {
    public static double rightAngledTriangleCheck(double a, double b){
        /*Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter cathetus a:");
        double a = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter cathetus b:");
        double b = scanner2.nextDouble(); */


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
