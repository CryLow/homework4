package org.example.container.configuration;

import org.example.container.annotation.Autowire;
import org.example.container.annotation.Value;

import java.io.ObjectStreamException;
import java.lang.reflect.Field;
import java.util.Map;

public class PropertiesInject {
    public void injectDependencies(Map<String,Object> beans, Map<String,String> properties) throws IllegalAccessException {
        for(Object bean : beans.values()){
            Class<?> beanClass = bean.getClass();
            Field[] fields = beanClass.getDeclaredFields();
            for(Field field : fields){
                if(field.isAnnotationPresent(Value.class)){
                    injectValue(bean,field,properties);
                }
                if(field.isAnnotationPresent(Autowire.class)){
                    injectDependency(bean,field,beans);
                }
            }
        }
    }

    private void injectDependency(Object bean, Field field, Map<String, Object> beans) throws IllegalAccessException {
        Class<?> fieldType = field.getType();
        Object dependency = beans.get(fieldType.getName());
        if(dependency!=null){
            field.setAccessible(true);
            field.set(bean,dependency);
        }
    }

    private void injectValue(Object bean, Field field, Map<String, String> properties) throws IllegalAccessException {
        Value valueAnnotation = field.getAnnotation(Value.class);
        String propertyName = valueAnnotation.value();
        String propertyValue = properties.get(propertyName);
        if(propertyValue!=null){
            field.setAccessible(true);
            field.set(bean,propertyValue);
        }
    }
}
