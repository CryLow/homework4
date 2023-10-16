package org.example.container.configuration;

import org.example.container.annotation.Component;
import org.reflections.Reflections;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

public class ComponentScanner {
    public void loadProperties(Map<String,String> properties){
        try (FileInputStream fileInputStream = new FileInputStream("D:\\homework\\NewTest\\main\\src\\main\\resources\\application.properties")){
            Properties localProperties = new Properties();
            localProperties.load(fileInputStream);
            properties.putAll(localProperties.entrySet().stream()
                    .collect(Collectors.toMap(
                            e->e.getKey().toString(),
                            e->e.getValue().toString()
                    )));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void initialize(String basePackage, Map<String, Object> beans){
        Set<Class<?>> classes = getClassesWithComponentAnnotation(basePackage);
        for(Class<?> myClass : classes){
            try {
                Object bean = myClass.getDeclaredConstructor().newInstance();
                beans.put(bean.getClass().getName(), bean);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
   /* public void initialize(String basePackage, Map<String, Object> beans){
        Reflections scanner = new Reflections(basePackage);
        Set<Class<?>> components = scanner.getTypesAnnotatedWith(Component.class);
        for(Class<?> component : components){
            try {
                Object object = component.getDeclaredConstructor().newInstance();
                beans.put(object.getClass().getName(),object);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        for (var i:
             components) {
            System.out.println(i.toString());
        }
    }*/
    /*public void initialize(String basePackage, Map<String, Object> beans) {
        Reflections scanner = new Reflections(basePackage);
        Set<Class<?>> components = scanner.getTypesAnnotatedWith(Component.class);
        for (Class<?> component : components) {
            try {
                Object object = component.getDeclaredConstructor().newInstance();
                beans.put(object.getClass().getName(), object);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }*/

    private Object createBeanInstance(Object myCLass) throws Exception {
        return myCLass.getClass().getConstructor().newInstance();
    }

    private Set<Class<?>> getClassesWithComponentAnnotation(String basePackage) {
        return new Reflections(basePackage).getTypesAnnotatedWith(Component.class);
    }
}
