package com.patterns.creational.signleton.monostate.model;

public class ChiefExecutiveOfficer {

    /**
     * Monostate is not a good approach , because you can create new instance, and you have no clue that you are using the same object
     */


    private static String name;
    private static int age;


    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        ChiefExecutiveOfficer.name = name;
    }

    public  int getAge() {
        return age;
    }

    public  void setAge(int age) {
        ChiefExecutiveOfficer.age = age;
    }

    @Override
    public String toString() {
        return "ChiefExecutiveOfficer{"
                + "name= '" + name + "'"
                + ", age= '" + age + "'"
                + "}";
    }
}
