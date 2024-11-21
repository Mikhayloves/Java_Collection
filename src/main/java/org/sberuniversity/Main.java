package org.sberuniversity;

import org.sberuniversity.phonebook.Phonebook;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> citycounter = new HashMap<>();
        String[] cities = {
                "Москва", "Петербург", "Нью-Йорк", "Лондон", "Париж", "Токио", "Москва", "Берлин", "Париж", "Лондон", "Сидней", "Москва", "Токио",
                "Лондон",
                "Ростов",
                "Лиссабон",
                "Нью-Йорк",
                "Петербург",
                "Тбилиси",
                "Париж",
                "Москва"

        };
        Set<String> unique = new HashSet<>();

        for (String s : cities) {
            unique.add(s);
            citycounter.put(s, citycounter.getOrDefault(s, 0) + 1);
        }

        for (String a : unique) {
            System.out.println("Уникальные значение - " + a);
        }
        System.out.println("--------------");
        System.out.println();


        for (Map.Entry<String, Integer> entry : citycounter.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        System.out.println("----------------------");
        Phonebook phonebook = new Phonebook();

        phonebook.add("Петрова", "28065");
        phonebook.add("Петров", "23030");
        phonebook.add("Петрова", "28066");
        phonebook.add("Иванов", "27064");
        phonebook.get("Петрова");
        phonebook.get("Мих");
        phonebook.get("Петров");


    }
}
