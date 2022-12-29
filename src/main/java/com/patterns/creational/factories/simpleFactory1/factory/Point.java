package com.patterns.creational.factories.simpleFactory1.factory;

public class Point {

    private double x;
    private double y;

    // make constructor private to make sure that user just use static methods
    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public static Point newCartesianPoint(double x, double y)
    {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta)
    {
        return new Point(
                rho * Math.cos(theta),
                theta * Math.sin(theta)
        );
    }

}
