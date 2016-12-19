package com.vyadrov.app.utils.homework.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhiteCollar extends Human {
    private String nameCompany;

    public WhiteCollar(String name, String companyName, int age) {
        super(name, age);
        this.nameCompany = companyName;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        Pattern pattern = Pattern.compile("([a-zA-Z\\s\\u002C\\u002D]*)");
        Matcher match = pattern.matcher(nameCompany);
        if (match.matches() == true) {
            this.nameCompany = nameCompany;
            System.out.println("Company name is setted");
        } else {
            System.out.println("Company name is invalid");
        }
    }
}
