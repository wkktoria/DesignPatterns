package io.github.wkktoria.designpatterns.creational.prototype;

import javafx.geometry.Point3D;
import lombok.Getter;

/**
 * This class represents an abstract prototype and defines the {@link #clone()} method.
 */
@Getter
abstract class GameUnit implements Cloneable {
    private Point3D position;

    GameUnit() {
        this.position = Point3D.ZERO;
    }

    GameUnit(final float x, final float y, final float z) {
        this.position = new Point3D(x, y, z);
    }

    void move(final Point3D direction, final float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        this.position = this.position.add(finalMove);
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();
}
