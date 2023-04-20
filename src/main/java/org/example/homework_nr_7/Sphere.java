package org.example.homework_nr_7;

public class Sphere extends ThreeDimensionalShape{
    public Sphere(double radius) {
        this.radius = radius;
    }

    double radius;
    @Override
    public double Volume() {
        return (double) 4 /3 * Math.PI* radius* radius * radius;
    }
}
