package com.softserve.edu.homework07;

import com.softserve.edu.homework07.controllers.AppController;
import com.softserve.edu.homework07.models.AppModel;
import com.softserve.edu.homework07.views.AppView;

public class AppStarter {
    public static void appStart() {
        AppModel model = new AppModel();
        AppView view = new AppView();
        AppController controller = new AppController( model, view);
        controller.run();
    }
}
