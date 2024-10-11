package io.github.wkktoria.solid.openclosed.bad;

public class AreaCalculator {
    public double calculateRectangleArea(final double width, final double height) {
        return width * height;
    }

    public double calculateCircleArea(final double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
