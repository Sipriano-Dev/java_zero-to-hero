package com.sipriano.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(35, 63, 6, 0, 3, -12, 20);
        System.out.println(list);
        System.out.println("---------------");

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        System.out.println("___________________________");

        var stringList = Arrays.asList("Anderson", "Gabrielle", "Felipe");
        Collections.sort(stringList);
        System.out.println(stringList);
        Collections.sort(stringList, Comparator.reverseOrder());
        System.out.println(stringList);
        System.out.println("____________________________");

        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        System.out.println("_____________________________");
        Collections.sort(stringList, new LastCharComparator());
        Collections.sort(stringList, new LastCharComparator().reversed());
        System.out.println("----------------------------------");
        stringList.sort(new LastCharComparator());
        System.out.println(stringList);
        stringList.sort(new LastCharComparator().reversed());
        System.out.println(stringList);


    }

}
