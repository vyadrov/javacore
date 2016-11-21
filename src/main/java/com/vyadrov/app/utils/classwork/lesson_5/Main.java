package com.vyadrov.app.utils.classwork.lesson_5;

public class Main {
    public static void main (String[] args){
        Bank oshadbank = new Bank("Oshadbank");
        Bank privatbank = new Bank("Privatbank");
        Bank pumb = new Bank("PUMB");


        /* oshadbank.showName();
        privatbank.showName();
        pumb.showName();

        System.out.println("USD Rate: " + Bank.getUsdRate());
        */

        Person richMan = new Person();
        richMan.setAge(72);
        richMan.setFeedbackFlag(true);
        richMan.setSalary(30000);
        richMan.setWorkFlag(false);
        richMan.setWorkingTime(0);

        Person nishebrod = new Person();
        nishebrod.setAge(28);
        nishebrod.setFeedbackFlag(false);
        nishebrod.setSalary(1000);
        nishebrod.setWorkFlag(false);
        nishebrod.setWorkingTime(1);

        Person teenager = new Person();
        teenager.setAge(16);

        Person pensioner = new Person();
        pensioner.setAge(75);
        pensioner.setFeedbackFlag(false);
        pensioner.setSalary(1200);
        pensioner.setWorkingTime(25);

        Person student = new Person();
        student.setAge(21);
        student.setSalary(4200);
        student.setWorkFlag(true);
        student.setWorkingTime(2);

        System.out.println("Loan accepted: " + privatbank.isLoanCanBeIssued(richMan));
    }
}
