package org.example.homework_nr_7;

public class Circle extends TwoDimensionalShape {
    double radius;
    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}

