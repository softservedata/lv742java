package com.softserve.edu.hm13;

import com.softserve.edu.hm11.StrUtil;

import java.util.List;

public class App1 {
    public static void main(String[] args) {
        String text = StrUtil.enterSentence();
        List<String> list = UtilFuncAndDate.parseString(text);

        System.out.println("List with string: ");
        System.out.println(list);

        int index = 0;
        for (String el : list) {
            list.set(index++, UtilFuncAndDate.encrypt(el, 3));
        }
        System.out.println("Encrypted list: ");
        System.out.println(list);

        index = 0;
        for (String el : list) {
            list.set(index++, UtilFuncAndDate.decrypt(el, 3));
        }
        System.out.println("Decrypted list: ");
        System.out.println(list);
    }
}
