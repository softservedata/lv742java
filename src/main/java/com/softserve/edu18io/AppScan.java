package com.softserve.edu18io;

import java.io.File;
import java.util.Scanner;

public class AppScan {
    public static void main(String[] args) {
        File file = new File("c:/Tools/1/test.txt");
        try (Scanner sc = new Scanner(file)) {
            String s;
            while (sc.hasNextLine()) {
                s = sc.nextLine();
                System.out.println(s);
            }
        } catch (Exception e) {
        }
    }
}
