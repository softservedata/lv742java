package com.softserve.edu.homework13.task1;

import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        App app = new App();
        ICoding encrypt = (CodingTest::encrypt);
        ICoding decrypt = (CodingTest::decrypt);

        System.out.println("Encrypted word " + encrypt.code("adddaa", 3));
        System.out.println("Decrypted word " + decrypt.code(encrypt.code("adddaa", 3), 3));
    }
}
