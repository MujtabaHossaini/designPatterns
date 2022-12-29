package com.solid.LSP;

import com.solid.LSP.factory.RectangleFactory;
import com.solid.LSP.model.Rectangle;
import com.solid.LSP.model.Square;

public class Demo {

    public static void useIt(Rectangle r)
    {
        int width = r.getWidth();
        r.setHeight(10);
        // area = width * 10
        System.out.println(
                "Expected area of " + (width * 10) +
                        " , got " + r.getArea()
        );
    }


    public static void main(String[] args) {

        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        Square sq = new Square();
        sq.setHeight(5);
        useIt(sq);


        //**************************************************
        Rectangle rc2 = RectangleFactory.newRectangle(2, 3);
        System.out.println("Rectangle Factory creates a Rectangle:");
        useIt(rc2);

        Rectangle rc3 = RectangleFactory.newSquare(5);
        System.out.println("Rectangle Factory creates an Square:");
        useIt(rc3);
    }


}
