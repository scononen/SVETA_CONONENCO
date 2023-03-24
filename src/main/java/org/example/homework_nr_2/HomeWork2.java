package org.example.homework_nr_2;

import java.net.BindException;

public class HomeWork2 {
    public static void main(String[] args) {
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Окябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
        }
//задание 5 оображать все числа от 100 до 1000 которые делятся на 5
        for (int k = 100; k <= 1000; k++) {
            if (k % 5 == 0) {
                System.out.println(k);
            }
        }
        // Задание 6 отобразить сумму следующей серии: 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
        double sum = 0.0;
        for (double i = 1; i <= 97; i += 2) {
            sum += i / (i + 2);
        }
        System.out.println(sum);

//        Используйте комбинацию из System.out.println и System.out.print и циклы на вывода на экран фигуры

        char star = '*';
        int read = 0, stolbet = -1;
        do {stolbet++; for (read =1; read <=stolbet; read++){
                System.out.print(star);
                }

            System.out.println(star);

        } while (stolbet < 8);


    }
}

