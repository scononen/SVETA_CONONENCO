package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {
    List<VerifyCanConductTraining> training;

    public MeetingRoom(List<VerifyCanConductTraining> training) {
        this.training = training;
    }

    void AttendTraining() {
        for (VerifyCanConductTraining element :
                training) {
            element.CanConductTraining();
        }
    }
}


