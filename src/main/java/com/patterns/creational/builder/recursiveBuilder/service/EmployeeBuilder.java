package com.patterns.creational.builder.recursiveBuilder.service;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder worksAt(String position)
    {
        person.setPosition(position); // person is protected so we have access to it, it is not private
        return self(); // fluent interface
    }


    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
