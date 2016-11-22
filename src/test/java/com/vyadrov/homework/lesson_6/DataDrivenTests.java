package com.vyadrov.homework.lesson_6;
import com.vyadrov.app.utils.homework.lesson_5.Homework_5;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;

@org.junit.runner.RunWith(JUnitParamsRunner.class)
public class DataDrivenTests {
    @Test
    @FileParameters(value = "src/test/resources/homework/circleArea.csv", mapper = CsvWithHeaderMapper.class)
    public void circleAreaTest(double agrA, double agrB, double expOut) {
        double actualresult = Homework_5.calculate(agrA, agrB);
        Assert.assertEquals(expOut, actualresult, 1e-9);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/biggerCircleArea.csv", mapper = CsvWithHeaderMapper.class)
    public void circleAreaBiggerTest(double agrR1, double agrR2, double expOut) {
        double actualresult = Homework_5.calculateBigger(agrR1, agrR2);
        Assert.assertEquals(expOut, actualresult, 1e-9);
    }
    @Test
    @FileParameters(value = "src/test/resources/homework/biggerValue.csv", mapper = CsvWithHeaderMapper.class)
    public void biggerValueTest(double agrA, double agrB, double expOut) {
        double actualresult = Homework_5.biggerValue(agrA, agrB);
        Assert.assertEquals(expOut, actualresult, 1e-9);
    }
}
