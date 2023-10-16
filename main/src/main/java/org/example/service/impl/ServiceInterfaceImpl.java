package org.example.service.impl;

import org.example.container.annotation.Component;
import org.example.data.impl.DataInterfaceImpl;
import org.example.service.ServiceInterface;

@Component
public class ServiceInterfaceImpl implements ServiceInterface {

/*    private final DataInterfaceImpl dataInterface;

    public ServiceInterfaceImpl(DataInterfaceImpl dataInterface) {
        this.dataInterface = dataInterface;
    }
    public String execute() {
        System.out.println("Service complete!");
        return dataInterface.execute();
    }*/
    public ServiceInterfaceImpl(){}

    public String execute() {
        return null;
    }
}
