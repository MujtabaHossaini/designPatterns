package com.creational.factories.simpleFactory2;

import com.creational.factories.simpleFactory2.factory.Point;

public class Demo {

    public static void main(String[] args) {

        Point point = Point.PointFactory.newPolarPoint(2, 4);

    }


}
