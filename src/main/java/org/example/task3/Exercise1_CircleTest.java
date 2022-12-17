package org.example.task3;

public class Exercise1_CircleTest {

    public static void main(String[] args) {
        Exercise1_Circle circle = new Exercise1_Circle(17);
        System.out.println("Initially radius: " + circle.getRadius());

        circle.setRadius(7); //new radius
        System.out.println("New radius: " + circle.getRadius());
    }
}
