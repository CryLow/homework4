package org.example;

import org.example.container.ap.Starter;
import org.example.container.injection.Application;
import org.example.controller.ControllerInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Application application = Starter.run(List.of("org.example"));
        ControllerInterface controllerInterface = application.getObject(ControllerInterface.class);
        controllerInterface.start();
    }
}
