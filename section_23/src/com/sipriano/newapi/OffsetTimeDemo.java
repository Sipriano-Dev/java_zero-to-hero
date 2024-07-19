package com.sipriano.newapi;

import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetTimeDemo {

    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.of(15, 30, 0, 0, ZoneOffset.ofHours(2));
        System.out.println(offsetTime);
        int hours = offsetTime.getHour();
        int minutes = offsetTime.getMinute();
        int seconds = offsetTime.getSecond();
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);

        OffsetTime laterTime = offsetTime.plusHours(2);
        System.out.println(laterTime);
    }

}
