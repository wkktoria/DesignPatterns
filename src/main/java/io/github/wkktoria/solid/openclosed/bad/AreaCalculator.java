package io.github.wkktoria.solid.openclosed.bad;

class AreaCalculator {
    double calculateRectangleArea(final double width, final double height) {
        return width * height;
    }

    double calculateCircleArea(final double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
