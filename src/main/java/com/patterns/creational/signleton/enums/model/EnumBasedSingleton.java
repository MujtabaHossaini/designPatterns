package com.patterns.creational.signleton.enums.model;

public enum EnumBasedSingleton {
    /**
     * 1- has the problem of Serialization, because only name of the instance is serialized in Enums not the fields!
     * 2- you cannot inherit from it, because it is an Enum.
     */
    INSTANCE;

    private int value;

    // there is no need to write private, because by default it is private
    EnumBasedSingleton() {
        value = 44;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
