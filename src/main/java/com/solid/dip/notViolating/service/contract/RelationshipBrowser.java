package com.solid.dip.notViolating.service.contract;

import com.solid.dip.model.Person;

import java.util.List;

public interface RelationshipBrowser {


    List<Person> findAllChildrenOf(String name);

}
