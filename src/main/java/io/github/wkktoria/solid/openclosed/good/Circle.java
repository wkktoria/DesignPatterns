package io.github.wkktoria.solid.openclosed.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Circle implements Shape {
    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
