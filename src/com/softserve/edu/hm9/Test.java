package com.softserve.edu.hm9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*List<String> list = Arrays.asList("A");
        System.out.println("sadfasf");
        //list.add("A");
        list.clear();
        System.out.println(list);*/
        String s1 = "1\\";
        String s2 = "2\\";
        String str = s1.concat("".concat(s2));
        str = str.replace('\\','_');
        System.out.println(str);
    }
}
