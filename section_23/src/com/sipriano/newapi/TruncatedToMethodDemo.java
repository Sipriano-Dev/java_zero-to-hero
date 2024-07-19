package com.sipriano.newapi;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TruncatedToMethodDemo {

    public static void main(String[] args) {
        //You will see duration not in days, but in hours minutes and seconds, days are converted from hours
        Duration duration = Duration.ofDays(28).plusHours(6).plusMinutes(56).plusSeconds(19);//PT678H56M19S
        //Get only the days, but will show in hours
        Duration daysTruncated = duration.truncatedTo(ChronoUnit.DAYS);//PT672H
        Duration hoursTruncated = duration.truncatedTo(ChronoUnit.HOURS);//PT678H
        Duration minutesTruncated = duration.truncatedTo(ChronoUnit.MINUTES);//PT678H56M

    }

}
