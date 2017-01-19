package com.vyadrov.app.utils.homework.lesson17;
public class ArraySorterGenerics1<T extends Number>{
    private T[] t;
    public ArraySorterGenerics1(T[] t) {
        this.t = t;
    }
    public void unStaticSort() {
        this.t = staticSort(t);
    }
    public static <T extends Number> T[] staticSort(T[] array) {
        T temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j+ 1].doubleValue() > (array[j].doubleValue())) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("\n" + "Bubble sort from Max to Min:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public T[] getArray() {
        return t;
    }

}
