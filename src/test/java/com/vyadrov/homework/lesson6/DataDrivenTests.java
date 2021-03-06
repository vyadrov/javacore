package com.vyadrov.homework.lesson6;
import com.vyadrov.app.utils.homework.lesson4.ArithmeticsOperations;
import com.vyadrov.app.utils.homework.lesson5.CalculateOperations;
import com.vyadrov.app.utils.homework.lesson5.ComparisonOperations;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@org.junit.runner.RunWith(JUnitParamsRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataDrivenTests {
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/circleArea.csv", mapper = CsvWithHeaderMapper.class)
    public void circleAreaTest(double agrA, double agrB, double expOut) {
        double actualresult = CalculateOperations.calculate(agrA, agrB);
        Assert.assertEquals(expOut, actualresult, 1e-9);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/biggerCircleArea.csv", mapper = CsvWithHeaderMapper.class)
    public void circleAreaBiggerTest(double agrR1, double agrR2, double expOut) {
        double actualresult = ComparisonOperations.calculateBigger(agrR1, agrR2);
        Assert.assertEquals(expOut, actualresult, 1e-5);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/biggerValue.csv", mapper = CsvWithHeaderMapper.class)
    public void biggerValueTest(int agrA, int agrB, int expOut) {
        int actualresult = ComparisonOperations.biggerValue(agrA, agrB);
        Assert.assertEquals(expOut, actualresult, 1e-5);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/rightAngledTriangle.csv", mapper = CsvWithHeaderMapper.class)
    public void rightAngledTriangleTest(double agrA, double agrB, double agrC, double expOut) {
        double actualresult = CalculateOperations.rightAngledTriangleCheck(agrA, agrB, agrC);
        Assert.assertEquals(expOut, actualresult, 1e-5);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/addition.csv", mapper = CsvWithHeaderMapper.class)
    public void additionTest(int agrA, int agrB, int expOut) {
        int actualresult = ArithmeticsOperations.sum1(agrA, agrB);
        Assert.assertEquals(expOut, actualresult);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/subtraction.csv", mapper = CsvWithHeaderMapper.class)
    public void subtracttionTest(int agrA, int agrB, int expOut) {
        int actualresult = ArithmeticsOperations.sub(agrA, agrB);
        Assert.assertEquals(expOut, actualresult);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/sqrt.csv", mapper = CsvWithHeaderMapper.class)
    public void sqrtTest(double agrA, double expOut) {
        double actualresult = ArithmeticsOperations.sqrt(agrA);
        Assert.assertEquals(expOut, actualresult, 1e-5);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/involution.csv", mapper = CsvWithHeaderMapper.class)
    public void involutionTest(double agrA, double agrB, double expOut) {
        double actualresult = ArithmeticsOperations.pow(agrA, agrB);
        Assert.assertEquals(expOut, actualresult, 1e-5);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/multiplication.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplicationTest(int agrA, int agrB, int expOut) {
        int actualresult = ArithmeticsOperations.mult(agrA, agrB);
        Assert.assertEquals(expOut, actualresult);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/lesson6/division.csv", mapper = CsvWithHeaderMapper.class)
    public void divisionTest(int agrA, int agrB, int expOut) {
        int actualresult = ArithmeticsOperations.div(agrA, agrB);
        Assert.assertEquals(expOut, actualresult);
    }


}
