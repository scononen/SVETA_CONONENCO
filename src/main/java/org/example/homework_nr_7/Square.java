package org.example.homework_nr_7;

public class Square extends TwoDimensionalShape {
    double sidelength;

    public Square(double sidelength) {
        this.sidelength = sidelength;
    }

    @Override
    public double Area() {
        return sidelength *sidelength;
    }
}
