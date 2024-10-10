package io.github.wkktoria.solid.liskovsubstitution.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Square implements Shape {
    private int side;

    @Override
    public int getArea() {
        return side * side;
    }
}
