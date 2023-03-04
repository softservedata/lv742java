package com.softserve.HomeWork_16;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Task_02 {

    public static void publicToPrivate(String fileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            List<String> arrayList = bufferedReader
                    .lines()
                    .map(x -> x.replaceAll("public", "private"))
                    .collect(Collectors.toList());

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (String s : arrayList) {
                bufferedWriter.write(s + "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("ERROR: changing public to private");
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "codeFile.txt";
        Task_02.publicToPrivate(fileName);
    }
}
