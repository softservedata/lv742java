package com.softserve.edu.homework11.task1;

public class AppStarter {


    public static void startApp(){
        View view = new View();
        SentenceService model = new SentenceService();
        Controller controller = new Controller(model, view);
        controller.processSentence();
    }
}
