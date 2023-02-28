package com.softserve.edu.hm16.p1;

import com.softserve.edu.hm16.FileUtil;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = FileUtil.ReadTextFileToList("./example/apache-2.0.txt");
        FileUtil.SaveListToTextFile(FileUtil.doWork(list), "./example/file2.txt");
    }
}
