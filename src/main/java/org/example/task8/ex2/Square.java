package org.example.task8.ex2;

import java.awt.*;
import java.awt.Rectangle;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public Square(int side, Color color) {
        super(side, side, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
