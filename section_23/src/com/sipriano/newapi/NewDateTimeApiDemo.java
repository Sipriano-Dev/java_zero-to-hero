package com.sipriano.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class NewDateTimeApiDemo {

    public static void main(String[] args) {
        LocalDate dateOnly = LocalDate.now();
        LocalTime timeOnly = LocalTime.now();
        LocalDateTime dateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeZ = ZonedDateTime.now();

        System.out.println(dateOnly);
        System.out.println(timeOnly);
        System.out.println(dateAndTime);
        System.out.println(dateAndTimeZ);
    }

}
