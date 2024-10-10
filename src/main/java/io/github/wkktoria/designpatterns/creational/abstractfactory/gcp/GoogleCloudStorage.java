package io.github.wkktoria.designpatterns.creational.abstractfactory.gcp;

import io.github.wkktoria.designpatterns.creational.abstractfactory.Storage;

/**
 * Represents a concrete product in a family Google Cloud Platform.
 */
public class GoogleCloudStorage implements Storage {
    public GoogleCloudStorage(final int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " MiB on Google Cloud storage");
    }

    @Override
    public String getId() {
        return "GCP1";
    }

    @Override
    public String toString() {
        return "Google Cloud storage";
    }
}
