package io.github.wkktoria.designpatterns.creational.simplefactory;

/**
 * This class acts as a simple factory for creation of different posts on website.
 */
class PostFactory {
    static Post createPost(final PostType type) {
        return switch (type) {
            case BLOG -> new BlogPost();
            case NEWS -> new NewsPost();
            case PRODUCT -> new ProductPost();
        };
    }
}
