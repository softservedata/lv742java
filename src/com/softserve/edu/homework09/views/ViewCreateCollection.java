package com.softserve.edu.homework09.views;

import com.softserve.edu.utils.NumberValidator;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class ViewCreateCollection extends KeyAdapter {

    List<Integer> list;
    Scanner scan;

    public ViewCreateCollection(List<Integer> list) {
        this.list = list;
    }


    public void inputElements() {
        scan = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int element = NumberValidator.validateIntNumber(scan);
        list.add(element);
    }

}
