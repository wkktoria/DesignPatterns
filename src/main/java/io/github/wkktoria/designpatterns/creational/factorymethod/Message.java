package io.github.wkktoria.designpatterns.creational.factorymethod;

/**
 * This class represents interface for product which is a message.
 * Implementations will be specific to content type.
 */
public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders() {

    }

    public void encrypt() {

    }
}
