package com.sipriano.enumeration;

public class InternalEnumMethodsDemo {

    public static void main(String[] args) {
        for (PriorityEnum priority : PriorityEnum.values()) {
            String name = priority.name();
            int ordinal = priority.ordinal();
            System.out.println(name + "(" + ordinal + ")");
        }

        PriorityEnum low = PriorityEnum.valueOf("LOW");
        System.out.println(low);
        PriorityEnum high = PriorityEnum.values()[2];
        System.out.println(high);
    }

}
