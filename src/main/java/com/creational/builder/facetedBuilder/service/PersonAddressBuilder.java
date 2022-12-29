package com.creational.builder.facetedBuilder.service;

import com.creational.builder.facetedBuilder.model.Person;

public class PersonAddressBuilder extends PersonBuilder{

    public PersonAddressBuilder(Person person)
    {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddr)
    {
        this.person.setStreetAddress(streetAddr);
        return this;
    }


    public PersonAddressBuilder withPostCode(String postCode)
    {
        this.person.setPostCode(postCode);
        return this;
    }

    public PersonAddressBuilder in(String city)
    {
        this.person.setCity(city);
        return this;
    }

}
