package io.github.wkktoria.designpatterns.creational.objectpool;

import javafx.geometry.Point2D;

/**
 * Represents abstract reusable.
 */
interface Image extends Poolable {
    void draw();

    Point2D getLocation();

    void setLocation(final Point2D location);
}
