package com.softserve.edu.homework09.views;

import com.softserve.edu.utils.NumberValidator;
import com.softserve.edu.utils.OptionValidator;

import java.util.Scanner;

public class ViewApp {
    Scanner scan;

    public int chooseOption1() {
        int[] options = {1, 2, 0};
        scan = new Scanner(System.in);
        System.out.print("""
                --------------------------------------
                Check how to fill the collection:
                            
                1. Fill with random numbers
                2. Enter the value from the keyboard
                0. Close app
                --------------------------------------
                """);
        return OptionValidator.validateOption(scan, options);
    }

    public int chooseOption2() {
        int[] options = {1, 2, 0};
        scan = new Scanner(System.in);
        System.out.print("""
                --------------------------------------         
                1. Add another item
                2. Finish creating
                0. Close app
                --------------------------------------
                """);
        return OptionValidator.validateOption(scan, options);
    }


    public int chooseOption3() {
        int[] options = {1, 2, 3, 4, 5, 6, 0};
        scan = new Scanner(System.in);
        System.out.print("""
                --------------------------------------  
                Select an action over numbers and enter its number:
                            
                1. Swap the maximum and minimum elements in the list
                                
                2. Insert a random three-digit number before the first
                 negative element of the list
                 
                3. Insert a zero between all neighboring elements
                 collection myCollection with different signs
                 
                4. Copy the first k elements of the myCollection to 
                the list1, in direct order, and the rest to the
                 list2 in reverse order.
                 
                5. In a list remove the last even element
                                
                6. Remove from the list the element following
                 the first minimum.
                 
                0. Close app
                --------------------------------------
                """);
        return OptionValidator.validateOption(scan, options);
    }

    public void closeApp() {
        System.out.println("App closed.");
        scan.close();
        System.exit(0);
    }

    public int getNumber() {
        scan = new Scanner(System.in);
        System.out.print("Enter the number of the first elements: ");
        return NumberValidator.validateIntNumber(scan);
    }

    public void getOutput(Object output) {
        System.out.println(output);
    }
}
