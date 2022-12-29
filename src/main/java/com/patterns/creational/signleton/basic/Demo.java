package com.patterns.creational.signleton.basic;

import com.patterns.creational.signleton.basic.model.BasicSingleton;

import java.io.*;

public class Demo {

    public static void main(String[] args) throws Exception {

        /**
         * problems with this approach are:
         * 1. reflection -> we can easily call constructor
         * 2. serialization
         */

        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(10);
        System.out.println(singleton.getValue());


        String fileName = "singleton.bin";
        saveToFile(singleton, fileName);

        singleton.setValue(444);

        BasicSingleton singleton2 = readFromFile(fileName);

        System.out.println(singleton == singleton2);


        /**
         * if readSolve() is not in BasicSingleton, singleton objects will be differed.
         */
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());

    }


    public static void saveToFile(BasicSingleton basicSingleton, String fileName) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)){
            objectOut.writeObject(basicSingleton);
        }
    }

    public static BasicSingleton readFromFile(String fileName) throws Exception
    {
        try (FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (BasicSingleton) in.readObject();
        }
    }

}
