package com.patterns.creational.signleton.staticBlock;

import com.patterns.creational.signleton.staticBlock.model.StaticBlockSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

    public static void main(String[] args) throws Exception {

        StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
        singleton.setValue(10);

        String fileName = "static-singleton.bin";
        saveToFile(singleton, fileName);

        singleton.setValue(444);

        StaticBlockSingleton singleton2 = readFromFile(fileName);

        System.out.println(singleton == singleton2); // false -> objects are not the same

        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());


    }

    public static void saveToFile(StaticBlockSingleton staticBlockSingleton, String fileName) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)){
            objectOut.writeObject(staticBlockSingleton);
        }
    }

    public static StaticBlockSingleton readFromFile(String fileName) throws Exception
    {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (StaticBlockSingleton) in.readObject();
        }
    }

}
