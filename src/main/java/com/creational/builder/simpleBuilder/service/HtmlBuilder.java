package com.creational.builder.simpleBuilder.service;

import com.creational.builder.simpleBuilder.model.HtmlElement;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        this.root.setName(rootName);
    }

    public HtmlBuilder addChild(String childName, String childText)
    {
        HtmlElement e = new HtmlElement(childName, childText);
        this.root.getElements().add(e);
        return this; // reference to the original builder
    }


    public void clear()
    {
        this.root = new HtmlElement();
        root.setName(this.rootName);
    }

    @Override
    public String toString() {
        return this.root.toString();
    }
}
