package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee manager1 = new Manger("Alexei", "Volkov", 5);
        Employee manager2 = new Manger("Dmitrii", "Popov", 18);
        Employee programmer1 = new Programmer("Ion", "Ciobanu", "C+");
        Employee programmer2 = new Programmer("Arcadii", "Rotari", "Java");


      ((Manger) manager1).CanConductInterview();
        ((Manger) manager1).CanConductTraining();
        ((Programmer) programmer2).CanConductTraining();

        System.out.println("---------------------------------------------------");

        List<Employee> list = new ArrayList<>(Arrays.asList(manager1,programmer1,programmer2));

        MeetingRoom meet =new MeetingRoom(list);

                   meet.AttendTraining();

        System.out.println("---------------------------------------------------");

Employee[] array = new Employee[]{programmer1,programmer2,manager2};
        for (Employee element:
             array) {
            if (element instanceof Manger){
                ((Manger) element).CanConductTraining();
                ((Manger) element).CanConductInterview();
            }
            if (element instanceof Programmer){
                ((Programmer) element).CanConductTraining();

            }
        }

    }

}


