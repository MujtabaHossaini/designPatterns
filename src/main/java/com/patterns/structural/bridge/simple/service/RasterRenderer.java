package com.patterns.structural.bridge.simple.service;

import com.patterns.structural.bridge.simple.contract.Renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius " + radius);
    }
}
