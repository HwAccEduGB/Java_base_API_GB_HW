package org.example;

import java.util.*;

public class PhoneBook {
    public void add(String name,  String number, HashMap<String, TreeSet<String>> phoneBook) {
        TreeSet<String> numbers = phoneBook.getOrDefault(name, new TreeSet<>());
        numbers.add(number);
        phoneBook.put(name, numbers);
    }

    public List<String> sort(HashMap<String, TreeSet<String>> phoneBook){
        List<Map.Entry<String, TreeSet<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((e1, e2) -> e2.getValue().size() - e1.getValue().size());

        List<String> sortedList = new ArrayList<>();
        for (Map.Entry<String, TreeSet<String>> entry: entries) {
            sortedList.add(entry.getKey() + ": " + entry.getValue());
        }
        return sortedList;
    }
}
