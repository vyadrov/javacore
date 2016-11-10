package com.vyadrov.app.utils.convertors;

public class PrimitiveConvertor {
    char char1 = 99;
    int int1 = 55;
    float float1 = 56f;

    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar();
        primitiveConvertor.intToChar();
        primitiveConvertor.charToInt();

    }
    public void floatToChar() {
        char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
    }

    public void intToChar() {
        char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }

    public void charToInt() {
        int1 = (int) char1;
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
    }
}
