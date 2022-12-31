package org.example.task18.ex2;

public class Exercise2 {

    public static <Exception2> void main(String[] args) {
        // При Qwerty сработает исключение java.lang.NumberFormatException
        // При 0 - java.lang.ArithmeticException: / by zero
        // При 1.2 - java.lang.NumberFormatException
        // При 1 программа выполнится без ошибок и исключений
        Exception2 exception = new Exception2();
        exception.exceptionDemo();
    }
}