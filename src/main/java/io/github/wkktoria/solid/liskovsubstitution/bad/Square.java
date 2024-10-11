package io.github.wkktoria.solid.liskovsubstitution.bad;

public class Square extends Rectangle {
    @Override
    public void setWidth(final int width) {
        this.width = width;
        this.height = width; // Inconsistency
    }

    @Override
    public void setHeight(final int height) {
        this.height = height;
        this.width = height; // Inconsistency
    }
}
