package com.creational.builder.simpleBuilder.model;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
public class HtmlElement {

    private String name; // html tag
    private String text; // value of tag
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    private List<HtmlElement> elements = new ArrayList<>();

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public List<HtmlElement> getElements() {
        return elements;
    }

    public void setElements(List<HtmlElement> elements) {
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.toStringImp(0);
    }

    private String toStringImp(int indent)
    {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * this.indentSize, " "));
        sb.append(String.format("%s<%s>%s", i, this.name, this.newLine));
        if (this.text != null && !this.text.isEmpty())
        {
            sb.append(String.join("", Collections.nCopies(this.indentSize*(indent+1), " ")))
                    .append(this.text)
                    .append(this.newLine);
        }

        for (HtmlElement e : this.elements)
            sb.append(e.toStringImp(indent + 1));

        sb.append(String.format("%s</%s>%s", i, this.name, this.newLine));
        return sb.toString();
    }

}
