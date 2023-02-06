package com.softserve.edu.homework11.task2;



public class Controller {
    SentenceService model;
    View view;

    public Controller(SentenceService model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processSentence(){
        String s = view.doInput();
        view.getOutput("Converted sentence: " + model.convertSentence(s));
    }
}
