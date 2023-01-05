package com.patterns.creational.signleton.testability;

import com.patterns.creational.signleton.testability.service.SingletonRecordFinder;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Demo {


    @Test
    public void singletonTotalPopulationTest()
    {
        SingletonRecordFinder rf = new SingletonRecordFinder();
        List<String> cities = List.of("Tokyo", "Mexico City");
        int tp = rf.getTotalPopulation(cities);
        assertEquals(33200000 + 17400000, tp);
    }



}
