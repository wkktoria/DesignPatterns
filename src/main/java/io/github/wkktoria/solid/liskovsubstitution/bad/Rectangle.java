package io.github.wkktoria.solid.liskovsubstitution.bad;

class Rectangle {
    protected int height;
    protected int width;

    void setWidth(final int width) {
        this.width = width;
    }

    void setHeight(final int height) {
        this.height = height;
    }

    int getArea() {
        return width * height;
    }
}
