package com.softserve.homework16;

public class CareerFileMakerApp {
    public static void main(String[] args) {
        CareerFileMaker maker = new CareerFileMaker();
        maker.createNewFile("file1.txt");
        maker.createNewFile("file2.txt");
        maker.extractData("file1.txt");
    }
}
