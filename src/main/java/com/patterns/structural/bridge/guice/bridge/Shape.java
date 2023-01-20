package com.patterns.structural.bridge.guice.bridge;

import com.patterns.structural.bridge.guice.contract.Renderer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Shape {

    protected Renderer renderer;


    public abstract void draw();
    public abstract void resize(float factor);

}
