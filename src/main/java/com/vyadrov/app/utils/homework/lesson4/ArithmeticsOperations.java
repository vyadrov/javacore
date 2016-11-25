package com.vyadrov.app.utils.homework.lesson4;


public class ArithmeticsOperations {
    public static int sum1(int a, int b) {
        return a + b;
    }
    public static int sum2(int a, int b) {
        return a + b;
    }
    public static int checkNull(int a, int b) {
        return a + b;
    }
    public double calculate(String expression) {
        return 0;
    }
    public int countA(String word){
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i)=='a' || word.charAt(i)=='b'){
                count++;
            }
        }
        return count;
    }
    public static int sub(int a, int b){

        return a - b;
    }
        public static int div(int a, int b){

            return a / b;
    }
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }
    public static double pow(double a, double b) {

        return Math.pow(a, b);
    }
    public static int mult(int a, int b) {

        return a * b;
    }
    public static int mod(int a, int b) {
        return a % b;
    }
    public static double abs(double a) {
        return Math.abs(a);
    }
}
