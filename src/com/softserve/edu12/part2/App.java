package com.softserve.edu12.part2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class IntOutOfRange extends IndexOutOfBoundsException { }

public class App {
    public static void main(String[] args) {
        readNumber(5, 20);
        // =============================================================
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = readNumber(1, 100);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int readNumber(int start, int end){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter num in range from " + start + " to " + end + ": ");
            int num = sc.nextInt();

            if(num > end || num < start){
                throw new IntOutOfRange();
            } else {
                return num;
            }
        } catch (InputMismatchException ex){
            System.out.println("Exception was found:" + ex + "\n Please enter num of correct type");
            return readNumber(start, end);
        } catch (IntOutOfRange ex){
            System.out.println("Exception was found:" + ex + "\n Please enter num in range between start and end");
            return readNumber(start, end);
        } catch (Exception ex){
            System.out.println("Exception was found:" + ex);
            return readNumber(start, end);
        }
    }

}
