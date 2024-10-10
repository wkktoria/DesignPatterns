package io.github.wkktoria.solid.dependencyinversion.bad;

class Computer {
    private Keyboard keyboard;
    private Monitor monitor;

    Computer() {
        keyboard = new Keyboard();
        monitor = new Monitor();
    }
}
