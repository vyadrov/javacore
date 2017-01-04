package com.vyadrov.app.utils.classwork.lesson15;


public abstract class Car {
    public String name = "Car";
    abstract void drive();
    protected int openDoors() {
        return 3;
    }
}
