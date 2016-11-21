package com.vyadrov.lessons.Lesson_5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

@org.junit.runner.RunWith(JUnitParamsRunner.class)
public class Lesson6 {
    @Test
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
    public void parametrizedTest() {

    }
}
