package io.github.wkktoria.solid.dependencyinversion.good;

public class Keyboard implements Peripheral {
    @Override
    public void connect() {
        System.out.println("Keyboard connected");
    }
}
