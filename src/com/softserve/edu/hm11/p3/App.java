package com.softserve.edu.hm11.p3;

import com.softserve.edu.hm11.StrUtil;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String text = StrUtil.enterSentence();
        List<String> list = new ArrayList<>();
        list = StrUtil.parseCurrency(text);
        System.out.println(list);
    }
}
