package com.patterns.creational.builder.recursiveBuilder.service;

import com.patterns.creational.builder.recursiveBuilder.model.Person;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person = new Person();

//    public PersonBuilder withName(String name)
    public SELF withName(String name)
    {
        person.setName(name);
        return self(); // fluent interface
    }


    public Person build()
    {
        return person; // to return person we add this method
    }

    /**
     * to override the behavior of SELF in derived classes we do this
     * @return
     */
    protected SELF self()
    {
        return (SELF) this;
    }


}
