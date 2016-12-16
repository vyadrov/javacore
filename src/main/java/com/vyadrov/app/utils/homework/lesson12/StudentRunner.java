package com.vyadrov.app.utils.homework.lesson12;

import com.vyadrov.app.utils.classwork.lesson13.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setAge(23);
        student.setAverageRating(4.3);
        student.setCourse(5);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse());
        System.out.println(student.getAverageRating());
    }
}
