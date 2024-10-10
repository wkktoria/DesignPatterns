package io.github.wkktoria.designpatterns.creational.simplefactory;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a product information post.
 */
@Getter
@Setter
class ProductPost extends Post {
    private String imageUrl;
    private String name;
}
