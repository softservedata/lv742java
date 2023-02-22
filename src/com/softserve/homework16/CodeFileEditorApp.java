package com.softserve.homework16;

import java.io.IOException;

public class CodeFileEditorApp {

    public static void main(String[] args) throws IOException {
        CodeFileEditor editor = new CodeFileEditor();
        String replace = editor.replace();
        editor.writeToTextFile("code_modified.txt", replace);
    }
}
