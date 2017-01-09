package com.vyadrov.app.utils.homework.lesson15;

public class CustomBicycle extends Bicycle{
    @Override
    public void ride() {
        super.ride();
        System.out.println("Wshhhh!");
    }

    @Override
    public int setSpeed(int speed) {
        System.out.println("Speed is setted to: " + speed);
        return speed;
    }

    @Override
    public int setGear(int gear) {
        System.out.println("Gear is setted to: " + gear);
        return gear;
    }
}
