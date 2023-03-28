package org.example.homework_nr_3;

public class TemperatureConverter {
    double C;
    double F;
    TemperatureConverter (double C, double F) {
        this.C = C;
        this.F = F;
    }
        public static double toCelsius(double F) {
                return (F-32)*5/9;
        }
        public static double toFahrenheit(double C){
                return C*9/5+32;
        }
        public static void main(String[] args){

    double Celisia;  double Faregheit;
            Celisia =28;  Faregheit =20;

            TemperatureConverter X= new TemperatureConverter (Celisia, Faregheit);
            System.out.println("Градус Цельсия = " + Celisia + "  равен градусу  " + toFahrenheit(X.C) + "  Фаренгейта");
            System.out.println("Градус Фаренгейта = " + Faregheit + "   равен градусу  " + toCelsius(X.F) + "  Цельсия");

    }





}
