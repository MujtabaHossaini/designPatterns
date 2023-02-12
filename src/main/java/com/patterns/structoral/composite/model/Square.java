package com.patterns.structoral.composite.model;

import lombok.Data;

@Data
public class Square extends GraphicObject{

    public Square(String color) {
        name = "Square";
        this.color = color;
    }

}
