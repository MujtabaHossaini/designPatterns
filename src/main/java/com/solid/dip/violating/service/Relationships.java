package com.solid.dip.violating.service;

import com.solid.dip.enums.Relationship;
import com.solid.dip.model.Person;
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

public class Relationships { // low-level module

    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child)
    {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
    }
}
