package com.sipriano.legacy;

import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

public class TimeZoneIDsList {

    public static void main(String[] args) {
        List<String> timeZoneIds = Arrays.asList(TimeZone.getAvailableIDs());
        for (String id : timeZoneIds) {
            System.out.println(id);
        }
    }

}
