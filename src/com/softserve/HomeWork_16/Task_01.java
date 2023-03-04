package com.softserve.HomeWork_16;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task_01 {

    public static List<String> writeIntoArray(String fileName) {
        List<String> result = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            result = bufferedReader.lines().collect(Collectors.toList());
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("EXCEPTION: writting into array");
        }
        return result;
    }

    public static void writeIntoFile(List<String> list) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file2.txt"));
            bufferedWriter.write(list.size() + "\n");
            bufferedWriter.write(list.stream().max(Comparator.comparing(String::length)).toString() + "\n");
            bufferedWriter.write("Maksym Fartushok 05.05.2005");
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("EXCEPTION: writting into file");
        }
    }

    public static void main(String[] args) {
        System.out.println(Task_01.writeIntoArray("file1.txt"));
        writeIntoFile(Task_01.writeIntoArray("file1.txt"));
    }
}
