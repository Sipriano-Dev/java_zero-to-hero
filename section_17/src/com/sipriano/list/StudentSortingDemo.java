package com.sipriano.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSortingDemo {

    public static void main(String[] args) {

        var students = new ArrayList<Student>();
        students.add(new Student("John", 245, 85));
        students.add(new Student("Joana", 246, 90));
        students.add(new Student("Suzy", 247, 83));
        System.out.println(students);
        System.out.println("__________________________");

        Collections.sort(students);
        System.out.println(students);
        Collections.sort(students.reversed());
        System.out.println(students);
        System.out.println("-------------------------");
        students.sort(Comparator.naturalOrder());
        System.out.println(students);
        students.sort(Comparator.reverseOrder());

        Collections.sort(students, new StudentComparator());
        System.out.println(students);
        System.out.println("-------------------------");
        students.sort(new StudentComparator().reversed());
        System.out.println(students);



    }

}
