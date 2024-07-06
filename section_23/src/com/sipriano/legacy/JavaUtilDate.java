package com.sipriano.legacy;

import java.util.Date;

public class JavaUtilDate {

    public static void main(String[] args) {
        Date currentDate = new Date();//Current date and time value
        System.out.println(currentDate);

        long timeInMs = currentDate.getTime();
        System.out.println(timeInMs);

        Date futureDate = new Date(160, 9, 14);//1900 + 160, month -1
        Date futureDateTime = new Date(160, 9, 14, 8, 14, 34);
        System.out.println(futureDateTime);//Thu Oct 14 00:00:00 BRT 2060

        /*
        In computing, an epoch is a fixed date and time used as a reference from
        which a computer measures system time.
         */
    }

}
