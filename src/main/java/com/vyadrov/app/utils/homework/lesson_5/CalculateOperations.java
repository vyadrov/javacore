package com.vyadrov.app.utils.homework.lesson_5;


public class CalculateOperations {

    public static double calculate(double pi, double radius) {


        double circleArea = pi * radius*radius;
        System.out.println("Circle square is: " + circleArea);
        return circleArea;

    }

    public static double rightAngledTriangleCheck(double a, double b, double c){

        if (a > 0 && b > 0 && c > 0) {
            if (c > a && c > b) {
                if(c == Math.sqrt(a * a + b * b)) {
                    System.out.println("This triangle is right-angled");
                    return c;
                }
                else System.out.println("This triangle is NOT right-angled");
                return c;
            } else if (b > a && b > c) {
                if (b == Math.sqrt(a * a + c * c)) {
                    System.out.println("This triangle is right-angled");
                    return b;
                }
                else System.out.println("This triangle is NOT right-angled");
                return b;
            } else if (a > c && a > b) {
                        if(a == Math.sqrt(b * b + c * c)) {
                            System.out.println("This triangle is right-angled");
                            return a;
                        }
                        else System.out.println("This triangle is NOT right-angled");
                        return a;
                    }

                    }
        else System.out.println("You entered wrong values");
        return 0;
    }


            }
