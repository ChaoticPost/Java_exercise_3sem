/*Необходимо реализовать простейший класс Shape (Фигура) на языке программирования Java*/

package org.example.task3;

public class Exercise1_Circle {
    private double radius;

    public Exercise1_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius is only positive value");
        this.radius = radius;
    }
}