package org.example.task6;

import org.example.task6.ex4.MovableRectangle;

public class MovableTest {

    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 20, 5, 10);
        System.out.println("Rectangle before moving:\n" + rectangle + "\n");
        rectangle.moveUp();
        rectangle.moveRight();
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println("\nRectangle after moving in a circle:\n" + rectangle);
    }
}
