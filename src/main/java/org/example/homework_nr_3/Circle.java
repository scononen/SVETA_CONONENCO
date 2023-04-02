package org.example.homework_nr_3;


public class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    public static double calculateArea(double radius){
             return Math.PI * radius * radius;
    }

    public static void main(String[] args){

double radius =2.5;
double radius1 = 47.3;

        System.out.println("Площадь круга =" + calculateArea(radius));
//        System.out.println(calculateArea (2.5));

        Circle ABC = new Circle (radius1);


        System.out.println("Площадь круга ="+ calculateArea(ABC.radius));
//        System.out.println(calculateArea ( 47.3));
    }
}


