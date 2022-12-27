package com.creational.builder;

import com.creational.builder.service.HtmlBuilder;

public class Demo {

    public static void main(String[] args) {

        HtmlBuilder builder = new HtmlBuilder("ul"); // ul = unordered list
        builder
                .addChild("li", "Hello")
                .addChild("li", "World"); // li = list item;

        System.out.println(builder);


    }


}
