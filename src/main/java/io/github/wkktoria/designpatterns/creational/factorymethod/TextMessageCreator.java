package io.github.wkktoria.designpatterns.creational.factorymethod;

/**
 * Provides implementation for creating text messages.
 */
class TextMessageCreator extends MessageCreator {
    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
