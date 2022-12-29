package com.patterns.creational.prototype.copyConstructor.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {

    private String streetAddress;
    private String city;
    private String country;

    // Copy Constructor
    public Address(Address other) {
        this(other.getStreetAddress(), other.city, other.getCountry());
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
