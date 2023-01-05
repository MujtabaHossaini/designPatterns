package com.patterns.creational.signleton.multiton.model;

import com.patterns.creational.signleton.multiton.enums.Subsystem;

import java.util.HashMap;

public class Printer {

    private Printer() {
        instanceCount++;
        System.out.println("A total of "
            + instanceCount + " instances created so far.");
    }

    private static int instanceCount = 0;


    private static HashMap<Subsystem, Printer>
        instances = new HashMap<>();

    /**
     * we limit the number of Printer instances
     * @param ss
     * @return
     */
    public static Printer get(Subsystem ss)
    {
        if(instances.containsKey(ss)) // limit instances to three
            return instances.get(ss);

        // Lazy loading -> Printer is created whenever somebody asks for it.
        Printer printer = new Printer();
        instances.put(ss, printer);
        return printer;
    }


}
