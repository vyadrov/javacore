package com.vyadrov.app.utils.classwork.lesson7;

public class Loops {

    public static void counter(int a, int b) {

        while (a > b) {

            System.out.println("a = " + a + " " + "b = " + b);
            a--;
        }
        System.out.println("a = " + a + " " + "b = " + b);

    }
    public static void counterTo10() {
        for (int i =0; i <=10; i++){
            System.out.print(i + " ");
        }
    }
    public static int evenNumbers() {
        int a = 0;
        for (int i = 0; i<=20; i = i + 2) {
            a++;
        }
        return a;
    }

}
