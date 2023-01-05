package com.patterns.creational.signleton.innerStatic.model;

public class InnerStaticSingleton {

    private InnerStaticSingleton(){}


    private static class Impl {

        // inner classes can access outer class private fields
        private static final InnerStaticSingleton
            INSTANCE = new InnerStaticSingleton();

    }


    // it is Thread-Safe and avoids the problems of Synchronization
    public InnerStaticSingleton getInstance()
    {
        return Impl.INSTANCE;
    }
}
