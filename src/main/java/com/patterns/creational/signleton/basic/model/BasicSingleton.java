package com.patterns.creational.signleton.basic.model;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

    private static final BasicSingleton INSTANCE
            = new BasicSingleton();

    private int value = 0;


    private BasicSingleton() {
    }

    public static BasicSingleton getInstance()
    {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    /**
     * readResolve() is a property of serialization and specifies the object to resolve into
     * @return
     */
    protected Object readResolve()
    {
        return INSTANCE;
    }

}
