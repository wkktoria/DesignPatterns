package io.github.wkktoria.designpatterns.creational.abstractfactory;

/**
 * An abstract factory with methods defined for each object type.
 */
public interface ResourceFactory {
    Instance createInstance(final Instance.Capacity capacity);

    Storage createStorage(final int capacityInMib);
}
