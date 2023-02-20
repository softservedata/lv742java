package com.softserve.edu.hm13;

import java.time.LocalDate;

public class App5 {
    public static void main(String[] args) {
        UtilFuncAndDate.printDayOfWeek(LocalDate.now());
        UtilFuncAndDate.printDayOfWeek(LocalDate.now().minusMonths(6));
        UtilFuncAndDate.printDayOfWeek(LocalDate.now().minusMonths(12));
    }
}
