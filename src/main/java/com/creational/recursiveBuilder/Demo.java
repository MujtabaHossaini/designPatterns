package com.creational.recursiveBuilder;

import com.creational.recursiveBuilder.model.Person;
import com.creational.recursiveBuilder.service.EmployeeBuilder;
import com.creational.recursiveBuilder.service.PersonBuilder;

public class Demo {

    public static void main(String[] args) {

        PersonBuilder pb = new PersonBuilder();
        Person mujtabaPb = pb
                .withName("mujtaba Person")
                .build();


        EmployeeBuilder eb = new EmployeeBuilder();
        Person mujtabaEb = eb
                .withName("mujtaba Employee")
                .worksAt("Developer")
                .build();

        System.out.println(mujtabaPb);
        System.out.println(mujtabaEb);
    }


}
