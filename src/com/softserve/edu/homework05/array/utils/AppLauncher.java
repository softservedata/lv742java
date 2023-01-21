package com.softserve.edu.homework05.array.utils;

import com.softserve.edu.homework05.array.controllers.Controller;
import com.softserve.edu.homework05.array.models.AppModel;
import com.softserve.edu.homework05.array.views.View;

public class AppLauncher {

    public static void launchApp() {
        AppModel model = new AppModel();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.run();
    }
}
