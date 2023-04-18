package org.example.homework_nr_7;

public class Student extends Person {
    private String program;
    private Integer year;
    private double fee;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        if(year>=1)
        this.year = year;
        else System.out.println("Invalid year  "+year);
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Student(String name, String address, String program, Integer year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }


    public String to_String() {
    return "Student ["+ super.to_String() +","+ " program "+ program +" year " +year + " fee "+ fee +"]";
}

}
