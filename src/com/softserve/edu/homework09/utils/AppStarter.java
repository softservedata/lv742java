package com.softserve.edu.homework09.utils;

import com.softserve.edu.homework09.controllers.AppController;
import com.softserve.edu.homework09.models.AppModel;
import com.softserve.edu.homework09.views.ViewApp;

public class AppStarter {

    static AppModel model = new AppModel();
    static ViewApp viewApp = new ViewApp();
    static AppController controller = new AppController(viewApp, model);

    public static void startApp() throws InterruptedException {
        controller.run();
    }

    public static void choose3() {
        controller.choose3(viewApp.chooseOption3());
    }

    public static void choose2() {
        controller.choose2(viewApp.chooseOption2());
    }

}
