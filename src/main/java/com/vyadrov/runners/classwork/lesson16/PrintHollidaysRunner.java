package com.vyadrov.runners.classwork.lesson16;

import com.vyadrov.app.utils.classwork.lesson16.Holidays;

public class PrintHollidaysRunner {
    public static void main(String[] args) {
        for (Holidays days: Holidays.values()) {
            System.out.println("Holiday: " + days.toString());
        }
    }
}
