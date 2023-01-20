package com.patterns.structural.bridge.simple.bridge;

import com.patterns.structural.bridge.simple.contract.Renderer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Shape {

    protected Renderer renderer;


    public abstract void draw();
    public abstract void resize(float factor);

}
