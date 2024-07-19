package com.sipriano.newapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {

    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Australia/Melbourne");
        ZoneId destZone = ZoneId.of("America/Fortaleza");

        ZonedDateTime australiaDateTime = ZonedDateTime.now(zone);
        ZonedDateTime americaDateTime = australiaDateTime.withZoneSameInstant(destZone);

        System.out.println(australiaDateTime);
        System.out.println(americaDateTime);

        //ZoneOffset offset = ZoneOffset.ofHoursMinutes(5,30);
        ZoneOffset offset = ZoneOffset.ofHours(2);
        ZoneOffset destOffset = ZoneOffset.ofHours(-8);

        ZonedDateTime utc2DateTime = ZonedDateTime.now(offset);
        ZonedDateTime utcDestDateTime = australiaDateTime.withZoneSameInstant(destOffset);

        System.out.println(utc2DateTime);
        System.out.println(utcDestDateTime);


    }

}
