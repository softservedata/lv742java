package com.softserve.edu04person;

public class Main1 {
    public static void main(String[] args) {
        int width = 25, height = 10;
        System.out.println("width = " + width + "\theight = " + height);
        swap(width, height);
        System.out.println("width = " + width + "\theight = " + height);
    }

    public static void swap(int w, int h) {
        int temp = w;
        w = h;
        h = temp;
        System.out.println("width = " + w + "\theight = " + h);
    }
}
