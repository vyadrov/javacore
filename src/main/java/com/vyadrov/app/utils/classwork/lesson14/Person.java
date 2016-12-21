package com.vyadrov.app.utils.classwork.lesson14;

public class Person {
    final void setName(String name) {
        this.name = name;
    }
    final String getName() {

        return name;
    }
    private String name;
    public Person(String name) {
        this.name = name;
    }
}
