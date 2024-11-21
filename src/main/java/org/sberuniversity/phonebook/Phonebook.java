package org.sberuniversity.phonebook;

import java.util.*;

public class Phonebook {
    private Map<String, List<String>> phonebook = new HashMap<>();
    ;


    public void add(String surname, String number) {
        if (!phonebook.containsKey(surname)) {
            phonebook.put(surname, new ArrayList<>());
        }
        phonebook.get(surname).add(number);

    }

    public void get(String name) {
        if (phonebook.containsKey(name))
            System.out.println(name + " --- " + phonebook.get(name));
        else {
            System.out.println(name + " --- " + new ArrayList<>());
        }
    }
}

