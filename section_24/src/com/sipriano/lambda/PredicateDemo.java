package com.sipriano.lambda;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> num%2==0;
        System.out.println(isEven.test(16));//True
        System.out.println(isEven.test(13));//False

        Predicate<Integer> isGreaterThan50 = num -> num>50; //You can remove the parentheses
        System.out.println(isGreaterThan50.test(52));//True
        System.out.println(isGreaterThan50.test(42));//False

        //Test 2 conditions
        System.out.println(isEven.and(isGreaterThan50).test(52));//True
        System.out.println(isEven.and(isGreaterThan50).test(40));//False
        System.out.println(isEven.or(isGreaterThan50).test(40));//True

    }

}
