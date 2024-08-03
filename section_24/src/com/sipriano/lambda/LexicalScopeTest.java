package com.sipriano.lambda;

public class LexicalScopeTest {

    public static void main(String[] args) {
        String input = "Hello World";
        //input = "other hello"; you can not use if you change, because will not act like implicit final
        Printer printer = x -> {
            String msg = "Hi"; //You can create local variable in lambda
            System.out.println(x + input);//You can use but can't change, act like implicit final
        };
        printer.print(input);
    }

}
