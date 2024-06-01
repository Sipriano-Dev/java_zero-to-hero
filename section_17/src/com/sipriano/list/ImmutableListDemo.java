package com.sipriano.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {

    public static void main(String[] args) {

        List<Integer> accountNuns = new ArrayList<>();
        accountNuns.add(3535346);
        accountNuns.add(3535344);
        accountNuns.add(3535343);

        accountNuns = Collections.unmodifiableList(accountNuns);

        addTenDollars(accountNuns);

        List<Integer> immutableAccountNuns = List.of(3435555, 1434363, 6346436);
    }

    private static List<Integer> addTenDollars(List<Integer> accountNuns) {

        accountNuns.add(144536);
        for (Integer account : accountNuns) {
            System.out.println("10 Dollars credited to the account num: " + account);
        }
        return accountNuns;

    }

}
