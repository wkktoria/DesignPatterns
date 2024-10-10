package io.github.wkktoria.designpatterns.creational.simplefactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostFactoryTest {
    @Test
    void createPostReturnsInstanceOfBlogPost() {
        var result = PostFactory.createPost(PostType.BLOG);
        assertNotNull(result);
        assertInstanceOf(BlogPost.class, result);
    }

    @Test
    void createPostReturnsInstanceOfNewsPost() {
        var result = PostFactory.createPost(PostType.NEWS);
        assertNotNull(result);
        assertInstanceOf(NewsPost.class, result);
    }

    @Test
    void createPostReturnsInstanceOfProductPost() {
        var result = PostFactory.createPost(PostType.PRODUCT);
        assertNotNull(result);
        assertInstanceOf(ProductPost.class, result);
    }
}