package org.example.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(
                "Daria",
                "Chugunova",
                19,
                new Head("brown", "green"),
                new Leg(90),
                new Hand(60)
        );

        System.out.println("Human before editing:\n" + human);

        human.setName("Victor");
        human.setSurname("Petrov");
        human.setAge(20);
        human.setHead(new Head("blond", "brown"));

        System.out.println("\nHuman after editing:\n" + human);
    }
}
