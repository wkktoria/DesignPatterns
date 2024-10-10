package io.github.wkktoria.designpatterns.creational.abstractfactory;

/**
 * Represents an abstract product.
 */
public interface Instance {
    void start();

    void attachStorage(final Storage storage);

    void stop();

    enum Capacity {MICRO, SMALL, LARGE}
}
