package com.patterns.structoral.bridge.guice.bridge;


import com.google.inject.Inject;
import com.patterns.structoral.bridge.guice.contract.Renderer;


public class Circle extends Shape {

    protected float radius;

    @Inject // choose a constructor for injection
    public Circle(Renderer renderer) {
        super(renderer);
    }

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
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
