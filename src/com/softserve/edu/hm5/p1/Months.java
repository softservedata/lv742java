package com.softserve.edu.hm5.p1;

public enum Months {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December"),
    ERROR("Error");

    private String name;

    private static final int countOfDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getNumberOfMonth() {
        int number = -1;
        switch (this) {
            case JANUARY -> number = 1;
            case FEBRUARY -> number = 2;
            case MARCH -> number = 3;
            case APRIL -> number = 4;
            case MAY -> number = 5;
            case JUNE -> number = 6;
            case JULY -> number = 7;
            case AUGUST -> number = 8;
            case SEPTEMBER -> number = 9;
            case OCTOBER -> number = 10;
            case NOVEMBER -> number = 11;
            case DECEMBER -> number = 12;
            default -> number = 0;
        }
        return number;
    }

    public static Months getMonthByNumber(int number){
        Months currentMonth;
        switch (number){
            case 1 -> currentMonth = JANUARY;
            case 2 -> currentMonth = FEBRUARY;
            case 3 -> currentMonth = MARCH;
            case 4 -> currentMonth = APRIL;
            case 5 -> currentMonth = MAY;
            case 6 -> currentMonth = JUNE;
            case 7 -> currentMonth = JULY;
            case 8 -> currentMonth = AUGUST;
            case 9 -> currentMonth = SEPTEMBER;
            case 10 -> currentMonth = OCTOBER;
            case 11 -> currentMonth = NOVEMBER;
            case 12 -> currentMonth = DECEMBER;
            default -> currentMonth = ERROR;
        }
        return currentMonth;
    }

    public int getCountDaysInMonth() {
        return countOfDays[getNumberOfMonth() - 1];
    }

    private Months(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + this.name;
    }
}
