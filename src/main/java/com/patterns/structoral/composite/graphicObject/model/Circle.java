package com.patterns.structoral.composite.graphicObject.model;

import lombok.Data;

@Data
public class Circle extends GraphicObject{

    public Circle(String color) {
        name = "Circle";
        this.color = color;
    }

}
