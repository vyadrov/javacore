package com.vyadrov.homework.lesson9;

import com.vyadrov.app.utils.homework.lesson9.ArrayGenerating;
import org.junit.Assert;
import org.junit.Test;

public class ArrayGeneratingTest {

    @Test
    public void arrayGeneratingClass() {
        ArrayGenerating arrayGenerating = new ArrayGenerating();
    }
    @Test
    public void valuesInCorrectRange() {
        int[] actualResult = ArrayGenerating.arrayGenerating();
        for (int i = 0; i < actualResult.length - 1; i++) {
            Assert.assertTrue(actualResult[i] >1 && actualResult[i] < 100);
        }
    }
}
