package com.vyadrov.app.utils.homework.lesson9;

public class ArrayPrint {
    public static void bubbleOutMinToMax(int[] toMax1) {
        for (int i = 0; i < toMax1.length; i++) {
            System.out.print(toMax1[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleOutMaxToMin(int[] toMin1) {
        for (int i = 0; i < toMin1.length; i++) {
            System.out.print(toMin1[i] + " ");
        }
        System.out.println();
    }
    public static void selectionOutMinToMax(int[] toMax2) {
        for (int i = 0; i < toMax2.length; i++) {
            System.out.print(toMax2[i] + " ");
        }
        System.out.println();
    }

    public static void selectionOutMaxToMin(int[] toMin) {
        for (int i = 0; i < toMin.length; i++) {
            System.out.print(toMin[i] + " ");
        }
        System.out.println();
    }

}
