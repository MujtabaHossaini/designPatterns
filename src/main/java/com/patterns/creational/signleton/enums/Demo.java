package com.patterns.creational.signleton.enums;

import com.patterns.creational.signleton.basic.model.BasicSingleton;
import com.patterns.creational.signleton.enums.model.EnumBasedSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

    public static void main(String[] args) throws Exception {

        String fileName = "enum-file.bin";
        EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
        singleton.setValue(10);

        saveToFile(singleton, fileName);


        /**
         * it is not serialized effectively because we wrote 10 in file, but we get 44 (value in the constructor)
         * when we just read from file.
         */
        EnumBasedSingleton singleton2 = readFromFile(fileName);
        System.out.println(singleton2.getValue());


    }

    public static void saveToFile(EnumBasedSingleton enumBasedSingleton, String fileName) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)){
            objectOut.writeObject(enumBasedSingleton);
        }
    }

    public static EnumBasedSingleton readFromFile(String fileName) throws Exception
    {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (EnumBasedSingleton) in.readObject();
        }
    }

}
