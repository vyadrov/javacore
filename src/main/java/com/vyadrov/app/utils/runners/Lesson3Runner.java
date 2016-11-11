package com.vyadrov.app.utils.runners;
import com.vyadrov.app.utils.convertors.PrimitiveConvertor;

public class Lesson3Runner {
    public static void main (String args[]) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar(3.25f);
        primitiveConvertor.intToChar(121);
        primitiveConvertor.charToInt('r');


    }
}
