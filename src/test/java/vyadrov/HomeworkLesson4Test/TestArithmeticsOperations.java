package vyadrov.HomeworkLesson4Test;

import com.vyadrov.app.utils.HomeworkLesson4.ArithmeticsOperations;
import org.junit.Assert;
import org.junit.Test;

public class TestArithmeticsOperations {
    @Test
    public void sumTest(){
        int a = 4, b = 6, res = 10;
        Assert.assertEquals(res, ArithmeticsOperations.sum(a, b));
    }
    @Test
    public void subTest() {
        int a = 8, b = 2, res = 6;
        Assert.assertEquals(res, ArithmeticsOperations.sub(a, b));
    }
    @Test
    public void divTest() {
        int a = 8, b = 2, res = 4;
        Assert.assertEquals(res, ArithmeticsOperations.div(a, b));
    }
    @Test
    public void sqrtTest() {
        float a = 0.0012f, res = 0.0014f, delta = 0.0002f;
        Assert.assertEquals(res, ArithmeticsOperations.sqrt(a), delta);

    }
    @Test
    public void powTest() {
        int a = 8, b = 2, res = 64;
        Assert.assertEquals(res, ArithmeticsOperations.pow(a, b));
    }

}
