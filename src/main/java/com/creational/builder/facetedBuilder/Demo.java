package com.creational.builder.facetedBuilder;

import com.creational.builder.facetedBuilder.model.Person;
import com.creational.builder.facetedBuilder.service.PersonBuilder;

public class Demo {

    public static void main(String[] args) {


        PersonBuilder pb = new PersonBuilder();
        /**
         * since PersonJobBuilder and PersonAddressBuilder
         * both extend PersonBuilder we could easily switch between them
         * without any problems.
         */
        Person person = pb
                .lives()
                    .at("123 London Road")
                    .in("London")
                    .withPostCode("SW12BC")
                .works()
                    .at("Amazon")
                    .asA("Engineer")
                    .earning(123000)
                .build();

        System.out.println(person);
    }


}
