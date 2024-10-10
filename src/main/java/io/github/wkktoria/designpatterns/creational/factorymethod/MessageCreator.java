package io.github.wkktoria.designpatterns.creational.factorymethod;

/**
 * This is abstract creator.
 * The abstract method {@link #createMessage()} has to be implemented by its subclasses.
 */
abstract class MessageCreator {
    Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    /**
     * The factory method.
     *
     * @return the message of desired type
     */
    abstract Message createMessage();
}
