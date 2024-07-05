package com.sipriano.enumeration;

import java.util.EnumSet;

public class EnumSetDemo {

    public static void main(String[] args) {
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println(allDays);

        EnumSet<Day> someDays = EnumSet.of(Day.FRYDAY, Day.MONDAY);
        System.out.println(someDays);

        EnumSet<Grades> PassGrades = EnumSet.range(Grades.A, Grades.C);
        System.out.println(PassGrades);

        EnumSet<Grades> failGrades = EnumSet.complementOf(PassGrades);
        System.out.println(failGrades);

    }

}
