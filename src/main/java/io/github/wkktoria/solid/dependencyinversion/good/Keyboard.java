package io.github.wkktoria.solid.dependencyinversion.good;

class Keyboard implements Peripheral {
    @Override
    public void connect() {
        System.out.println("Keyboard connected");
    }
}
