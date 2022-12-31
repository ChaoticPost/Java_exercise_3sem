package org.example.task24.ex1;

import org.example.task24.ex1.Person;

public class PersonTest {

    public static void main(String[] args) {
        System.out.println(new Person("Иванов", "Иван", "Иванович").getFullName());
        System.out.println(new Person("Иванов", "Иван", "").getFullName());
        System.out.println(new Person("Иванов", "", "").getFullName());
        System.out.println(new Person("Иванов", null, null).getFullName());
    }
}
