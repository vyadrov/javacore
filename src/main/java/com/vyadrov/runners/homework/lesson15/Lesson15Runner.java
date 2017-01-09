package com.vyadrov.runners.homework.lesson15;

import com.vyadrov.app.utils.homework.lesson15.Bicycle;
import com.vyadrov.app.utils.homework.lesson15.BicycleWithRing;
import com.vyadrov.app.utils.homework.lesson15.BicycleWithRingInterface;
import com.vyadrov.app.utils.homework.lesson15.CustomBicycle;

public class Lesson15Runner {
    public static void main(String[] args) {
        Bicycle comanche = new CustomBicycle();
        BicycleWithRingInterface ring = new BicycleWithRing();

        comanche.setSpeed(40);
        comanche.setGear(20);
        ring.ring();
        comanche.ride();
    }
}
