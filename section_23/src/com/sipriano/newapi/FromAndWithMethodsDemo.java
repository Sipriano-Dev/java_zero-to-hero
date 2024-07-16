package com.sipriano.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class FromAndWithMethodsDemo {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.MARCH, 18, 22, 30);

        //Getting date and time from dateTime
        LocalDate derivedDate = LocalDate.from(dateTime);
        LocalTime derivedTime = LocalTime.from(dateTime);
        System.out.println(derivedDate);
        System.out.println(derivedTime);

        //Creating a date with another
        LocalDateTime dateTime1 = dateTime.withYear(2030);//Since this object of data is immutable
        LocalDateTime dateTime2 = dateTime.withYear(2030).withMonth(2);//Change year and month
        System.out.println(dateTime1);
        System.out.println(dateTime2);

    }

}
