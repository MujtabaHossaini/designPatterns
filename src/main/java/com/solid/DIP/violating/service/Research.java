package com.solid.DIP.violating.service;

import com.solid.DIP.enums.Relationship;
import com.solid.DIP.model.Person;
import org.javatuples.Triplet;

import java.util.List;

public class Research { // high-level module

    public Research(Relationships relationships)
    {
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();

        relations.stream()
                .filter(x -> x.getValue0().getName().equals("John")
                && x.getValue1().equals(Relationship.PARENT))
                .forEach(ch -> System.out.println(
                        "John has a child called " + ch.getValue2().getName()
                ));

    }


}
