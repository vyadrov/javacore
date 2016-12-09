package com.vyadrov.app.utils.homework.lesson9;

public class ArrayPrint {
    public static int[] bubbleOutMinToMax(int[] toMax1) {
        for (int i = 0; i < toMax1.length; i++) {
            System.out.print(toMax1[i] + " ");
        }
        System.out.println();
        return toMax1;
    }

    public static int[] bubbleOutMaxToMin(int[] toMin1) {
        for (int i = 0; i < toMin1.length; i++) {
            System.out.print(toMin1[i] + " ");
        }
        System.out.println();
        return toMin1;
    }
    public static int[] selectionOutMinToMax(int[] toMax2) {
        for (int i = 0; i < toMax2.length; i++) {
            System.out.print(toMax2[i] + " ");
        }
        System.out.println();
        return toMax2;
    }

    public static int[] selectionOutMaxToMin(int[] toMin) {
        for (int i = 0; i < toMin.length; i++) {
            System.out.print(toMin[i] + " ");
        }
        System.out.println();
        return toMin;
    }

}
