package io.github.wkktoria.designpatterns.creational.factorymethod;

class TextMessage extends Message {
    @Override
    String getContent() {
        return "Text";
    }
}
