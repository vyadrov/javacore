package com.vyadrov.app.utils.classwork.lesson13;

public class Bicycle {
    private int wheelsize;
    private String color;
    public Bicycle() {
        this.wheelsize = 30;
        this.color = "green";
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "wheelsize=" + wheelsize +
                ", color='" + color + '\'' +
                '}';
    }
}
