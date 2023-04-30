package org.example.homework_nr_9;

public class Programmer extends Employee implements VerifyCanConductTraining{
 String ProgrammerLanguage;

    public Programmer(String name, String surname, String programmerLanguage) {
        super(name, surname);
        ProgrammerLanguage = programmerLanguage;
    }

    public String getProgrammerLanguage() {
        return ProgrammerLanguage;
    }


    @Override
    public void CanConductTraining() {
        System.out.println(getName()+"   "+ getSurname()+ "  can conduct training");
    }
}
