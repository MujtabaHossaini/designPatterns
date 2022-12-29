package com.creational.factories.abstractFactory;

import com.creational.factories.abstractFactory.contract.HotDrink;

public class Tea implements HotDrink {
    @Override
    public void Consume() {
        System.out.println("This Tea is delicious.");
    }
}
