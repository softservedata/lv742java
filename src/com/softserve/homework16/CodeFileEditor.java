package com.softserve.homework16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;


public class CodeFileEditor {

    public String readTextFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public String replace() throws IOException {
        String s = readTextFile("code_original.txt");
        List<String> original = List.of(s);
        List<String> replacement = original.stream()
                .map(s2 -> s2.replaceAll("public", "private"))
                .map(s2 -> s2.replaceAll("private class", "public class"))
                .collect(Collectors.toList());
        return String.valueOf(replacement);
    }

    public void writeToTextFile(String fileName, String content) throws IOException {
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
    }


}
