package com.softserve.edu.homework13;

public class main {
    public static void main(String[] args) {
        String originalString = "hello world";
        int n = 3;

        String encryptedString = string.encrypt(originalString, n);
        System.out.println("Encrypted string: " + encryptedString);

        String decryptedString = string.decrypt(encryptedString, n);
        System.out.println("Decrypted string: " + decryptedString);
    }
}
