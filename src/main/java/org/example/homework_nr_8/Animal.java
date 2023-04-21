package org.example.homework_nr_8;

public interface Animal {

    double speed_in_KM_per_hour =50;
    boolean hasTail=true;

    void swim();

    void eat_16_hours_per_day();
    void has_trunk();
    static void run(){
        System.out.println("This animal runs fast");
    };
    default void long_liver() {
        System.out.println("This animal lives very long animal's live");
    }
}
