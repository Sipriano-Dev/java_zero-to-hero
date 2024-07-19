package com.sipriano.newapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {

    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Australia/Melbourne");
        ZoneId destZone = ZoneId.of("America/Fortaleza");
        ZonedDateTime australiaDateTime = ZonedDateTime.now(zone);
        ZonedDateTime americaDateTime = australiaDateTime.withZoneSameInstant(destZone);

        System.out.println(australiaDateTime);
        System.out.println(americaDateTime);

    }

}
