package io.github.wkktoria.designpatterns.creational.abstractfactory.gcp;

import io.github.wkktoria.designpatterns.creational.abstractfactory.Instance;
import io.github.wkktoria.designpatterns.creational.abstractfactory.ResourceFactory;
import io.github.wkktoria.designpatterns.creational.abstractfactory.Storage;

/**
 * The factory implementation for Google Cloud Platform resources.
 */
public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new GoogleCloudStorage(capacityInMib);
    }
}
