package com.sipriano.enumeration;

public class AdvancedPriorityEnumTest {

    public static void main(String[] args) {
        for (AdvancedPriorityEnum ape : AdvancedPriorityEnum.values()) {
            System.out.println("Name: " + ape.name() + ", Ordinal: " + ape.ordinal() + ", Days: " + ape.getEstimatedCompletionDays());

        }
    }

}
