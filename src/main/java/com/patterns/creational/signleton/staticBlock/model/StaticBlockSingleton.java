package com.patterns.creational.signleton.staticBlock.model;

import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

@Data
public class StaticBlockSingleton implements Serializable {

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing ...");
        File.createTempFile(".", "."); // invalid operation -> throws exception
    }

    private int value = 0;
    private static StaticBlockSingleton instance; // not final

    // eager initialization -> object is created before getInstance() method is called
    static {
        /**
         * this approach is used when the constructor may throw exceptions
         */
        try {
            instance = new StaticBlockSingleton();
        }
        catch (IOException e) {
            System.out.println("failed to create singleton.");
        }
    }

    public static StaticBlockSingleton getInstance()
    {
        /**
         * we can have additional access management of object in here,
         * for example object pooling
         */
        return instance;
    }



}
