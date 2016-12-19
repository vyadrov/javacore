package com.vyadrov.runners.homework.lesson13;

import com.vyadrov.app.utils.homework.lesson13.Human;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human("Bob", 18);
        human.setAge(15);
        System.out.println(human.getAge());
    }
}
