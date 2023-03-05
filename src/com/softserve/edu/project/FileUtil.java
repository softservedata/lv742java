package com.softserve.edu.project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    static public List<String> readTextFileToList(String fileName) {
        List<String> aList = new ArrayList<>(100);

        String line = null;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                aList.add(line.trim());
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

    static public void saveListToTextFile(List<String> aList, String fileName) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < aList.size(); i++) {
                bufferedWriter.write(aList.get(i) + '\n');
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
