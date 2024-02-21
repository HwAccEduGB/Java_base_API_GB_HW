package org.example;

import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    private static HashMap<String, TreeSet<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        String []name = {"иванов","петров","сидоров","орлов","белов","жигунов","кузнецов","чернов"};
        int min = 1000000;
        int max = 9000000;

        PhoneBook myPhoneBook = new PhoneBook();

        for (int i = 0; i < 50; i++) {
            myPhoneBook.add(name[(int) (Math.random() * (name.length -1)) +1],
                    String.valueOf(min + (int)(Math.random()*(max - min + 1))), phoneBook );
        }

        for (String elem: myPhoneBook.sort(phoneBook)) {
            System.out.println(elem);
        }

    }
}