package org.example.container.injection;

import org.example.container.configuration.ComponentScanner;
import org.example.container.configuration.PropertiesInject;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    private static final ComponentScanner componentScanner = new ComponentScanner();
    private static final PropertiesInject propertiesInject = new PropertiesInject();
    private Map<String,Object> beans = new HashMap<>();
    private Map<String,String> properties = new HashMap<>();
    public Application(List<String> basePackage) throws IllegalAccessException {
        componentScanner.loadProperties(properties);
        for (var packages:
             basePackage) {
        componentScanner.initialize(packages,beans);
        }
        propertiesInject.injectDependencies(beans,properties);

    }

    public <T> T getObject(Class<T> clazz)
    {
        return clazz.cast(beans.get(clazz));

    }
}
