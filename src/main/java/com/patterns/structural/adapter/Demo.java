package com.patterns.structural.adapter;

import com.patterns.structural.adapter.model.Line;
import com.patterns.structural.adapter.model.Point;
import com.patterns.structural.adapter.model.VectorObject;
import com.patterns.structural.adapter.model.VectorRectangle;
import com.patterns.structural.adapter.service.LineToPointAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    private static final List<VectorObject> vectorObjects =
            new ArrayList<>(Arrays.asList(
                    new VectorRectangle(1, 1,10, 10),
                    new VectorRectangle(3, 3, 6, 6)
            ));


    // the API we have
    public static void drawPoint(Point p)
    {
        System.out.println(".");
    }

    private static void draw()
    {
        for (VectorObject vo : vectorObjects) {
            for (Line line : vo) {
                LineToPointAdapter adapter = new LineToPointAdapter(line); // use Adapter to convert data to the required type in drawPoint (API)
                adapter.forEach(Demo::drawPoint);
            }
        }
    }


    public static void main(String[] args) {

        draw();

    }


}
