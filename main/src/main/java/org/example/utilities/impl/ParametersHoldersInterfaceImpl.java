package org.example.utilities.impl;

import org.example.container.annotation.Component;
import org.example.utilities.ParametersHolderInterface;
@Component
public class ParametersHoldersInterfaceImpl implements ParametersHolderInterface {

    public static final String someText = "Test text....";

    public String getSomeText() {
        System.out.println("Parameters holder complete!");
        return someText;
    }
}
