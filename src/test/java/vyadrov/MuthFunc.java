package vyadrov;

import com.vyadrov.lessons.MathFunc;
import org.junit.Assert;
import org.junit.Test;


public class MuthFunc {
    @Test
    public void multiplyTest(){
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}
