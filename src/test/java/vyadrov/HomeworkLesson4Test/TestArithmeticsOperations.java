package vyadrov.HomeworkLesson4Test;

import com.vyadrov.app.utils.HomeworkLesson4.ArithmeticsOperations;
import org.junit.Assert;
import org.junit.Test;

public class TestArithmeticsOperations {
    @Test
    public void sumTest() {
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
        int a = 9, res = 3;
        Assert.assertTrue(res == 3);

    }

    @Test
    public void powTest() {
        int a = 8, b = 2, res = 64;
        Assert.assertTrue(res == 64);
    }
    @Test
    public void multTest() {
        int a = 8, b = 2, res = 16;
        Assert.assertEquals(res, ArithmeticsOperations.mult(a, b));
    }
    @Test
    public void modTest() {
        int a = 15, b = 10, res = 5;
        Assert.assertEquals(res, ArithmeticsOperations.sub(a, b));
    }
}
