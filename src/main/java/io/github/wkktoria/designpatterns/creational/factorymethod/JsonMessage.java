package io.github.wkktoria.designpatterns.creational.factorymethod;

class JsonMessage extends Message {
    @Override
    String getContent() {
        return "{\"JSON\": []}";
    }
}
