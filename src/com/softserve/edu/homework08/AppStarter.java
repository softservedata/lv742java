package com.softserve.edu.homework08;

import com.softserve.edu.homework08.controllers.CloneController;
import com.softserve.edu.homework08.controllers.Controller;
import com.softserve.edu.homework08.models.Person;
import com.softserve.edu.homework08.models.Student;
import com.softserve.edu.homework08.views.CloneView;
import com.softserve.edu.homework08.views.View;

public class AppStarter {
    public static void startApp() throws CloneNotSupportedException {
        Student model1 = new Student();
        Person.FullName fullName1 = model1.new FullName();
        View view1 = new View(model1, fullName1);
        Controller controller1 = new Controller(model1, view1);
        controller1.runApp();

        Student model2 = new Student();
        Person.FullName fullName2 = model2.new FullName();
        View view2 = new View(model2, fullName2);
        Controller controller2 = new Controller(model2, view2);
        controller2.runApp();

        Student model3 = (Student) model1.clone();
        CloneView view3 = new CloneView(model3);
        CloneController controller3 = new CloneController(model3, view3);
        controller3.runApp();
    }
}
