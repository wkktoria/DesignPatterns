package io.github.wkktoria.solid.singleresponsibility.bad;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book {
    private String title;
    private String author;

    /**
     * This method handles printing, which is an extra responsibility.
     */
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
