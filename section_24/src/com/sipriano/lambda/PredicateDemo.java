package com.sipriano.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

        System.out.println(isEven.negate().test(63)); // true

        Predicate<Integer> isOdd = Predicate.not(isEven);
        System.out.println(isOdd.test(4)); // false

        Predicate<String> checkEquality = Predicate.isEqual("Eazy Bytes");
        System.out.println(checkEquality.test("Eazy Bytes")); // true

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenList);

    }

}
