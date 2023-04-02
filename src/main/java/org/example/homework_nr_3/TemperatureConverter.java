package org.example.homework_nr_3;

public class TemperatureConverter {
    double C;
    double F;

    TemperatureConverter(double C, double F) {
        this.C = C;
        this.F = F;
    }
    public double toCelsius() {
        return (F - 32) * 5 / 9;
    }

    public double toFahrenheit() {
        return C * 9 / 5 + 32;
    }

    public static void main(String[] args) {

        double Celisia;
        double Faregheit;
        Celisia = 28;
        Faregheit = 20;

        TemperatureConverter X = new TemperatureConverter(Celisia, Faregheit);
        System.out.println("Градус Цельсия = " + Celisia + "  равен градусу  " + X.toFahrenheit() + "  Фаренгейта");
        System.out.println("Градус Фаренгейта = " + Faregheit + "   равен градусу  " + X.toCelsius() + "  Цельсия");

    }


}




