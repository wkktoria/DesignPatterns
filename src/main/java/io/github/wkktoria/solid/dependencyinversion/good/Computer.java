package io.github.wkktoria.solid.dependencyinversion.good;

public class Computer {
    private Peripheral keyboard;
    private Peripheral monitor;

    public Computer(final Peripheral keyboard, final Peripheral monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void start() {
        keyboard.connect();
        monitor.connect();
    }
}
