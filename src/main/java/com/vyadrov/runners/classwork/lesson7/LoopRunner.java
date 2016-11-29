package com.vyadrov.runners.classwork.lesson7;

/**
 * Created by vitalii on 25.11.2016.
 */
public class LoopRunner {
    public static void main (String args[]) {
        //Loops.counter(4, 2);

        //Loops.counterTo10();

        /*int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment" + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment" + a);*/

        //System.out.println(Loops.evenNumbers());

        int [] intarray = {1, 2, 3};
        /*for (int i = 0; i <intarray.length; i++) {
            System.out.println(intarray[i]);
        }*/
        for (int arrElement : intarray) {
            System.out.println(arrElement);
        }
    }


}
