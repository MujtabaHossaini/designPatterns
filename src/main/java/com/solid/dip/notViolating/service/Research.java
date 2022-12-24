package com.solid.dip.notViolating.service;

import com.solid.dip.model.Person;
import com.solid.dip.notViolating.service.contract.RelationshipBrowser;

import java.util.List;

public class Research {

    public Research(RelationshipBrowser browser)
    {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children)
            System.out.println("John has a child called " + child.getName());
    }


}
