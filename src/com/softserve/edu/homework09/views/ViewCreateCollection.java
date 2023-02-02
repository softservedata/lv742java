package com.softserve.edu.homework09.views;

import com.softserve.edu.utils.NumberValidator;

import java.util.List;
import java.util.Scanner;

public class ViewCreateCollection{

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
