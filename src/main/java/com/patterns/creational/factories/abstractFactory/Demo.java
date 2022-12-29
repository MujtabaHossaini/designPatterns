package com.patterns.creational.factories.abstractFactory;

import com.patterns.creational.factories.abstractFactory.contract.HotDrink;

public class Demo {

    public static void main(String[] args) throws Exception {

        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink drink = machine.makeDrink();
        drink.Consume();

    }


}
