package com.sipriano.newapi;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdListDemo {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        for (String id : allZoneIds) {
            System.out.println(id);
        }
    }

}
