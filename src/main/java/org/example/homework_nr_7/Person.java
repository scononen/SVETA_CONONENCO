package org.example.homework_nr_7;

public class Person {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public String to_String() {
        return "Person" + "[name= " +name + "," + "address= " + address + "]";
    }
}

