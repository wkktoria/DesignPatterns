package io.github.wkktoria.solid.dependencyinversion.good;

class Computer {
    private Peripheral keyboard;
    private Peripheral monitor;

    Computer(final Peripheral keyboard, final Peripheral monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    void start() {
        keyboard.connect();
        monitor.connect();
    }
}
