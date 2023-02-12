package com.softserve.edu.homework12.practicaltask.task1;

public class App {

    public static void main(String[] args) {
        Rectangle model = new Rectangle();
        View view = new View();
        Controller controller = new Controller(view, model);
        controller.getArea();
    }
}
