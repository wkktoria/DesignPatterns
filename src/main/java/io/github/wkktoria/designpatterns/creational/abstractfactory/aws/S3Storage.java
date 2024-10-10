package io.github.wkktoria.designpatterns.creational.abstractfactory.aws;

import io.github.wkktoria.designpatterns.creational.abstractfactory.Storage;

/**
 * Represents a concrete product in a family Amazon Web Services.
 */
public class S3Storage implements Storage {
    public S3Storage(final int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " MiB on S3 storage");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 storage";
    }
}
