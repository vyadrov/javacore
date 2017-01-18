package com.vyadrov.app.utils.classwork.lesson17;

public class ArraySorterGenerics<T> {
    private T t;
    //private Integer[] array = new Integer[6];


    public <U extends Comparable, Number> U[] bubbleSortingMaxToMin(U[] u) {
        U temp;
        for (int i = 0; i < u.length; i++) {
            for (int j = 0; j < u.length - 1; j++) {
                if (u[j].compareTo(u[j + 1]) < 0) {
                    temp = u[j];
                    u[j] = u[j + 1];
                    u[j + 1] = temp;
                }
            }
        } return u;
    }
}
