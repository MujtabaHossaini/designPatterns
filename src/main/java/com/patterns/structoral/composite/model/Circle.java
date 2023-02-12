package com.patterns.structoral.composite.model;

import lombok.Data;

@Data
public class Circle extends GraphicObject{

    public Circle(String color) {
        name = "Circle";
        this.color = color;
    }

}
