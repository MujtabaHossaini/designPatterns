package com.patterns.creational.prototype.copyConstructor.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {

    private String name;
    private Address address;

    // Copy Constructor
    public Employee(Employee other) {
        this.name = other.getName();
        this.address = new Address(other.getAddress()); // Address has copy constructor
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
