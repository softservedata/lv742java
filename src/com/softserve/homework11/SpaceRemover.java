package com.softserve.homework11;

public class SpaceRemover {

    public static void main(String[] args) {
        SpaceRemover spaceRemover = new SpaceRemover();
        spaceRemover.removeSpace();
    }

    public void removeSpace() {
        String text = "Hello      great  world";
        System.out.println(text);
        String result = text.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}
