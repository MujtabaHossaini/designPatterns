package com.patterns.structoral.composite.graphicObject;

import com.patterns.structoral.composite.graphicObject.model.Circle;
import com.patterns.structoral.composite.graphicObject.model.GraphicObject;
import com.patterns.structoral.composite.graphicObject.model.Square;

public class Demo {

    public static void main(String[] args) {

        GraphicObject drawing = new GraphicObject();
        drawing.setName("My Drawing");
        drawing.children.add(new Circle("Red"));
        drawing.children.add(new Square("Yellow"));


        GraphicObject group = new GraphicObject();
        group.children.add(new Square("Blue"));
        group.children.add(new Circle("Blue"));

        drawing.children.add(group);

        System.out.println(drawing);


    }


}
