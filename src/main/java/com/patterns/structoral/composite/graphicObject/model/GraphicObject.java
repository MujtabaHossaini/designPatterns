package com.patterns.structoral.composite.graphicObject.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class GraphicObject {

    protected String name = "Group";

    public String color;
    public List<GraphicObject> children = new ArrayList<>();

    private void print(StringBuilder stringBuilder, int depth)
    {
        stringBuilder.append(String.join("", Collections.nCopies(depth, "*")))
                .append(depth > 0 ? " " : "")
                .append((color == null || color.isEmpty()) ? "" : color + "")
                .append(getName())
                .append(System.lineSeparator());
        for (GraphicObject child : children) {
            child.print(stringBuilder, depth + 1); // prints objects and children in the same manner
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, 0);
        return sb.toString();
    }
}
