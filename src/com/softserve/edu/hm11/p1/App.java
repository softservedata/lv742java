package com.softserve.edu.hm11.p1;

import com.softserve.edu.hm11.StrUtil;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String text = StrUtil.enterSentence();
        List<String> list = new ArrayList<>();
        list = StrUtil.parseString(text);
        System.out.println(list);
        StrUtil.printTheLongestWord(list);
        System.out.println("Second word in reverse order: " + StrUtil.reverseWord(list, 1));
    }
}
