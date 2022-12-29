package com.patterns.creational.prototype.doNotUseCloneable.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

@Data
@AllArgsConstructor
public class Person implements Cloneable {

    private String[] names;
    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }


    /**
     * it is not a Deep Copy, since names and address are both
     * addresses to objects
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(names.clone(), (Address) address.clone());
    }
}
