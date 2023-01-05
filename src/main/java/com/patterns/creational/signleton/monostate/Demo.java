package com.patterns.creational.signleton.monostate;

import com.patterns.creational.signleton.monostate.model.ChiefExecutiveOfficer;

public class Demo {

    public static void main(String[] args) {

        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
        ceo.setName("Mujtaba");
        ceo.setAge(28);

        ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
        System.out.println(ceo);

    }



}
