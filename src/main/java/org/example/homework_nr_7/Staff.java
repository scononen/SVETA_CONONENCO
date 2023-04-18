package org.example.homework_nr_7;

public class Staff extends Person{
    private String school;
    private double pay;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String to_String() {
        return "Staff ["+ super.to_String() +","+ " school "+ school +"  pay " +pay + "]";
    }
}
