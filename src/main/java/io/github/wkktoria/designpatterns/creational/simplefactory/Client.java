package io.github.wkktoria.designpatterns.creational.simplefactory;

class Client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost(PostType.BLOG);
        System.out.println(post);
    }
}
