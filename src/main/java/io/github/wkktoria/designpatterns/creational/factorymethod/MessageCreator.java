package io.github.wkktoria.designpatterns.creational.factorymethod;

/**
 * This is abstract creator.
 * The abstract method {@link #createMessage()} has to be implemented by its subclasses.
 */
abstract class MessageCreator {
    /**
     * This is called by clients.
     *
     * @return a {@link Message}
     */
    Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    /**
     * The factory method.
     * Subclasses must provide implementation for this and return a specific subclass of {@link Message}.
     *
     * @return a concrete {@link Message}
     */
    protected abstract Message createMessage();
}
