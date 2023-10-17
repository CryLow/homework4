package org.example.data.impl;

import org.example.container.annotation.Autowire;
import org.example.container.annotation.Component;
import org.example.data.DataInterface;
import org.example.utilities.ParametersHolderInterface;
import org.example.utilities.impl.ParametersHoldersInterfaceImpl;

import javax.xml.crypto.Data;
@Component
public class DataInterfaceImpl implements DataInterface {
    @Autowire
    private ParametersHolderInterface parametersHolderInterface;


    public String execute() {
        return parametersHolderInterface.getSomeText();
    }
}
