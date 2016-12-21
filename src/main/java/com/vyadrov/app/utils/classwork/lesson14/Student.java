package com.vyadrov.app.utils.classwork.lesson14;

public class Student extends Person{
    private String university;
    private String response = "Ehhh, what was the question?";

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", response='" + response + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }

    public Student(String name, String university) {
        super(name);
        this.university = university;
        getName();
    }
    public String getResponse(String question) {
        return response;
    }

}
