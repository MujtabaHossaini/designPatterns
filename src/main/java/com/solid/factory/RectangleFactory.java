package com.solid.factory;

import com.solid.model.Rectangle;

public class RectangleFactory {

    public static Rectangle newSquare(int side)
    {
        return new Rectangle(side, side);
    }

    public static Rectangle newRectangle(int width, int height)
    {
        return new Rectangle(width, height);
    }


}
