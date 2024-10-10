package io.github.wkktoria.designpatterns.creational.abstractfactory.gcp;

import io.github.wkktoria.designpatterns.creational.abstractfactory.Instance;
import io.github.wkktoria.designpatterns.creational.abstractfactory.Storage;

/**
 * Represents a concrete product in family Google Cloud Platform.
 */
public class GoogleComputeEngineInstance implements Instance {
    public GoogleComputeEngineInstance(final Capacity capacity) {
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google Compute Engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine instance stopped");
    }

    @Override
    public String toString() {
        return "Google Compute Engine instance";
    }
}
