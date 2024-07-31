package com.sipriano.lambda;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Integer> getCurrentMonth = () -> LocalDate.now().getMonthValue();
        System.out.println(getCurrentMonth.get());

        Supplier<String> getCurrentDay = () -> LocalDate.now().getDayOfWeek().name();
        System.out.println(getCurrentDay.get());
    }

}
