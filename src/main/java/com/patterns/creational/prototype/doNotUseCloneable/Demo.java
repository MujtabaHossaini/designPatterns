package com.patterns.creational.prototype.doNotUseCloneable;

import com.patterns.creational.prototype.doNotUseCloneable.model.Address;
import com.patterns.creational.prototype.doNotUseCloneable.model.Person;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person mujtaba = new Person(new String[]{"Mujtaba", "Smith"},
                new Address("London Road", 123));

        Person morteza = (Person) mujtaba.clone();
        morteza.getNames()[0] = "Morteza";
        morteza.getAddress().setHouseNumber(124);

        System.out.println(mujtaba);
        System.out.println(morteza);



    }


}
