package com.patterns.structoral.bridge.guice.service;

import com.patterns.structoral.bridge.guice.contract.Renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius " + radius);
    }
}
