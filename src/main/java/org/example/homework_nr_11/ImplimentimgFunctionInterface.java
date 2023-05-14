package org.example.homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ImplimentimgFunctionInterface {
    public static void main(String[] args) {

        System.out.println("---------4 функциональных интерфейса типа Function-------");
        String VowelsAsString = "aeuioAEUIO";
        String Numbers = "1234567890";

        Function<String, Integer> countVowels = (e) -> {
            int count = 0;
            int i;
            for (i = 0; i < e.length(); i++)

                if (VowelsAsString.contains(e.valueOf(e.charAt(i))))
                    count++;
            return count++;
        };
        System.out.println("количество гласных букв " + countVowels.apply("Hello world"));

        Function<String, Integer> countNumbers = (e) -> {
            int count = 0;
            int i;
            for (i = 0; i < e.length(); i++)

                if (Numbers.contains(e.valueOf(e.charAt(i))))
                    count++;
            return count++;
        };
        System.out.println("количество чисел внутри строки " + countNumbers.apply("Hello world 125 times and 091 gip gip ura"));

        Function<String, Integer> countСonsonants = (e) -> {
            int count = 0;
            int i;
            for (i = 0; i < e.length(); i++) {

                if (VowelsAsString.indexOf(e.charAt(i)) == -1 && e.charAt(i)!=' ')
                    count++;
            }
            return count++;
        };
        System.out.println("количество согласных букв " + countСonsonants.apply("Hello world"));

        Function<String, String> countLengthIsEven = (e) -> {

            if (e.length() % 2 == 0)
                return null;

            else return e.valueOf(e.charAt(0));
        };
        System.out.println("количество элементов строки " + countLengthIsEven.apply("Ehal Greka 4erez reku"));

        System.out.println("---------2 функциональных интерфейса типа Predicate-------");
        Predicate<String> Palindrom = (e) -> {
            e = e.toLowerCase();
            String reverseword = new StringBuffer(e).reverse().toString();
            return e.equals(reverseword);
        };

        System.out.println("строка является палиндромом " + Palindrom.test("AnNa"));
        System.out.println("строка является палиндромом " + Palindrom.test("Seriogha"));

        Predicate<Integer> NumberisSipmle = (e) -> {
            int i;
            for (i = 2; i != e; i++){
                if (e % i == 0)
                    return false;
            return true;}
            return false;
        };

        System.out.println("число делится только на 1 и на самого себя " + NumberisSipmle.test(17));

        System.out.println("---пример с использованием коллекции вида List и интерфеса  Predicate----");
        List<Integer> ListNumbers = new ArrayList<>(Arrays.asList(12, 17, 36, 47, 54, 112, 117));
        for (Integer element :
                ListNumbers) {
            System.out.println("число " + element + "  делится только на 1 и на самого себя " + NumberisSipmle.test(element));

        }



    }


}


