package com.sipriano.legacy;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {

    public static void main(String[] args) {
        //Calendar currentDate = Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2024, Calendar.OCTOBER, 10);
        Date currentDate1 = gregorianCalendar.getTime();
        System.out.println(currentDate1);

        int year = gregorianCalendar.get(Calendar.YEAR);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int date = gregorianCalendar.get(Calendar.DATE);
        int hour = gregorianCalendar.get(Calendar.HOUR_OF_DAY);
        int minutes = gregorianCalendar.get(Calendar.MINUTE);
        int seconds = gregorianCalendar.get(Calendar.SECOND);
        int milliSeconds = gregorianCalendar.get(Calendar.MILLISECOND);

        System.out.printf("Current Date and Time in : %04d-%02d-%02d %02d:%02d:%02d:%04d%n",
                year, month, date, hour, minutes, seconds,milliSeconds);

        gregorianCalendar.set(Calendar.YEAR, 2025);
        System.out.println(gregorianCalendar.get(Calendar.YEAR));

    }

}
