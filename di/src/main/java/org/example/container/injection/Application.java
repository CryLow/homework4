package org.example.container.injection;

import org.example.container.configuration.ComponentScanner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    private static final ComponentScanner componentScanner = new ComponentScanner();
    private Map<String,Object> beans = new HashMap<>();
    private Map<String,String> properties = new HashMap<>();
    public Application(List<String> basePackage) {
        componentScanner.loadProperties(properties);
        for (var packages:
             basePackage) {
        componentScanner.initialize(packages,beans);
        }
    }
}
