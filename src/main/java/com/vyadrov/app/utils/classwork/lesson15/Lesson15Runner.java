package com.vyadrov.app.utils.classwork.lesson15;

public class Lesson15Runner {
    public static void main(String[] args) {
        Car bmw = new BMW();
        Car audi = new Audi();
        printEmissions(bmw);
        printEmissions(audi);
    }

    public static void printEmissions(Car car){
        car.drive();
    }
}
