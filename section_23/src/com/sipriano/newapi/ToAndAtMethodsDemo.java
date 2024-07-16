package com.sipriano.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ToAndAtMethodsDemo {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.MARCH, 18, 22, 30);
        System.out.println(dateTime);

        LocalDate date = dateTime.toLocalDate();
        LocalTime time = dateTime.toLocalTime();
        System.out.println(date);
        System.out.println(time);

        LocalDateTime startOfDay = date.atStartOfDay();//Putting hour in a date start of the day
        LocalDateTime dateWithTime = date.atTime(14, 24, 0);//Putting an specific hour in a date

        System.out.println(startOfDay);
        System.out.println(dateWithTime);
    }

}
