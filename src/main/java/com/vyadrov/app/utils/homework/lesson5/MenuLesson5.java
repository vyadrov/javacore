package com.vyadrov.app.utils.homework.lesson5;

import java.util.Scanner;

public class MenuLesson5 {

    public static void menucall() {
    int number;
    do {


        System.out.println("Which task do you want to solve? Please choose: \n" + "\t" + "Press 1 if you want to compare square circles\n" + "\t" + "Press 2 if you want to calculate circle square\n" + "\t" + "Press 3 if you want to determine bigger value\n" + "\t" + "Press 4 if you want to calculate hypotenuse of right-angled triangle\n" + "\t" + "press 0 if you want to exit\n");

        Scanner sc1 = new Scanner(System.in);
        int inputNumber = sc1.nextInt();
        if (inputNumber == 1) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter radius for first circle");
            double radius1 = scanner1.nextDouble();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please enter radius for second circle");
            double radius2 = scanner2.nextDouble();
            ComparisonOperations.calculateBigger(radius1, radius2);
        } else if (inputNumber == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter circle radius");
            double radius = scanner.nextDouble();
            System.out.println("Please enter pi value");
            double pi = scanner.nextDouble();
            CalculateOperations.calculate(pi, radius);
        } else if (inputNumber == 3) {
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Please enter value a:");
            int a = scanner5.nextInt();
            Scanner scanner6 = new Scanner(System.in);
            System.out.println("Please enter value b:");
            int b = scanner6.nextInt();
            ComparisonOperations.biggerValue(a, b);
        } else if (inputNumber == 4) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please enter side a:");
            double a = scanner3.nextDouble();
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Please enter side b:");
            double b = scanner4.nextDouble();
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Please enter side c:");
            double c = scanner5.nextDouble();
            CalculateOperations.rightAngledTriangleCheck(a, b, c);
        } else if (inputNumber == 0){
            System.out.println("Bye!");
        } else {
            System.out.println("You entered wrong number");
        }
        number = inputNumber;
    } while (number != 0);
    }
}
