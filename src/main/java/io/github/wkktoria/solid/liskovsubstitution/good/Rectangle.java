package io.github.wkktoria.solid.liskovsubstitution.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Rectangle implements Shape {
    private int width;
    private int height;

    @Override
    public int getArea() {
        return width * height;
    }
}
