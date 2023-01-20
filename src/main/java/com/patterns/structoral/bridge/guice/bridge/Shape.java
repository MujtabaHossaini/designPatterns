package com.patterns.structoral.bridge.guice.bridge;

import com.patterns.structoral.bridge.guice.contract.Renderer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Shape {

    protected Renderer renderer;


    public abstract void draw();
    public abstract void resize(float factor);

}
