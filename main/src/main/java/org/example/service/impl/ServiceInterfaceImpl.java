package org.example.service.impl;

import org.example.container.annotation.Autowire;
import org.example.container.annotation.Component;
import org.example.data.DataInterface;
import org.example.data.impl.DataInterfaceImpl;
import org.example.service.ServiceInterface;

@Component
public class ServiceInterfaceImpl implements ServiceInterface {

    @Autowire
    private DataInterface dataInterface;


    public String execute() {
        return dataInterface.execute();
    }
}
