package com.softserve.edu.hm13;

import com.softserve.edu.hm11.StrUtil;

public class App3 {
    public static void main(String[] args) {
        String text = StrUtil.enterSentence();
        int year = 0;
        try {
            year = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Error, cannot parse to int!");
            return;
        }
        System.out.println("isLeapYear = " + UtilFuncAndDate.isLeapYear(year));
    }
}
