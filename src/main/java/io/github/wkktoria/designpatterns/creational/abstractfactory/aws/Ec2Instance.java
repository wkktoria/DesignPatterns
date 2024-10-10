package io.github.wkktoria.designpatterns.creational.abstractfactory.aws;

import io.github.wkktoria.designpatterns.creational.abstractfactory.Instance;
import io.github.wkktoria.designpatterns.creational.abstractfactory.Storage;

/**
 * Represents a concrete product in a family Amazon Web Services.
 */
public class Ec2Instance implements Instance {
    public Ec2Instance(final Capacity capacity) {
        System.out.println("Created EC2 instance");
    }

    @Override
    public void start() {
        System.out.println("EC2 instance started");
    }

    @Override
    public void attachStorage(final Storage storage) {
        System.out.println("Attached " + storage + " to EC2 instance");
    }

    @Override
    public void stop() {
        System.out.println("EC2 instance stopped");
    }

    @Override
    public String toString() {
        return "EC2 instance";
    }
}
