package com.vyadrov.homework.lesson9;

import com.vyadrov.app.utils.homework.lesson9.ArrayGenerating;
import com.vyadrov.app.utils.homework.lesson9.ArrayPrint;
import com.vyadrov.app.utils.homework.lesson9.Sorting;
import org.junit.Assert;
import org.junit.Test;

public class ArrayPtintTest {

    @Test
    public void arrayPrintClass() {
        ArrayPrint arrayPrint = new ArrayPrint();
    }
    @Test
    public void bubbleSortingMinToMaxTest() {
        int[] arrayGenerated = {25, 8, 6, 64, 97, 2, 77, 9, 1, 33};
        int[] arrayExpected = {1, 2, 6, 8, 9, 25, 33, 64, 77, 97};
        int[] actualSortedArray = Sorting.bubbleSortingMinToMax(arrayGenerated);
        int[] actualResult = ArrayPrint.bubbleOutMinToMax(actualSortedArray);
        Assert.assertArrayEquals(arrayExpected, actualResult);
    }
    @Test
    public void bubbleSortingMaxToMinTest() {
        int[] arrayGenerated = {25, 8, 6, 64, 97, 2, 77, 9, 1, 33};
        int[] arrayExpected = {97, 77, 64, 33, 25, 9, 8, 6, 2, 1};
        int[] actualSortedArray = Sorting.bubbleSortingMaxToMin(arrayGenerated);
        int[] actualResult = ArrayPrint.bubbleOutMaxToMin(actualSortedArray);
        Assert.assertArrayEquals(arrayExpected, actualResult);
    }
    @Test
    public void selectionSortMinToMaxTest() {
        int[] arrayGenerated = {25, 8, 6, 64, 97, 2, 77, 9, 1, 33};
        int[] arrayExpected = {1, 2, 6, 8, 9, 25, 33, 64, 77, 97};
        int[] actualSortedArray = Sorting.selectionSortMinToMax(arrayGenerated);
        int[] actualResult = ArrayPrint.selectionOutMinToMax(actualSortedArray);
        Assert.assertArrayEquals(arrayExpected, actualResult);
    }
    @Test
    public void selectionSortMaxToMinTest() {
        int[] arrayGenerated = {25, 8, 6, 64, 97, 2, 77, 9, 1, 33};
        int[] arrayExpected = {97, 77, 64, 33, 25, 9, 8, 6, 2, 1};
        int[] actualSortedArray = Sorting.selectionSortMaxToMin(arrayGenerated);
        int[] actualResult = ArrayPrint.selectionOutMaxToMin(actualSortedArray);
        Assert.assertArrayEquals(arrayExpected, actualResult);
    }

}
