package com.patterns.creational.signleton.lazy.model;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton()
    {
        System.out.println("Lazy Singleton is initializing ... ");
    }

    /**
     * Lazy -> instance created when getInstance() is caleed
     * @return
     */
//    public static LazySingleton getInstance()
//    {
//        if (instance == null) { // Race condition problem -> called from multiple threads at the same time
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    /**
     * Race condition is solved but synchronized does not have a good performance
     * @return
     */
//    public static synchronized LazySingleton getInstance()
//    {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }


    /**
     * double check method -> it is old, and you should not use
     * @return
     */
    public static synchronized LazySingleton getInstance()
    {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


}
