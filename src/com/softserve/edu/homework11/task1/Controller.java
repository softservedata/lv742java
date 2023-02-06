package com.softserve.edu.homework11.task1;

public class Controller {
    SentenceService model;
    View view;

    public Controller(SentenceService model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processSentence(){
        String s = view.doInput();
        view.getOutput("Reverse second word: " + model.reverseSecondWord(s));
        view.getOutput("Longest word: " + model.displayLongest(s));
        view.getOutput("The number of its letters is " + model.findNumberOfLetters(s));
    }
}
