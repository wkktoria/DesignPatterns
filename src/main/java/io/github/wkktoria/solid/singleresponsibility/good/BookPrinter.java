package io.github.wkktoria.solid.singleresponsibility.good;

class BookPrinter {
    void print(final Book book) {
        System.out.println("Title: " + book.getTitle() + " Author: " + book.getAuthor());
    }
}
