package org.example.container.ap;

import org.example.container.injection.Application;

import java.util.List;

public class Starter {
    public static Application run(List<String> basePackage){
        return new Application(basePackage);
    }
}
