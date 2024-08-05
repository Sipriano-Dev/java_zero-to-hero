package com.sipriano.method.reference;

public class InstanceMethodReference {

    public static void main(String[] args) {
        ArithmeticOperations operation = (a,b) -> {
            int sum = a + b;
            System.out.println(sum);
            return sum;
        };

        operation.performOperations(2, 3);

        InstanceMethodReference imr = new InstanceMethodReference();
        ArithmeticOperations methodReference = imr::performAddition;
        methodReference.performOperations(2, 3);

        ArithmeticOperations methodReferenceSub = imr::performsSubtraction;
        methodReferenceSub.performOperations(10, 5);

    }

    public int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public int performsSubtraction(int a, int b) {
        int diff = a - b;
        System.out.println(diff);
        return diff;
    }

}
