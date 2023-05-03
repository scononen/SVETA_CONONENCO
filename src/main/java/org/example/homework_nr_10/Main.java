package org.example.homework_nr_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {


    List<String > listToDoToday= new ArrayList<>();
        listToDoToday.add("do homework");
        listToDoToday.add("to cook dinner");
        listToDoToday.add("to clean flat");
        listToDoToday.add("to write email about FA");
        listToDoToday.add("to made list of all necessary products");
        listToDoToday.add("Attend a conference");
        System.out.println(listToDoToday);

//бонус
        listToDoToday.removeIf((String element) -> { return element.startsWith("A");});
        System.out.println(listToDoToday);

        listToDoToday.replaceAll(e->{
           if(e.contains("al")) return ("replaced String");
           return e;
        });
        System.out.println(listToDoToday);

        System.out.println("-----------------------------");

        Set<String> friuts =new HashSet<>();
        friuts.add("strawberry");
        friuts.add("apple");
        friuts.add("plum");
        friuts.add("chery");
        friuts.add("strawberry");
        System.out.println(friuts);
        System.out.println("-----------------------------");

        Map<String, String> EngRomDictionary = new HashMap<>();
        EngRomDictionary.put("grass", "iarbă");
        EngRomDictionary.put("sit","sta");
        EngRomDictionary.put("grasshopper","lăcustă");
        EngRomDictionary.put("at all","deloc");
        EngRomDictionary.put("how","cum");
        EngRomDictionary.put("cucumber","castravete");
        EngRomDictionary.put("greenish","verzui");
        EngRomDictionary.put("such","astfel de");
        EngRomDictionary.put("imagine","imagina");
        EngRomDictionary.put("yourself","tu");

        System.out.println(EngRomDictionary);
        System.out.println("-----------------------------");

        Deque<String> queue =new ArrayDeque<>();
        queue.offer("first order");
        queue.offer("second order");
        queue.offer("third order");
        queue.offer("forth order");
        queue.offer("fifth order");
        System.out.println(queue);
        System.out.println("took order "+queue.pollLast());
        System.out.println(queue);
        System.out.println("took order "+queue.pollLast());
        System.out.println(queue);
        System.out.println("took order "+queue.pollLast());
        System.out.println(queue);
        System.out.println("took order "+queue.peekLast());
        System.out.println(queue);
        }
    }

