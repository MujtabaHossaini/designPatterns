package com.patterns.structoral.bridge.simple.bridge;


import com.patterns.structoral.bridge.simple.bridge.Shape;
import com.patterns.structoral.bridge.simple.contract.Renderer;

public class Circle extends Shape {

    protected float radius;

    public Circle(Renderer renderer) {
        super(renderer);
    }

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void resize(float factor) {
        radius *= factor;
    }
}
