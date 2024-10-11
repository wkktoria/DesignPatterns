package io.github.wkktoria.solid.liskovsubstitution.bad;

import lombok.Setter;

@Setter
public class Rectangle {
    protected int height;
    protected int width;

    public int getArea() {
        return width * height;
    }
}
