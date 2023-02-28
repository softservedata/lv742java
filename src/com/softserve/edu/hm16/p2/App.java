package com.softserve.edu.hm16.p2;

import com.softserve.edu.hm16.FileUtil;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = FileUtil.ReadTextFileToList("./example/Employee.java");
        FileUtil.SaveListToTextFile(FileUtil.doPrivate(list), "./example/Employee_private.java");
    }
}
