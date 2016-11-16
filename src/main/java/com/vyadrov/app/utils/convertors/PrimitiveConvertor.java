package com.vyadrov.app.utils.convertors;

public class PrimitiveConvertor {

    public void floatToChar(float float1) {
        char char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
    }

    public void intToChar(int int1) {
        char char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }

    public void charToInt(char char1) {
        int int1 = (int) char1;
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
    }
}
