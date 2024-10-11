package io.github.wkktoria.solid.dependencyinversion.good;

public class Monitor implements Peripheral {
    @Override
    public void connect() {
        System.out.println("Monitor connected");
    }
}
