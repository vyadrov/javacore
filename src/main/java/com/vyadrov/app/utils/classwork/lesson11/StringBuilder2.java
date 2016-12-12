package com.vyadrov.app.utils.classwork.lesson11;


public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("start");
        int startInclusive = 1;
        int endInclusive = 2;
        //int charIndex = 3;
        builder.replace(startInclusive, endInclusive, "replace");
        System.out.print(builder.toString());
        /*builder.delete(startInclusive, endInclusive);
        System.out.print(builder.toString());*/

    }
    // Delete substring from string




}
