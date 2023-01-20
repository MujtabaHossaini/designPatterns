package com.patterns.structural.bridge.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.patterns.structural.bridge.guice.bridge.Circle;
import com.patterns.structural.bridge.guice.module.ShapeModule;

public class Demo {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new ShapeModule());
        Circle instance = injector.getInstance(Circle.class);
        instance.setRadius(3);
        instance.draw();
        instance.resize(2);
        instance.draw();


    }


}
