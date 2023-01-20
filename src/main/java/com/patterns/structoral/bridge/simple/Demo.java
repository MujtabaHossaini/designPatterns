package com.patterns.structoral.bridge.simple;

import com.patterns.structoral.bridge.simple.bridge.Circle;
import com.patterns.structoral.bridge.simple.service.RasterRenderer;
import com.patterns.structoral.bridge.simple.service.VectorRenderer;

public class Demo {

    public static void main(String[] args) {

        RasterRenderer raster = new RasterRenderer();
        VectorRenderer vector = new VectorRenderer();

        Circle circle = new Circle(vector, 5);
        circle.draw();
        circle.resize(2);
        circle.draw();

    }


}
