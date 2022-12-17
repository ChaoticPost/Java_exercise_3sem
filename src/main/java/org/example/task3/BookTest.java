package org.example.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Alexander Pushkin", "Оnegin", 1833, "Roman", 352);

        System.out.println("Book before editing:\n" + book);

        book.setAuthor("Michael Bulgakov");
        book.setTitle("War and Peace");
        book.setYear(1867);
        book.setGenre("Novel");
        book.setPages(1225);

        System.out.println("\nBook after editing:\n" + book);
    }
}
