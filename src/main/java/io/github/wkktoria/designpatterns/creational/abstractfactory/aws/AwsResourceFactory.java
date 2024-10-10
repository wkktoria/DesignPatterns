package io.github.wkktoria.designpatterns.creational.abstractfactory.aws;

import io.github.wkktoria.designpatterns.creational.abstractfactory.Instance;
import io.github.wkktoria.designpatterns.creational.abstractfactory.ResourceFactory;
import io.github.wkktoria.designpatterns.creational.abstractfactory.Storage;

/**
 * The factory implementation for Amazon Web Services resources.
 */
public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new S3Storage(capacityInMib);
    }
}
