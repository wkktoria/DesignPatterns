package io.github.wkktoria.solid.singleresponsibility.good;

public class BookPrinter {
    public void print(final Book book) {
        System.out.println("Title: " + book.getTitle() + " Author: " + book.getAuthor());
    }
}
