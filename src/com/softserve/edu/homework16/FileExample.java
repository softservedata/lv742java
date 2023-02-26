package com.softserve.edu.homework16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class FileExample {
    public static void main(String[] args) {
        //Задаем имя входного файла
        String inputFileName  = "C:\\java\\sawa\\lv742java\\src\\com\\softserve\\edu\\homework16\\file1.txt";
        String outputFileName = "C:\\java\\sawa\\lv742java\\src\\com\\softserve\\edu\\homework16\\file2.txt";
        //String fileName="file1.txt";
        //String outputFileName = "file2.txt";
        //Создаем список строк для хранения содержимого входного файла
        ArrayList<String> lines = new ArrayList<>();

        try {
            //Читаем содержимое входного файла
            File inputFile  = new File(inputFileName );
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
            scanner.close();

            //Создаем объект FileWriter для записи информации в выходной файл
            FileWriter Writer = new FileWriter(outputFileName);

            //Записываем количество строк во входном файле в выходной файл
            Writer.write("Number of lines in file1.txt: " + lines.size() + "\n");

            //Находим самую длинную строку во входном файле и записываем ее в выходной файл
            String longestLine = "";
            for (String line : lines) {
                // Writer.write(line + "\n");
                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }
            }
            Writer.write("The longest line in file1.txt: " + longestLine + "\n");

            //Записываем имя и дату рождения в выходной файл
            Writer.write("My name and birthday date: Oleksandr Shcherbakov, 25.09.1996\n");

            //Закрываем FileWriter
            Writer.close();

            // Вывод информации на консоль
            System.out.println("Number of lines in file1.txt: " + lines.size());
            System.out.println("The longest line in file1.txt: " + longestLine);
            System.out.println("My name and birthday date: Oleksandr Shcherbakov, 25.09.1996");

        } catch (FileNotFoundException e) {
            //Обрабатываем исключение, если не удается найти входной файл
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            //Обрабатываем другие исключения, если они возникают
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

