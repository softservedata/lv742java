package com.softserve.edu.hm16;

import com.softserve.edu.hm6.p2.Employee;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {
    static public List<String> ReadTextFileToList(String fileName) {
        List<String> aList = new ArrayList<>(100);

        String line = null;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                aList.add(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file '" + fileName + "'");
            }
        }
        return aList;
    }

    static public List<String> doWork(List<String> inList) {
        List<String> outList = new ArrayList<>();

        outList.add("Number of lines is " + inList.size() + "\n");
        outList.add("Longest line is '" + Collections.max(inList, (s1, s2) -> s1.length() - s2.length()) + "'\n");
        outList.add("Name is Constantin Klius\n");
        outList.add("Birthday is 28.01.1987\n");
        return outList;
    }

    static public List<String> doPrivate(List<String> inList) {
        List<String> outList = new ArrayList<>();
        for (String el : inList) {
            outList.add(el.replaceAll("public", "private") + '\n');
        }
        return outList;
    }

    static public void SaveListToTextFile(List<String> aList, String fileName) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < aList.size(); i++) {
                bufferedWriter.write(aList.get(i));
            }
        } catch (IOException ex) {
            System.out.println("Error writing to file '" + fileName + "'");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing to file '" + fileName + "'");
            }
        }
    }
}