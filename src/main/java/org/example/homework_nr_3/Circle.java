package org.example.homework_nr_3;


public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

double radius =2.5;
double radius1 = 47.3;


        Circle ABC = new Circle (radius);
        Circle X = new Circle(radius1);

        System.out.println("Площадь круга с радиусом " +radius + " равна " + ABC.calculateArea());
        System.out.println("Площадь круга с радиусом "+ radius1+ " равна " + X.calculateArea());

    }
}


