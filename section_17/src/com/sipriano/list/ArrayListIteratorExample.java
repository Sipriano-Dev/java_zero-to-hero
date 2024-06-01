package com.sipriano.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteratorExample {

    public static void main(String[] args) {

        List<String> countryNames = new ArrayList<String>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        ListIterator<String> listIterator = countryNames.listIterator();

        while (listIterator.hasNext()) {
            String iterator = listIterator.next();
            System.out.println(iterator);
            if (iterator == "India") {
                listIterator.remove();
            }
        }

        while (listIterator.hasPrevious()) {
            String iterator = listIterator.previous();
            System.out.println(iterator);
            if (iterator == "India") {
                listIterator.remove();
            }
        }

    }

}
