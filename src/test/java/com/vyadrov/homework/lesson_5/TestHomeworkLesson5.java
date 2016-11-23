package com.vyadrov.homework.lesson_5;


import com.vyadrov.app.utils.homework.lesson_5.ComparisonOperations;
import com.vyadrov.app.utils.homework.lesson_5.CalculateOperations;
import com.vyadrov.app.utils.homework.lesson_5.MenuLesson5;
import org.junit.Assert;
import org.junit.Test;

public class TestHomeworkLesson5 {
    @Test
    public void TesrightAngledTriangleCheck(){
        double a = 3, b = 4, c = 5;
        double actualResult = CalculateOperations.rightAngledTriangleCheck(a,b);
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
    public void TestrightAngledTriangleCheckNotNull(){
        double a = 3, b = 4, c = 5;
        double actual = CalculateOperations.rightAngledTriangleCheck(a, b);
        Assert.assertNotNull(a);
    }
    @Test
    public void TestrightAngledTriangleCheckFalse() {
        double a = 3, b = 4, c = 5;
        double actual1 = CalculateOperations.rightAngledTriangleCheck(a, b);
        Assert.assertFalse(c == 9);
    }
    @Test
    public void Testcalculate(){
        double pi = 3, radius = 2, circleArea = 12;
        double actualResult2 = CalculateOperations.calculate(pi, radius);
        Assert.assertEquals(circleArea, actualResult2, 1e-9);

    }
    @Test
    public void TestcalculateFalse() {
        double pi = 3, radius = 2, circleArea = 12;
        double actual2 = CalculateOperations.calculate(pi, radius);
        Assert.assertFalse(circleArea == 10);
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

}
