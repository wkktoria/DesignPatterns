package io.github.wkktoria.solid.openclosed.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape {
    private double width;
    private double height;

    @Override
    public double calculateArea() {
        return width * height;
    }
}
