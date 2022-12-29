package com.solid.DIP.violating;

import com.solid.DIP.model.Person;
import com.solid.DIP.violating.service.Relationships;
import com.solid.DIP.violating.service.Research;

public class Demo {

    public static void main(String[] args) {

        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        // low-level module
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);


    }


}
