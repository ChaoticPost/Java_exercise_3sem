package org.example.task18.ex1;

public class Exception1 {

	/* Листинг 1
	public void exceptionDemo() {
		 ArithmeticException;
		System.out.println(2 / 0);

		// Infinity
		System.out.println(2.0 / 0.0);
	}*/


    // Листинг 2
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
