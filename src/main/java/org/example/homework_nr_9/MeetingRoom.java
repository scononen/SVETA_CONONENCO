package org.example.homework_nr_9;

import java.util.List;

public class MeetingRoom {
    List<Employee> training;

    public MeetingRoom(List<Employee> training) {
        this.training = training;
    }

    void AttendTraining() {
        for (Employee element :
                training) {
            System.out.println(element.getName() + " " + element.getSurname() + " can conduct TRAINING");
        }
    }
}


