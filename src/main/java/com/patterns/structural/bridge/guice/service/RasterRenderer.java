package com.patterns.structural.bridge.guice.service;

import com.patterns.structural.bridge.guice.contract.Renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius " + radius);
    }
}
