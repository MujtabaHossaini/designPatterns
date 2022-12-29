package com.patterns.creational.prototype.copyConstructor;

import com.patterns.creational.prototype.copyConstructor.model.Address;
import com.patterns.creational.prototype.copyConstructor.model.Employee;

public class Demo {

    public static void main(String[] args) {

        Employee mujtaba = new Employee("Mujtaba",
                new Address("123 London Road", "London", "UK"));

        Employee morteza = new Employee(mujtaba);
        morteza.setName("Morteza");
        morteza.getAddress().setCity("Manchester");

        System.out.println(mujtaba);
        System.out.println(morteza);
    }



}
