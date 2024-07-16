package com.sipriano.newapi;

import java.time.*;

public class ofMethodsDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1988, 10, 14);//With number
        LocalDate date2 = LocalDate.of(1988, Month.OCTOBER, 14);//With enum
        LocalTime time = LocalTime.of(16, 30, 10);//Can put seconds
        LocalDateTime dateTime = LocalDateTime.of(2020, 11, 10, 12, 10);//Without seconds
        ZoneId newYorkTimeZone = ZoneId.of("America/New_York");
        ZonedDateTime dateTimeZ = ZonedDateTime.of(2014, 02, 14, 19, 30, 0, 0, newYorkTimeZone);
        LocalDate someDate = LocalDate.ofEpochDay(1000);//1000 days since 1970
        LocalDate dayYear = LocalDate.ofYearDay(2020, 100);

        System.out.println(date);
        System.out.println(date2);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(dateTimeZ);
        System.out.println(someDate);
        System.out.println(dayYear);

    }

}
