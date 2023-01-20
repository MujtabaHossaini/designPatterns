package com.patterns.structural.bridge.simple.service;

import com.patterns.structural.bridge.simple.contract.Renderer;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing circle of radius: " + radius);
    }
}
