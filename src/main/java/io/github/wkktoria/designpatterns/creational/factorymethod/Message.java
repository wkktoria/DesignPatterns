package io.github.wkktoria.designpatterns.creational.factorymethod;

/**
 * This class represents interface for product which is a message.
 * Implementations will be specific to content type.
 */
abstract class Message {
    abstract String getContent();

    void addDefaultHeaders() {

    }

    void encrypt() {

    }
}
