package com.softserve.homework9.practicaltask;

import java.util.List;

public class CollectionEditorApp {

    public static void main(String[] args) {
        CollectionEditor editor = new CollectionEditor();
        List<Integer> nums = editor.createCollection();
        System.out.println("MyCollection: " + nums);
        editor.printNewCollection(nums);
        editor.removeElements(nums);
        editor.insertElements(nums);
        editor.sortAndPrintCollection(nums);
    }
}
