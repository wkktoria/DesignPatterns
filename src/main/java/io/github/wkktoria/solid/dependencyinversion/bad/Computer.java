package io.github.wkktoria.solid.dependencyinversion.bad;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;

    public Computer() {
        keyboard = new Keyboard();
        monitor = new Monitor();
    }
}
