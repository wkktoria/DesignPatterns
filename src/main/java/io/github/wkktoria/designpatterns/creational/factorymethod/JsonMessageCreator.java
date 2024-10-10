package io.github.wkktoria.designpatterns.creational.factorymethod;

/**
 * Provides implementation for creating JSON messages.
 */
class JsonMessageCreator extends MessageCreator {
    @Override
    Message createMessage() {
        return new JsonMessage();
    }
}
