package org.example.controller.impl;

import org.example.container.annotation.Component;
import org.example.container.annotation.Value;
import org.example.controller.ControllerInterface;
import org.example.service.impl.ServiceInterfaceImpl;

@Component
public class ControllerInterfaceImpl implements ControllerInterface {

    public ControllerInterfaceImpl() {
    }
    @Value("some")
    public String someValue;
    /*private final ServiceInterfaceImpl serviceInterface;

    public ControllerInterfaceImpl(ServiceInterfaceImpl serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    public void run(){
        System.out.println("Controller running...");
        System.out.println(serviceInterface.execute());
    }*/
}
