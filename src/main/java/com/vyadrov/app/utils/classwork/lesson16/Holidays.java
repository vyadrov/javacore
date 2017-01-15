package com.vyadrov.app.utils.classwork.lesson16;

public enum Holidays { NEW_YEAR (1, "January", "New Year"), CHRISTMAS (7, "Janueary", "Christmas"), VICTORY_DAY (9, "May", "Victory Day");
private int date;
private String mounth;
private String holiday;

    Holidays(int date, String mounth, String holiday) {
        this.date = date;
        this.mounth = mounth;
        this.holiday = holiday;
    }

    @Override
    public String toString() {
        return "Holidays{" +
                "date=" + date +
                ", mounth='" + mounth + '\'' +
                ", holiday='" + holiday + '\'' +
                '}';
    }

    public int getDate() {
        return date;
    }

    public String getMounth() {
        return mounth;
    }

    public String getHoliday() {
        return holiday;
    }
}
