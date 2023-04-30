package org.example.homework_nr_9;

public class Manger extends Employee implements VerifyCanConductTraining, VerifyCanConductInterview {
    Integer TeamSize;

    public Manger(String name, String surname, Integer teamSize) {
        super(name, surname);
        TeamSize = teamSize;
    }

    public Integer getTeamSize() {
        return TeamSize;
    }

    @Override
    public void CanConductInterview() {
        System.out.println(getName() +" "+ getSurname()+ "  can conduct interview");
    }

    @Override
    public void CanConductTraining() {
        System.out.println(getName()+"  "+ getSurname()+ "   can conduct training");

    }
}


