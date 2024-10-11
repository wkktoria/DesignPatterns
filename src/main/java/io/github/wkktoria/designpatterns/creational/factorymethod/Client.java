package io.github.wkktoria.designpatterns.creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }

    protected static void printMessage(final MessageCreator creator) {
        Message message = creator.createMessage();
        System.out.println(message.getContent());
    }
}
