package org.example.homework_nr_3;


public class Circle {

    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    public static double calculateArea(double Pi, double radius){
             return Pi * radius * radius;
    }

    public static void main(String[] args){

double PI =3.14;
double radius =2.5;
double radius1 = 47.3;
        System.out.println("Площадь круга =" + calculateArea (PI,radius));
//        System.out.println(calculateArea (3.14, 2.5));

        Circle ABC = new Circle (radius1);


        System.out.println("Площадь круга ="+ calculateArea(PI,ABC.radius));
//        System.out.println(calculateArea (3.14, 47.3);
    }
}


