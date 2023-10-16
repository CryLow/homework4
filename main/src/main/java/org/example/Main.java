package org.example;

import org.example.container.ap.Starter;
import org.example.container.injection.Application;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Application application = Starter.run(List.of("org.example"));
    }
}
