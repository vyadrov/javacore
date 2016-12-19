package com.vyadrov.app.utils.homework.lesson13;

public class Human {
    private String name;
    private int age;
    public Human(String name, int age) {
        this.name = name;
        setAge(age);
    }
    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age <= 1 || age >= 120) {
            System.out.println("Age invalid");
        } else {
            this.age = age;
            System.out.println("New age setted");
        }
    }
}
