package com.sipriano.lambda;

public class ThisDemo {

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();//You can't call getAnonymous with this, have to instantiate
        thisDemo.getLambdaPrinter().print("Lambda Expression");//ThisDemo class
        thisDemo.getAnonymousPrinter().print("Anonymous Inner class");//ThisDemo$1 class
    }

    public Printer getLambdaPrinter() {
        Printer printer = msg -> System.out.println(msg + ":" + this.getClass());//this can't in static
        return printer;
    }

    public Printer getAnonymousPrinter() {
        Printer printer = new Printer() {
            @Override
            public void print(String input) {
                System.out.println(input + ":" + this.getClass());
            }
        };
        return printer;
    }

}
