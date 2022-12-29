package com.solid.OCP.model;

import com.solid.OCP.enums.Color;
import com.solid.OCP.enums.Size;
import lombok.Getter;

@Getter
public class Product {

    private String name;
    private Color color;
    private Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "- " + name + " color is " + color;
    }
}
