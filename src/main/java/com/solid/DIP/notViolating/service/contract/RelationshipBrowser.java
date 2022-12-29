package com.solid.DIP.notViolating.service.contract;

import com.solid.DIP.model.Person;

import java.util.List;

public interface RelationshipBrowser {


    List<Person> findAllChildrenOf(String name);

}
