package com.patterns.creational.builder.facetedBuilder.model;

import lombok.Data;

@Data
public class Person {

    // address
    private String streetAddress;
    private String postCode;
    private String city;

    // employment
    private String companyName;
    private String position;
    private int annualIncome;

    @Override
    public String toString() {
        return "Person{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}
