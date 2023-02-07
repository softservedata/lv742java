package com.softserve.HomeWork_11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_03 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[$][\\d]+[.][\\d]{2}");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Matcher m = p.matcher(sentence);
        while (m.find()) {
            System.out.print(sentence.substring(m.start(), m.end()) + "\n");
        }
    }
}
