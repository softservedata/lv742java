package com.softserve.edu.project;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> inList = FileUtil.readTextFileToList("input.txt");
        if (inList.size() == 0) {
            System.out.println("File is empty");
            return;
        }
        OrderBook orderBook = new OrderBook();
        orderBook.parseFromList(inList);
        List<String> outList = orderBook.parseToList();
        if (outList.size() > 0) {
            FileUtil.saveListToTextFile(outList,"output.txt");
        }

        System.out.println("Done");
    }
}