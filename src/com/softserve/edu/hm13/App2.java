package com.softserve.edu.hm13;

import com.softserve.edu.hm11.StrUtil;

public class App2 {
    public static void main(String[] args) {
        String text = StrUtil.enterSentence();
        String temp = "dd.MM.yyyy";
        System.out.println("isDateCorrect (" + temp + ") = " + UtilFuncAndDate.isDateCorrect(text, temp));
    }
}
