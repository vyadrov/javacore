package com.vyadrov.app.utils.homework.lesson17;
public class ArraySorterGenerics1<T> {
    private T[] array;
    public ArraySorterGenerics1(T[] array) {
        this.array = array;
    }
    public <T extends Comparable<T>, Number> T[] sort(T[] array) {
        T temp;
        System.out.println("Bubble sort of the array from Min to Max number: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j+ 1].compareTo(array[j]) < 0) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public T[] getArray() {
        System.out.println(array);
        return array;
    }

}
