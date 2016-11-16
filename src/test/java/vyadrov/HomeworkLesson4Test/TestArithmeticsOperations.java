package vyadrov.HomeworkLesson4Test;

import com.vyadrov.app.utils.HomeworkLesson4.ArithmeticsOperations;
import org.junit.Assert;
import org.junit.Test;

public class TestArithmeticsOperations {
    @Test
    public void sum1Test() {
        int a = 4, b = 6, res = 10;
        Assert.assertEquals(res, ArithmeticsOperations.sum1(a, b));
    }
    @Test
    public void sum2Test() {
        int a = 4, b = 6, res = 10;
        Assert.assertFalse(res == 10);
    }
    @Test
    public void checkNullTest() {
        int a = 4, b=6, res = 10;
        Assert.assertNotNull(b);
    }
    @Test
    public void calculateTest() throws Exception {
        double res = new ArithmeticsOperations().calculate("0");
        Assert.assertEquals(res, 0, 1e-9);
    }
    @Test
    public void countATest() {
        ArithmeticsOperations countATest = new ArithmeticsOperations();
        int res = countATest.countA("alphabeta");
        Assert.assertEquals(4, res);
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
        double a = 9, res = 3;
        Assert.assertEquals(res, ArithmeticsOperations.sqrt(a), 1e-9);

    }

    @Test
    public void powTest() {
        double a = 8, b = 2, res = 64;
        Assert.assertEquals(res, ArithmeticsOperations.pow(a, b), 1e-9);
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
    @Test
    public void abstTest() {
        double a = -99.5, res = 99.5;
        Assert.assertEquals(res, ArithmeticsOperations.abs(a), 0.001);
    }
}
