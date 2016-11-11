package com.vyadrov.app.utils.convertors;

public class PrimitiveConvertor {

    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar(35.69f);
        primitiveConvertor.intToChar(53);
        primitiveConvertor.charToInt('e');

    }
    public void floatToChar(float f) {
        char c = (char) f;
        System.out.println("Input float value is " + f + ". Output char value is " + c);
    }

    public void intToChar(int i) {
        char c = (char) i;
        System.out.println("Input int value is " + i + ". Output char value is " + c);
    }

    public void charToInt(char c) {
        int i = (int) c;
        System.out.println("Input char value is " + c + ". Output int value is " + i);
    }
}
