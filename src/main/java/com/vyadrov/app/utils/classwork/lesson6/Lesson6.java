//package com.vyadrov.app.utils.classwork.lesson6;
//
//import com.vyadrov.app.utils.homework.lesson4.ArithmeticsOperations;
//import junitparams.FileParameters;
//import junitparams.JUnitParamsRunner;
//import junitparams.mappers.CsvWithHeaderMapper;
//import org.junit.Assert;
//import org.junit.Test;
//
//@org.junit.runner.RunWith(JUnitParamsRunner.class)
//public class Lesson6 {
//    @Test
//    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
//    public void parametrizedTest(int agrA, int agrB, int expOut) {
//        Assert.assertEquals(expOut, ArithmeticsOperations.mult(agrA, agrB));
//
//    }
//}
