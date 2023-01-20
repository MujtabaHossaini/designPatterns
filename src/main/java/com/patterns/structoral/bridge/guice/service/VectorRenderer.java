package com.patterns.structoral.bridge.guice.service;

import com.patterns.structoral.bridge.guice.contract.Renderer;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing circle of radius: " + radius);
    }
}
