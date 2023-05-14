package org.example.homework_nr_12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> listEmployee10 = new ArrayList<>(Arrays.asList(
                new Employee("Vasilii","Pupkin",25,true, false),
                new Employee("Andrei","Ivanob",18,false, true),
                new Employee("Roman","Petrov",30,false, false),
                new Employee("Serghei","Spinu",24,true, false),
                new Employee("Ion","Puskin",18,true, true),
                new Employee("Sandu","Sidorov",19,true, false),
                new Employee("Dragos","Mocanu",33,false, true),
                new Employee("Mihai","Moraru",28,false, false),
                new Employee("Oleg","Vulpe",25,true, true),
                new Employee("Cristina","Dubin",17,false, true)
        ));
        System.out.println("----список уникальных сотрудников, которые могут проводить собеседования, в возрасте старше 25 лет, получают почасовую оплату-----");

        System.out.println(
                listEmployee10.stream()
                .filter(e->e.getAge()>=25)
                        .filter(e-> e.getCanConductInterview())
                        .filter(e-> e.getPayedByHour())
                .distinct()
                .collect(Collectors.toList())

        );

        System.out.println("---список, который содержит только имена сотрудников в алфавитном порядке, которые не получают почасовую оплату и старше 30 лет---");


        listEmployee10.stream()
                .filter(e->e.getAge()>=30)
                .filter(e->!e.getPayedByHour())
                .map(e->e.getName())
                .sorted()
                .forEach(e-> System.out.println(e));
        System.out.println("--первый сотрудник из списка сотрудников который может проводить интервью и получает почасовую оплату. Используйте Optional для проверки на null! --");

        Optional<Employee> tempEmpl = listEmployee10.stream()
                .filter(e->e.getCanConductInterview())
                .filter(e->e.getPayedByHour())
                .findFirst();
if (tempEmpl.isPresent())
        System.out.println(tempEmpl.get().toString());
else
    System.out.println("Employee was not found!");


        System.out.println("-отсортированный список с сотрудниками по их фамилии, и через foreach выведите на экран всех сотрудников через метод toString()--");

        listEmployee10.stream()
                .sorted(Comparator.comparing(e->e.getSurname()))
                .forEach(e->System.out.println(e.toString()));

    }
}
