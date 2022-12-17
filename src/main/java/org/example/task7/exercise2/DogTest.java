package org.example.task7.exercise2;

public class DogTest {

    public static void main(String[] args) {
        Shepherd shepherd = new Shepherd("Bob", 3);
        shepherd.displayInfo();
        shepherd.bark();

        System.out.println();

        Poodle poodle = new Poodle("Charlie", 1);
        poodle.displayInfo();
        poodle.bark();
    }
}

