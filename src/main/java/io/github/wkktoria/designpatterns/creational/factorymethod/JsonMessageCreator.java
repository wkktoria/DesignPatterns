package io.github.wkktoria.designpatterns.creational.factorymethod;

/**
 * Provides implementation for creating JSON messages.
 */
public class JsonMessageCreator extends MessageCreator {
    @Override
    protected Message createMessage() {
        return new JsonMessage();
    }
}
