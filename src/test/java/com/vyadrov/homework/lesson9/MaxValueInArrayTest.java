package com.vyadrov.homework.lesson9;


import com.vyadrov.app.utils.homework.lesson9.ArrayGenerating;
import com.vyadrov.app.utils.homework.lesson9.MaxValueInArray;
import org.junit.Assert;
import org.junit.Test;

public class MaxValueInArrayTest {

    @Test
    public void MaxValueInArrayClass() {
        MaxValueInArray maxValueInArray = new MaxValueInArray();
    }
    @Test
    public void valuesInCorrectRangeTest() {
        int[][] actualResult = MaxValueInArray.maxValueInArray();
        for (int i = 0; i < actualResult.length; i++) {
            for (int j = 0; j < actualResult[i].length; j++) {
                Assert.assertTrue(actualResult[i][j] > -99 && actualResult[i][j] < 100);
            }
        }
    }




}
