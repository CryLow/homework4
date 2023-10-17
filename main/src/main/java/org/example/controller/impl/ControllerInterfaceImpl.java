package org.example.controller.impl;

import org.example.container.annotation.Autowire;
import org.example.container.annotation.Component;
import org.example.container.annotation.Value;
import org.example.controller.ControllerInterface;
import org.example.service.ServiceInterface;
import org.example.service.impl.ServiceInterfaceImpl;

@Component
public class ControllerInterfaceImpl implements ControllerInterface {
    @Autowire
    private ServiceInterface serviceInterface;

    public void start() {
        System.out.println(serviceInterface.execute());
    }
}