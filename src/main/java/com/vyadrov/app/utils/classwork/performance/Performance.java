package com.vyadrov.app.utils.classwork.performance;

/**
 * Created by vyadrov on 11/25/16.
 */
public class Performance {

        public static void main(String[] args) {
            Performance.stringMethod();
            Performance.builderMethod();
        }
        public static void stringMethod() {

            long start = System.currentTimeMillis();
            String c ="start";
            String b ="finish";
            for (long i = 0; i < 100000L; i++)
                c = c.concat(b);
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }

        public static void builderMethod(){

            long start = System.currentTimeMillis();
            StringBuilder c = new StringBuilder("start");
            String b = "finish";
            for (int i = 0; i < 100000L; i++) {
                c = c.append(b);
            }
            long end = System.currentTimeMillis();
            System.out.println((end - start)/1000.0f);
        }

    }
