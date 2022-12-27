package com.creational.recursiveBuilder.model;

import lombok.Data;

@Data
public class Person {

    private String name;
    private String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
