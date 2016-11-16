package com.vyadrov.lessons.Lesson_5;

import java.util.Scanner;

public class Bank {
    /** если бы был еще static, то переменная была бы 1 для всех экземпляров */
    private final static float USD_RATE = 2601.1762f;
    private String bankName;

    public Bank(String bankName){
        this.bankName = bankName;
    }
    public void showName() {
        System.out.println("Bank name: "+ bankName);
    }

    public static float getUsdRate() {
        return USD_RATE;
    }



    public boolean isLoanCanBeIssued(Person person) {
        boolean result = false;
        int score = 0;
        if (person.getAge()>=18 && person.getAge()<70) {
            score++;
        }
        if (person.isWorkFlag() == true) {
            score++;
        }
        if (person.getSalary() > 4000) {
            score++;
        }
        if (person.isFeedbackFlag()) {
            score++;
        }
        if (person.getWorkingTime() >= 2) {
            score++;
        }

        System.out.println("Our score: " + score);

        if (score<3) {
            System.out.print("Would you like sell your house? ");
            Scanner sc = new Scanner(System.in);
            if (sc.nextInt() == 1) {
                return true;
            }
        }
        else {
            result = true;
        }

        return result;
    }
}
