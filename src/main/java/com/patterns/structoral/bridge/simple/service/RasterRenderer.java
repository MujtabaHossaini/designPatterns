package com.patterns.structoral.bridge.simple.service;

import com.patterns.structoral.bridge.simple.contract.Renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius " + radius);
    }
}
