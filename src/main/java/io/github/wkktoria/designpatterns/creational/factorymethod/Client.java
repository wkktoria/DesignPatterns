package io.github.wkktoria.designpatterns.creational.factorymethod;

class Client {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }

    static void printMessage(final MessageCreator creator) {
        Message message = creator.createMessage();
        System.out.println(message.getContent());
    }
}
