package com.solid.DIP.notViolating.service;

import com.solid.DIP.model.Person;
import com.solid.DIP.notViolating.service.contract.RelationshipBrowser;

import java.util.List;

public class Research {

    public Research(RelationshipBrowser browser)
    {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children)
            System.out.println("John has a child called " + child.getName());
    }


}
