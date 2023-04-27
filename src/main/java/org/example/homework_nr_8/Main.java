package org.example.homework_nr_8;

import org.example.Elephant;

public class Main {
    public static void main(String[] args) {

        Elephant elephant1 = new Elephant();


        elephant1.swim();
        elephant1.has_trunk();
        elephant1.eat_16_hours_per_day();

        Animal.run();
        elephant1.long_liver();



        elephant1.EatGrass();
        elephant1.NotEatMeet();

        System.out.println(Animal.speed_in_KM_per_hour);
        System.out.println(Animal.hasTail);
    }

}
