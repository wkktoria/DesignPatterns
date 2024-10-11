package io.github.wkktoria.designpatterns.creational.simplefactory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * An abstract post class. Represents a generic post on a website.
 */
@Getter
@Setter
public abstract class Post {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime publishedOn;
}
