package com.vyadrov.runners.homework.lesson13;

import com.vyadrov.app.utils.homework.lesson13.WhiteCollar;

import java.util.Scanner;

public class WhiteCollarRunner {
    public static void main(String[] args) {
        WhiteCollar whiteCollar = new WhiteCollar("Bob", "Shamsung", 5);
        System.out.println("Please enter the company name:");
        Scanner scanner = new Scanner(System.in);
        String nameCompany = scanner.nextLine();
        whiteCollar.setNameCompany(nameCompany);
        //System.out.println(whiteCollar.getNameCompany());
    }
}
