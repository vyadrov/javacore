package com.vyadrov.homework.lesson5;


import com.vyadrov.app.utils.homework.lesson5.ComparisonOperations;
import com.vyadrov.app.utils.homework.lesson5.CalculateOperations;
import com.vyadrov.app.utils.homework.lesson5.MenuLesson5;
import org.junit.Assert;
import org.junit.Test;

public class TestHomeworkLesson5 {
    @Test
    public void TesrightAngledTriangleCheck(){
        double a = 3, b = 4, c = 5;
        double actualResult = CalculateOperations.rightAngledTriangleCheck(a,b, c);
        Assert.assertEquals(Double.doubleToLongBits(c), Double.doubleToLongBits(actualResult));
    }
    @Test
    public void TestLesson5Class1() {
        CalculateOperations calculate = new CalculateOperations();
    }
    @Test
    public void TestLesson5Class2() {
        ComparisonOperations compare = new ComparisonOperations();
    }
    @Test
    public void TestLesson5Class3() {
        MenuLesson5 menu = new MenuLesson5();
    }

    @Test
    public void TestrightAngledTriangleCheckC() {
        double a = 3, b = 4, c = 5;
        double actual = CalculateOperations.rightAngledTriangleCheck(a, b, c);
        Assert.assertEquals(c,actual, 1e-4);
    }
    @Test
    public void TestrightAngledTriangleCheckbigger() {
        double a = 3, b = 4, c = 9;
        double actual = CalculateOperations.rightAngledTriangleCheck(a, b, c);
        Assert.assertEquals(c,actual, 1e-4);
    }
    @Test
    public void TestrightAngledTriangleCheckA() {
        double a = 5, b = 4, c = 3;
        double actual = CalculateOperations.rightAngledTriangleCheck(a, b, c);
        Assert.assertEquals(a,actual, 1e-4);
    }
    @Test
    public void TestrightAngledTriangleCheckAbigger() {
        double a = 12, b = 4, c = 5;
        double actual = CalculateOperations.rightAngledTriangleCheck(a, b, c);
        Assert.assertEquals(c,actual, 1e-4);
    }
    @Test
    public void TestrightAngledTriangleCheckB() {
        double a = 3, b = 5, c = 4;
        double actual = CalculateOperations.rightAngledTriangleCheck(a, b, c);
        Assert.assertEquals(b,actual, 1e-4);
    }
    @Test
    public void TestrightAngledTriangleCheck1() {
        double a = 9, b = 14, c = 3;
        double actual = CalculateOperations.rightAngledTriangleCheck(a, b, c);
        Assert.assertEquals(a,actual, 1e-4);
    }
    @Test
    public void TestrightAngledTriangleCheck2() {
        double a = 5, b = -4, c = 3;
        double actual = CalculateOperations.rightAngledTriangleCheck(a, b, c);
        Assert.assertEquals(0,actual, 1e-4);
    }
    @Test
    public void Testcalculate(){
        double pi = 3, radius = 2, circleArea = 12;
        double actualResult2 = CalculateOperations.calculate(pi, radius);
        Assert.assertEquals(circleArea, actualResult2, 1e-9);

    }

    @Test
    public void TestcalculateBigger() {
        double PI = 3.14d, radius1 = 2, radius2 = 1, circleArea2 = 12.56;
        double actualresult3 = ComparisonOperations.calculateBigger(radius1, radius2);
        Assert.assertEquals(circleArea2, actualresult3, 1e-9);
    }
    @Test
    public void TestcalculateBigger1() {
        double PI = 3.14d, radius1 = 1, radius2 = 10, circleArea1 = 314;
        double actualresult4 = ComparisonOperations.calculateBigger(radius1, radius2);
        Assert.assertEquals(circleArea1, actualresult4, 1e-9);
    }
    @Test
    public void TestcalculateBiggerNotNull() {
        double PI = 3.14d, radius1 = 10, radius2 = 1, circleArea1 = 314;
        double actualresult5 = ComparisonOperations.calculateBigger(radius1, radius2);
        Assert.assertNotNull(radius1);
    }
    @Test
    public void TestcalculateBiggerFalse1() {
        double PI = 3.14d, radius1 = 10, radius2 = 1, circleArea1 = 314;
        double actual3 = ComparisonOperations.calculateBigger(radius1, radius2);
        Assert.assertFalse(circleArea1 == 26);
    }
    @Test
    public void TestcalculateBiggerFalse2() {
        double PI = 3.14d, radius1 = 10, radius2 = 1, circleArea2 = 314;
        double actual3 = ComparisonOperations.calculateBigger(radius1, radius2);
        Assert.assertFalse(circleArea2 == 28);
    }
    @Test
    public void biggerNumber2() {
        int a = -18, b = 3;
        int actualResult = ComparisonOperations.biggerValue(a,b);
        Assert.assertEquals(b, actualResult);
    }
    @Test
    public void biggerNumber1() {
        int a = 18, b = 3;
        int actualResult = ComparisonOperations.biggerValue(a,b);
        Assert.assertEquals(a, actualResult);
    }
    @Test
    public void biggerNumber0() {
        int a = 18, b = 18;
        int actualResult = ComparisonOperations.biggerValue(a,b);
        Assert.assertEquals(a, actualResult);
    }

}
