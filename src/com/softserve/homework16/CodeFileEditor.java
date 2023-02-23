package com.softserve.homework16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class CodeFileEditor {

    public String readTextFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public String replace() throws IOException {
        return readTextFile("code_original.txt")
                .replaceAll("public", "private")
                .replaceAll("private class", "public class");
    }

    public void writeToTextFile(String fileName, String content) throws IOException {
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
    }


}
