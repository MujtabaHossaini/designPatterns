package com.patterns.creational.factories.abstractFactory;

import com.patterns.creational.factories.abstractFactory.contract.HotDrink;

public class Coffee implements HotDrink {
    @Override
    public void Consume() {
        System.out.println("This Coffee is delicious.");
    }
}
