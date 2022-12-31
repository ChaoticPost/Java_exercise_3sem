package org.example.task21.ex1;

public class ComplexTest {

    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex(1, 2);
        System.out.println(complex);
    }
}

