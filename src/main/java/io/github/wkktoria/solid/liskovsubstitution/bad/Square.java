package io.github.wkktoria.solid.liskovsubstitution.bad;

class Square extends Rectangle {
    @Override
    void setWidth(final int width) {
        this.width = width;
        this.height = width; // Inconsistency
    }

    @Override
    void setHeight(final int height) {
        this.height = height;
        this.width = height; // Inconsistency
    }
}
