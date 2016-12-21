package com.vyadrov.app.utils.classwork.lesson14;


public class Teacher extends Person{
    private int mark;

    @Override
    public String toString() {
        return "Teacher{" +
                "mark=" + mark + '\'' +
                "name=" + getName() + '\'' +
                '}';
    }

    public void setMark(int mark) {
        this.mark = mark;
        getName();
    }

    public Teacher(String name, int mark) {
        super(name);
        this.mark = mark;

    }
}
