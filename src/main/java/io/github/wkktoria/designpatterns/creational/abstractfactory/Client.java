package io.github.wkktoria.designpatterns.creational.abstractfactory;

import io.github.wkktoria.designpatterns.creational.abstractfactory.aws.AwsResourceFactory;
import io.github.wkktoria.designpatterns.creational.abstractfactory.gcp.GoogleResourceFactory;

public class Client {
    private final ResourceFactory factory;

    public Client(final ResourceFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.SMALL, 20480);
        i1.start();
        i1.stop();

        Client gcp = new Client(new GoogleResourceFactory());
        Instance i2 = gcp.createServer(Instance.Capacity.MICRO, 10240);
        i2.start();
        i2.stop();
    }

    protected Instance createServer(final Instance.Capacity capacity, final int capacityInMib) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(capacityInMib);

        instance.attachStorage(storage);

        return instance;
    }
}
