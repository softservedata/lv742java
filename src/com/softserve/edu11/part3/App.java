package com.softserve.edu11.part3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        text = sc.nextLine();
        String pattern = "\\$(\\d+\\.\\d{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        System.out.println();
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + " ");
        }
    }
}
