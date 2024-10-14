package io.github.wkktoria.designpatterns.creational.objectpool;

import javafx.geometry.Point2D;

/**
 * Concrete reusable.
 */
class Bitmap implements Image {
    private final String name;
    private Point2D location;

    public Bitmap(final String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + " at " + location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap reset");
    }
}
