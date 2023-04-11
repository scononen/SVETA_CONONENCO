package org.example.homework_nr_6up;

public class Employee {
    public static void main(String[] args) {
        Employee Employee1 = new Employee( "Serghei", 38,"comercial");
        System.out.println(Employee1.getName());
        Employee1.setName("Vovan");
        System.out.println(Employee1.getName());
    }
    private String name;
    private int age;
    private String departament;

    public Employee(String name, int age, String departament) {
        this.name = name;
        this.age = age;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
}
