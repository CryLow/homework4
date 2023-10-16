package org.example.data.impl;

import org.example.container.annotation.Component;
import org.example.data.DataInterface;
import org.example.utilities.ParametersHolderInterface;
import org.example.utilities.impl.ParametersHoldersInterfaceImpl;

import javax.xml.crypto.Data;
@Component
public class DataInterfaceImpl implements DataInterface {
    /*private final ParametersHoldersInterfaceImpl parametersHoldersInterface;
    public DataInterfaceImpl(ParametersHoldersInterfaceImpl parametersHoldersInterface){
        this.parametersHoldersInterface = parametersHoldersInterface;
    }

    public String execute() {
        System.out.println("data complete!");
        return parametersHoldersInterface.getSomeText();
    }*/
    public DataInterfaceImpl(){
    }

    public String execute() {
        return null;
    }
}
