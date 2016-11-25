package com.vyadrov.classwork.lesson_4;

import com.vyadrov.app.utils.classwork.lesson4.MathFunc;
import org.junit.Assert;
import org.junit.Test;


public class MuthFunc {
    @Test
    public void multiplyTest(){
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}
