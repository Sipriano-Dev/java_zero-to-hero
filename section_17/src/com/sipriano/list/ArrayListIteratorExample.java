package com.sipriano.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorExample {

    public static void main(String[] args) {

        List<String> countryNames = new ArrayList<String>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        Iterator<String> interator = countryNames.iterator();

        while (interator.hasNext()) {
            String ite = interator.next();
            System.out.println(ite);
            if (ite == "India") {
                interator.remove();
            }
        }

        System.out.println(countryNames);

    }

}
