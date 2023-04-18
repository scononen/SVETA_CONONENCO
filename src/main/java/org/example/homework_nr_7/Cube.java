package org.example.homework_nr_7;

public class Cube extends ThreeDimensionalShape{
    double sidelength;

    public Cube(double sidelength) {
        this.sidelength = sidelength;
    }

    @Override
    public double Volume() {
        return sidelength * sidelength * sidelength;
    }
}
