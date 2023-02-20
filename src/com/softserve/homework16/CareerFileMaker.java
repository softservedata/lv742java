package com.softserve.homework16;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class CareerFileMaker {

    public void createNewFile(String filename) {
        try {
            File myFile = new File(filename);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File with name " + myFile.getName() + " already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    public void extractData(String filename) {
        String[] array = readFile(filename);
        writeFile(array);
    }

    private void writeFile(String[] array) {
        long linesNumber = getLinesNumber(array);
        String longestLine = getLongestLine(array);
        String name = getName(array);
        String birthDate = getBirthDate(array);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));
            writer.write(String.valueOf(linesNumber));
            writer.write("\n" + longestLine);
            writer.write("\n" + name);
            writer.write("\n" + birthDate);
            System.out.println("Successfully wrote to the file");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    private String[] readFile(String filename) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                arrayList.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arrayList.toArray(new String[0]);
    }


    private String getBirthDate(String[] array) {
        String birthdayString = Arrays.stream(array)
                .filter(s -> s.contains("birth") || s.contains("birthdate") || s.contains("birthday"))
                .findAny().orElseThrow(NoSuchElementException::new);
        return findDate(birthdayString);
    }

    private String findDate(String birthdayString) {
        String[] words = birthdayString.split(" ");
        String s2 = Arrays.stream(words)
                .filter(s -> s.matches("\\d+.\\d+.\\d+."))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        return s2.replaceAll(".$", " ");
    }

    private String getName(String[] array) {
        return Arrays.stream(array)
                .filter(s -> s.contains("Tetiana") && s.contains("Divnych"))
                .map(s -> s.substring(11, 26))
                .findAny().orElseThrow(NoSuchElementException::new);
    }

    private String getLongestLine(String[] array) {
        return Arrays.stream(array)
                .max(Comparator.comparing(String::length))
                .orElseThrow(NoSuchElementException::new);
    }

    private long getLinesNumber(String[] array) {
        return Arrays.stream(array).count();
    }

}
