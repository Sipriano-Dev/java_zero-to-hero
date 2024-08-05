package com.sipriano.method.reference;

public class StaticMethodReference {

    public static void main(String[] args) {
        ArithmeticOperations operation = (a,b) -> {
            int sum = a + b;
            System.out.println(sum);
            return sum;
        };

        operation.performOperations(2, 3);
        ArithmeticOperations methodReference = StaticMethodReference::performAddition;
        methodReference.performOperations(2, 3);

    }

    public static int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

}
